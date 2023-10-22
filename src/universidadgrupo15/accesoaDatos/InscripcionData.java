package universidadgrupo15.accesoaDatos;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Inscripcion;
import universidadgrupo15.entidades.Materia;


public class InscripcionData {
     private Connection con = null;
     private MateriaData mateData=new MateriaData();
     private AlumnoData aluData=new AlumnoData();
     
     public InscripcionData(){
     con=Conexion.getConexion();
     }
     
     public void guardarInscripcion(Inscripcion insc){
     String sql="INSERT INTO inscripcion (nota, Idalumno, Idmateria) VALUES (?, ?, ?)";
         try {
             PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             ps.setInt(1, insc.getNota());
             ps.setInt(2, insc.getAlumno().getIdAlumno());
             ps.setInt(3, insc.getMateria().getIdMateria());
             ps.executeUpdate();
             ResultSet rs=ps.getGeneratedKeys();
             if (rs.next()) {
                 insc.setIdInscripcion(rs.getInt(1));
                 JOptionPane.showMessageDialog(null, "Inscripción exitosa");
             }
             ps.close();
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
         }
     }
     
     
    public List<Inscripcion> obtenerInscripciones(){
    List <Inscripcion> inscripciones= new ArrayList<>();      
    String sql="SELECT `IdInscripto`, `nota`, `Idalumno`, `Idmateria` FROM inscripción";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             Inscripcion in= new Inscripcion();
             in.setIdInscripcion(rs.getInt("IdInscripto"));
             in.setNota(rs.getInt("nota"));
             in.setAlumno(aluData.buscarAlumno(rs.getInt("Idalumno")));
             in.setMateria(mateData.buscarMateria(rs.getInt("Idmateria")));
             inscripciones.add(in);
             }
             ps.close();
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
         }
         return inscripciones;
    } 
    public List <Inscripcion> obtenerInscripcionesPorAlumno(int id){
    List <Inscripcion> inscripciones=new ArrayList<>();
    String sql="SELECT `IdInscripto`, `nota`, `Idalumno`, `Idmateria` FROM `inscripcion` WHERE Idalumno = ?";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             Inscripcion in= new Inscripcion();
             in.setIdInscripcion(rs.getInt("IdInscripto"));
             in.setNota(rs.getInt("nota"));
             in.setAlumno(aluData.buscarAlumno(rs.getInt("Idalumno")));
             in.setMateria(mateData.buscarMateriasTodas(rs.getInt("Idmateria")));
             inscripciones.add(in);
             }
             ps.close();
         } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null, "Error al acceder a la tabla de inscripciones");
         }
         return inscripciones;
    }
    
    public List<Materia> obtenerMateriasCursadas(int id){
    List<Materia> materias= new ArrayList<>();
    String sql="SELECT inscripcion.Idmateria, nombre, año FROM `inscripcion` "
            + "JOIN materia ON inscripcion.Idmateria=materia.IdMateria WHERE inscripcion.Idalumno=?";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             Materia materia=new Materia();
             materia.setIdMateria(rs.getInt("Idmateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAño(rs.getInt("año"));
             materia.setEstado(true);
             materias.add(materia);
             }
             ps.close();
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de inscripciones");
         }
         return materias;
    }
    
    public List<Materia> obtenerMateriasNoCursadas(int id){
    List<Materia> materias= new ArrayList<>();
    String sql="SELECT * FROM `materia` WHERE estado=1 and Idmateria NOT IN " 
            + "(SELECT Idmateria FROM inscripcion where Idalumno = ?)";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, id);
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
             Materia materia=new Materia();
             materia.setIdMateria(rs.getInt("Idmateria"));
             materia.setNombre(rs.getString("nombre"));
             materia.setAño(rs.getInt("año"));
             materia.setEstado(true);
                 
             materias.add(materia);
             }
             ps.close();
         } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al conectarse a la tabla de inscripciones");
         }
         return materias;
    }
    
    public void actualizarNota(int idAlumno, int idMateria, int nota){
        
        String sql="UPDATE inscripcion SET nota=? WHERE Idalumno=? AND Idmateria=?";
         try {
             PreparedStatement ps=con.prepareStatement(sql);
             ps.setInt(1, nota);
             ps.setInt(2, idAlumno);
             ps.setInt(3, idMateria);
             
             int exito=ps.executeUpdate();
             if(exito==1){
                 JOptionPane.showMessageDialog(null, "Nota actualizada");
             }
             
             ps.close();
         
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla inscripción");
         }
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
        String sql="DELETE FROM inscripcion WHERE Idalumno=? AND Idmateria=?";
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idAlumno);
             ps.setInt(2, idMateria);
             
             int exito=ps.executeUpdate();
             if(exito>0){
                 JOptionPane.showMessageDialog(null, "Inscripción eliminada");
             }
             
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "No se puede conectar a la tabla inscripcion");
         }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        String sql="SELECT al.IdAlumno,dni,apellido,al.nombre,fechaNacimiento, al.estado "
                + "FROM alumno AS al JOIN inscripcion "
                + "ON al.IdAlumno=inscripcion.Idalumno "
                + "WHERE inscripcion.Idmateria=? AND al.estado=1;";
        
         try {
             PreparedStatement ps = con.prepareStatement(sql);
             ps.setInt(1, idMateria);
             
             ResultSet rs=ps.executeQuery();
             while(rs.next()){
                 Alumno alumno = new Alumno();
                 
                 alumno.setIdAlumno(rs.getInt("IdAlumno"));
                 alumno.setDni(rs.getInt("dni"));
                 alumno.setApellido(rs.getString("apellido"));
                 alumno.setNombre(rs.getString("nombre"));
                 alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
                 alumno.setEstado(true);
                 
                 alumnos.add(alumno);
             }
             
             ps.close();
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla");
         }
        
         return alumnos;
    }
}
