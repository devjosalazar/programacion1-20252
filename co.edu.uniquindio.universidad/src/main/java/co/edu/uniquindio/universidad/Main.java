package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.Docente;
import co.edu.uniquindio.universidad.model.Estudiante;
import co.edu.uniquindio.universidad.model.Universidad;

public class Main {
    public static void main(String[] args) {
        //Inicializar datos
        Universidad universidad = inicializarDatos();

        Estudiante estudiante = universidad.getListaEstudiantes().get(0);
        estudiante.getOwnedByUniversidad();

    private static void eliminarEstudiante(Universidad universidad) {
    }

    private static void actualizarEstudiante(Universidad universidad) {
    }

    private static void obtenerEstudiante(Universidad universidad) {
    }

    private static Universidad inicializarDatos() {
        Universidad universidad = new Universidad();
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Pedro");
        estudiante1.setApellido("Perez");
        estudiante1.setEdad(20);
        estudiante1.setNota1(3.0);
        estudiante1.setNota1(4.0);
        estudiante1.setNota1(2.0);
        estudiante1.setIdentificacion("1094");
        Estudiante estudiante2 = new Estudiante();
        estudiante2.setNombre("Ana");
        estudiante2.setApellido("Arias");
        estudiante2.setEdad(23);
        estudiante2.setNota1(2.0);
        estudiante2.setNota1(3.0);
        estudiante2.setNota1(1.0);
        estudiante2.setIdentificacion("1095");
        Estudiante estudiante3 = new Estudiante();
        estudiante3.setNombre("Carlos");
        estudiante3.setApellido("Perez");
        estudiante3.setEdad(20);
        estudiante3.setNota1(3.0);
        estudiante3.setNota1(3.0);
        estudiante3.setNota1(3.0);
        estudiante3.setIdentificacion("1096");

        Docente docente = new Docente();
        docente.setNombre("Pedro");
        docente.setApellido("Perez");
        docente.setEdad(40);
        docente.setCorreo("pedro@gmail.com");

        universidad.getListaEstudiantes().add(estudiante1);
        universidad.getListaEstudiantes().add(estudiante2);
        universidad.getListaEstudiantes().add(estudiante3);
        universidad.getListaDocentes().add(docente);

        return universidad;
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