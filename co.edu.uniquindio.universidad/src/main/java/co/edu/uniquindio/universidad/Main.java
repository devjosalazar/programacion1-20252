package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.Docente;
import co.edu.uniquindio.universidad.model.Estudiante;

public class Main {
    public static void main(String[] args) {
        //Inicializar datos
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pedro");
        estudiante1.setApellido("Perez");
        estudiante1.setEdad(20);
        estudiante1.setNota1(3.0);
        estudiante1.setNota1(4.0);
        estudiante1.setNota1(2.0);
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Ana");
        estudiante2.setApellido("Arias");
        estudiante2.setEdad(23);
        estudiante2.setNota1(2.0);
        estudiante2.setNota1(3.0);
        estudiante2.setNota1(1.0);
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Carlos");
        estudiante3.setApellido("Perez");
        estudiante3.setEdad(20);
        estudiante3.setNota1(3.0);
        estudiante3.setNota1(3.0);
        estudiante3.setNota1(3.0);

        Docente docente = new Docente();
        docente.setNombre("Pedro");
        docente.setApellido("Perez");
        docente.setEdad(40);
        docente.setCorreo("pedro@gmail.com");

        //Llamado a las funciones
        calcularDefinitivaEstudiante(estudiante1, docente);
        calcularDefinitivaEstudiante(estudiante2, docente);
        calcularDefinitivaEstudiante(estudiante3, docente);
    }


    private static void calcularDefinitivaEstudiante(Estudiante estudiante,
                                                     Docente docente) {
        double notaDefinitiva = docente.calcularDefinitivaEstudiante(
                estudiante.getNota1(),
                estudiante.getNota2(),
                estudiante.getNota3());
        System.out.println("Nota definitiva del estudiante: "+estudiante.getNombre()+" = " + notaDefinitiva);
    }

}