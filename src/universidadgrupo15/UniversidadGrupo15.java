package universidadgrupo15;

import accesoADatos.AlumnoData;
import java.time.LocalDate;
import universidadgrupo15.entidades.Alumno;

public class UniversidadGrupo15 {

    public static void main(String[] args) {
        Alumno alumno = new Alumno(15986523,"Lopez","María",LocalDate.of(1980,4,25),true);
        AlumnoData alu=new AlumnoData();
        alu.guardarAlumno(alumno);
        
        //alu.modificarAlumno(alumno);
        
        // alu.eliminarAlumno(1);
        
        Alumno aluEncontrado = alu.buscarAlumno(2);
        if(aluEncontrado!=null){
            
            System.out.println(aluEncontrado.toString());
        }
    }
    
}
