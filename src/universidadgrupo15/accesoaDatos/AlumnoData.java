
package universidadgrupo15.accesoaDatos;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo15.entidades.Alumno;

public class AlumnoData {
   private Connection con=null;
   
   public AlumnoData(){
   con=Conexion.getConexion();
   }
   
   public void guardarAlumno(Alumno alumno){
   String sql="INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento,estado)"
           + "VALUES (?, ?, ?, ?,?)";
   
       try {
           PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
           ps.setInt(1, alumno.getDni());
           ps.setString(2, alumno.getApellido());
           ps.setString(3, alumno.getNombre());
           ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
           ps.setBoolean(5, alumno.isEstado());
           ps.executeUpdate();
           
           ResultSet rs=ps.getGeneratedKeys();
           if(rs.next()){
           alumno.setIdAlumno(rs.getInt(1));
           JOptionPane.showMessageDialog(null, "Alumno guardado");
           }
           ps.close();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos");
       }
       
       
   }
   
}
