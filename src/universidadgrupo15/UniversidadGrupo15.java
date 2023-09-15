package universidadgrupo15;


import universidadgrupo15.accesoaDatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo15.accesoaDatos.AlumnoData;
import universidadgrupo15.accesoaDatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import universidadgrupo15.accesoaDatos.InscripcionData;
import universidadgrupo15.entidades.Inscripcion;


public class UniversidadGrupo15 {

    public static void main(String[] args) {
        AlumnoData alum = new AlumnoData();
        MateriaData mat = new MateriaData();
        InscripcionData ind = new InscripcionData();
        
        /*
        Alumno alumno = new Alumno(32145687,"Manzanares","Leticia",LocalDate.of(1989,8,25),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(alumno);
        */
        
        //alu.modificarAlumno(alumno);
        // alu.eliminarAlumno(1);
//        Alumno aluEncontrado = alu.buscarAlumnoPorDni(15986523);
//        if(aluEncontrado!=null){
//            System.out.println(aluEncontrado.toString());
//        }
        /*
        mat.guardarMateria(new Materia("Programación 1",1,true));
        mat.guardarMateria(new Materia("Bases de datos",2,true));
        mat.guardarMateria(new Materia("Arquitectura de Computadoras",1,true));
        */
        
        /*
        ind.guardarInscripcion(new Inscripcion(5,alum.buscarAlumno(1),mat.buscarMateria(1)));
        ind.guardarInscripcion(new Inscripcion(8,alum.buscarAlumno(3),mat.buscarMateria(1)));
        ind.guardarInscripcion(new Inscripcion(7,alum.buscarAlumno(1),mat.buscarMateria(3)));
        ind.guardarInscripcion(new Inscripcion(2,alum.buscarAlumno(4),mat.buscarMateria(2)));
        */
      
      //ind.actualizarNota(2, 3, 8);
      //ind.borrarInscripcionMateriaAlumno(1, 2);
       /* for(Alumno a:ind.obtenerAlumnosXMateria(3)){
            System.out.println(a.toString());
        }*/
      
      
//      List<Inscripcion>inscripciones=ind.obtenerInscripciones();
//      for(Inscripcion insc:ind.obtenerInscripciones()){
//          System.out.println(insc.toString());
//      }
      /*for(Materia insc:ind.obtenerMateriasNoCursadas(2)){
          System.out.println(insc.toString());
      }*/
//      ind.guardarInscripcion(ins);
//     Materia ciencias=new Materia("FÃ­sica", 6, true);
//     mat.guardarMateria(ciencias);
//     alum.guardarAlumno(juan);
//     alum.eliminarAlumno(2);
//alum.modificarAlumno(juan);
//alum.guardarAlumno(juan);
//     Alumno alumnoEncontrado=alum.buscarAlumnoPorDNI(44445);
//        System.out.println("nombre: "+alumnoEncontrado);
//      mat.eliminarMateria(1);
//        for(Materia materia:mat.listarMaterias()){
//            System.out.println(materia.getNombre());
//            System.out.println(materia.getAÃ±o());
//        }
    }
    
}
