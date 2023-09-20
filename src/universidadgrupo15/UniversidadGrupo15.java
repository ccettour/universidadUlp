package universidadgrupo15;

import universidadgrupo15.accesoaDatos.*;
import universidadgrupo15.entidades.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UniversidadGrupo15 {

    public static void main(String[] args) {
        AlumnoData alum = new AlumnoData();
        MateriaData mat = new MateriaData();
        InscripcionData ind = new InscripcionData();

        /*
         * Alumno alumno = new
         * Alumno(32145687,"Manzanares","Leticia",LocalDate.of(1989,8,25),true);
         * AlumnoData alu=new AlumnoData();
         * alu.guardarAlumno(alumno);
         */

        // alu.modificarAlumno(alumno);
        // alu.eliminarAlumno(1);
        
        /*Alumno aluEncontrado = alu.buscarAlumnoPorDni(15986523);
        if(aluEncontrado!=null){
            
            System.out.println(aluEncontrado.toString());
        }*/
        

//     Alumno juan=new Alumno(12323,"Luna","Pedro",LocalDate.of(2012,4,23),true);
      
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
