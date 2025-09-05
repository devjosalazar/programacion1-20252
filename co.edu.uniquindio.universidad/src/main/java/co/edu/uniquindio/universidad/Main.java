package co.edu.uniquindio.universidad;

import co.edu.uniquindio.universidad.model.Docente;

public class Main {
    public static void main(String[] args) {
       
        inicializarDatos();

        calcularDefinitivaEstudiante();
        
        
    }

    private static void calcularDefinitivaEstudiante() {
        double nota1 = 3.0;
        double nota2 = 4.0;
        double nota3 = 5.0;
        Docente docente = new Docente();
        docente.calcularDefinitivaEstudiante(nota1, nota2, nota3);
    }

    private static void inicializarDatos() {

    }
}