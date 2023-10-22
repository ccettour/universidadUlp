
package universidadgrupo15.accesoaDatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
  
   
   public void modificarAlumno(Alumno alumno){
   String sql= "UPDATE alumno Set dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ?";
   PreparedStatement ps=null;
   
       try {
           ps= con.prepareStatement(sql);
           ps.setInt(1, alumno.getDni());
           ps.setString(2, alumno.getApellido());
           ps.setString(3, alumno.getNombre());
           ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
           ps.setInt(5, alumno.getIdAlumno());
           int exito= ps.executeUpdate();
           
           if(exito==1){
           JOptionPane.showMessageDialog(null, "Alumno modificado");
           
           }else{
           JOptionPane.showMessageDialog(null, "El alumno no existe");
           }
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
       }
   
   }
   
   
   public void eliminarAlumno(int id){
   String sql="UPDATE alumno SET estado = 0 WHERE idAlumno= ?";
   
       try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           int exito=ps.executeUpdate();
           if(exito==1){
           JOptionPane.showMessageDialog(null, "Alumno eliminado");
           
           }
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumno");
       }
   
   }
   
   public Alumno buscarAlumno(int id){
   String sql="SELECT dni, apellido, nombre, fechaNacimiento FROM alumno WHERE idAlumno=? AND estado=1";
   Alumno alumno=null;    
   try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
           alumno=new Alumno();
           alumno.setIdAlumno(id);
           alumno.setDni(rs.getInt("dni"));
           alumno.setApellido(rs.getString("apellido"));
           alumno.setNombre(rs.getString("nombre"));
           alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
           alumno.setEstado(true);
           }else{
           JOptionPane.showMessageDialog(null, "No existe el alumno");
           }
           ps.close();
           
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos");
       }
   return alumno;
   }
   
   public Alumno buscarAlumnoPorDNI(int dni){
   String sql="SELECT idAlumno , dni, apellido, nombre, fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
   Alumno alumno=null;    
   try {
           PreparedStatement ps=con.prepareStatement(sql);
           ps.setInt(1, dni);
           ResultSet rs=ps.executeQuery();
           if(rs.next()){
           alumno=new Alumno();
           alumno.setIdAlumno(rs.getInt("idAlumno"));
           alumno.setDni(dni);
           alumno.setApellido(rs.getString("apellido"));
           alumno.setNombre(rs.getString("nombre"));
           alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
           alumno.setEstado(true);
           }else{
           JOptionPane.showMessageDialog(null, "No existe el alumno");
           }
           ps.close();
           
       } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos");
       }
   return alumno;
   }
   
   public List<Alumno> ListarAlumnos(){
   String sql="SELECT * FROM alumno WHERE estado = 1";
   ArrayList <Alumno> alumnos=new ArrayList<>();    
   try {
           PreparedStatement ps=con.prepareStatement(sql);
           
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
           Alumno alumno=new Alumno();
           
           alumno.setIdAlumno(rs.getInt("idAlumno"));
           alumno.setDni(rs.getInt("dni"));
           alumno.setApellido(rs.getString("apellido"));
           alumno.setNombre(rs.getString("nombre"));
           alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
           alumno.setEstado(true);
           
           alumnos.add(alumno);
           }
           ps.close();
           
       } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de alumnos");
       }
   return alumnos;
   }
}
