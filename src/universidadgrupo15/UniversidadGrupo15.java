package universidadgrupo15;

import universidadgrupo15.accesoaDatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo15.accesoaDatos.AlumnoData;
import universidadgrupo15.entidades.Alumno;
public class UniversidadGrupo15 {

    public static void main(String[] args) {
        
     Alumno juan=new Alumno(12323,"Luna","Pedro",LocalDate.of(2012,4,23),true);
     AlumnoData alum=new AlumnoData();
//     alum.guardarAlumno(juan);
     alum.eliminarAlumno(1);
    }
    
}
