package universidadgrupo15;


import universidadgrupo15.accesoaDatos.Conexion;
import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo15.accesoaDatos.AlumnoData;
import universidadgrupo15.accesoaDatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;

import java.time.LocalDate;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;

public class UniversidadGrupo15 {

    public static void main(String[] args) {
        /*
        //Alumno alumno = new Alumno(15986523,"Lopez","María",LocalDate.of(1980,4,25),true);
        AlumnoData alu=new AlumnoData();
        //alu.guardarAlumno(alumno);
        
        //alu.modificarAlumno(alumno);
        
        // alu.eliminarAlumno(1);
        
        Alumno aluEncontrado = alu.buscarAlumnoPorDni(15986523);
        if(aluEncontrado!=null){
            
            System.out.println(aluEncontrado.toString());
        }*/
        

//     Alumno juan=new Alumno(12323,"Luna","Pedro",LocalDate.of(2012,4,23),true);
     AlumnoData alum=new AlumnoData();  
      MateriaData mat = new MateriaData();
//     Materia ciencias=new Materia("Ciencias Sociales", 2001, true);
//     mat.guardarMateria(ciencias);
//     alum.guardarAlumno(juan);
//     alum.eliminarAlumno(2);
//alum.modificarAlumno(juan);
//alum.guardarAlumno(juan);
//     Alumno alumnoEncontrado=alum.buscarAlumnoPorDNI(44445);
//        System.out.println("nombre: "+alumnoEncontrado);
      
        for(Materia materia:mat.listarMaterias()){
            System.out.println(materia.getNombre());
            System.out.println(materia.getAño());
        }
    }
    
}
