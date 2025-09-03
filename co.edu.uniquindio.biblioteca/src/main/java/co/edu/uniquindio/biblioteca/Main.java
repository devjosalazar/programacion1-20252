package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Biblioteca;
import co.edu.uniquindio.biblioteca.model.Cliente;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = inicializarDatos();

        int opcion = 0;
        do {
            mostrarMenu();
            opcion = leerEntero("Ingrese la opción del menú");
            switch (opcion) {
                case 1:
                    String resultado = crearCliente(biblioteca);
                    System.out.println("Información del cliente: "+resultado);
                    break;
                case 2:
                    Cliente cliente = obtenerCliente(biblioteca);
                    int edad = leerEntero("Ingrese la edad del cliente a validar");
                    String resultadoValidacion = validarEdadCliente(cliente, edad);
                    System.out.println("Resultado de la operación: "+resultadoValidacion);
                    break;
                case 3:

                    break;
                default:
                    break;
            }
        } while (opcion != 4);
    }

    private static String validarEdadCliente(Cliente cliente, int edad) {
        if(cliente != null){
            if(cliente.getEdad() == edad) {
                return "La edad del cliente es valida";
            }else{
                return "La edad del cliente no es valida";
            }
        }else{
            return "No se puede validar, el cliente no existe";
        }
    }

    private static Cliente obtenerCliente(Biblioteca biblioteca) {
        String idCliente = leerStringConsola("Ingrese el id del cliente a buscar");
        Cliente clienteEncontrado = null;
        for(int i=0; i<biblioteca.getListaClientes().size();i++){
            if(biblioteca.getListaClientes().get(i).getId().equals(idCliente)){
                clienteEncontrado = biblioteca.getListaClientes().get(i);
                break;
            }
        }

        return clienteEncontrado;
    }

    private static Biblioteca inicializarDatos() {
        //Crear la biblioteca
        Biblioteca biblioteca = new Biblioteca("UQ");
        //Crear el cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Juan");
        cliente.setId("1094");
        cliente.setTelefono("87676768");
        cliente.setEdad(30);
        biblioteca.getListaClientes().add(cliente);

        return biblioteca;
    }


    public static String crearCliente(Biblioteca biblioteca) {
        //1.Capturar los datos del cliente
        String nombre = leerStringConsola("Ingrese el nombre del cliente");
        String id = leerStringConsola("Ingrese el Id de cliente");
        String telefono = leerStringConsola("Ingrese el telefono de cliente");
        //2. Crear la instancia del cliente
        Cliente cliente = new Cliente();
        //3. Agregar los datos capturados al cliente
        cliente.setNombre(nombre);
        cliente.setId(id);
        cliente.setTelefono(telefono);
        biblioteca.getListaClientes().add(cliente);
        //4. retornar respuesta
        return cliente.toString();
    }

    private static int leerEntero(String mensaje) {
        int dato = 0;
        String captura = "";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        dato = Integer.parseInt(captura);
        return dato;
    }

    public static String leerStringConsola(String mensaje)
    {
        String captura="";
        System.out.println(mensaje);
        Scanner teclado = new Scanner(System.in);
        captura = teclado.nextLine();
        return captura;
    }

    public static void mostrarMenu() {
        System.out.println("Opciones disponibles:");
        System.out.println("1 - Crear Cliente");
        System.out.println("2 - Validar edad del cliente");
        System.out.println("3 - Crear libro");
        System.out.println("4 - Salir");
    }
}




