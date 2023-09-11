package universidadgrupo15;

import accesoADatos.MateriaData;
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
        
        MateriaData mat = new MateriaData();
        for(Materia materia:mat.listarMaterias()){
            System.out.println(materia.getNombre());
            System.out.println(materia.getAño());
        }
    }
    
}
