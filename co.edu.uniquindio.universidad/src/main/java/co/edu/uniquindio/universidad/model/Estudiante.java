package co.edu.uniquindio.universidad.model;

public class Estudiante {

    private String nombre;
    private String apellido;
    private int edad;
    private double nota1;
    private double nota2;
    private double nota3;
    private Universidad ownedByUniversidad;

    public Estudiante() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Universidad getOwnedByUniversidad() {
        return ownedByUniversidad;
    }

    public void setOwnedByUniversidad(Universidad ownedByUniversidad) {
        this.ownedByUniversidad = ownedByUniversidad;
    }
}
