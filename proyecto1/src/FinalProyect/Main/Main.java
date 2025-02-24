package FinalProyect.Main;

import java.io.*;
import java.util.*;

import FinalProyect.Service.Admi;
import FinalProyect.Service.User;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int accion;
        do {
            Accion();
            accion = s.nextInt();
            s.nextLine(); // Consumir el salto de línea

            switch (accion) {
                case 1 -> generarCuenta();
                case 2 -> validarContraseña();
                case 3 -> System.out.println("Saliendo del sistema. ¡Hasta luego!");
                default -> System.out.println("Error desconocido. El programa se ejecutará de nuevo...");
            }
        } while (accion != 3);
    }

    public static void generarCuenta() {
        System.out.print("Ingrese el tipo de cuenta que quiere generar (user o admi): ");
        String tipoCuenta = s.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de cuentas que desea generar: ");
        int cantidad = s.nextInt();
        s.nextLine(); // Consumir el salto de línea

        if (tipoCuenta.equals("admi")) {
            Admi[] administradores = new Admi[cantidad];
            for (int i = 0; i < cantidad; i++) {
                administradores[i] = new Admi();
                System.out.print("Ingrese el nombre del administrador: ");
                administradores[i].setName(s.nextLine());
                System.out.print("Ingrese la clave del administrador: ");
                administradores[i].setKey(s.nextLine());
            }

            guardarDatos(administradores);
            System.out.println("Los datos de los administradores han sido guardados correctamente.");
        } else if (tipoCuenta.equals("user")) {
            User[] users = new User[cantidad];
            for (int i = 0; i < cantidad; i++) {
                users[i] = new User();
                System.out.print("Ingrese el nombre del usuario: ");
                users[i].setName(s.nextLine());
                System.out.print("Ingrese la clave del usuario: ");
                users[i].setKey(s.nextLine());
                System.out.print("Ingrese el monto inicial del depósito: ");
                users[i].setDeposito(s.nextDouble());
                s.nextLine(); // Consumir el salto de línea
            }

            guardarDatos(users);
            System.out.println("Los datos de los usuarios han sido guardados correctamente.");
        } else {
            System.out.println("Tipo de cuenta inválido.");
        }
    }

    public static void validarContraseña() {
        informacion();
        int op = s.nextInt();
        s.nextLine(); // Consumir el salto de línea

        if (op == 1) {
            System.out.println("Validación de administrador aún no implementada.");
        } else if (op == 2) {
            User[] users = leerDatos();
            if (users == null) {
                System.out.println("No hay datos de usuarios almacenados.");
                return;
            }

            System.out.print("Ingrese el usuario: ");
            String usuario = s.nextLine();
            System.out.print("Ingrese la clave: ");
            String clave = s.nextLine();

            boolean encontrado = false;
            for (User user : users) {
                if (user.Validar(usuario, clave)) {
                    System.out.println("¡Acceso concedido! Puedes realizar nuevas acciones.");
                    CambiarDatos();
                    boolean eleccion = s.nextBoolean();
                    if (eleccion == true){
                       System.out.println("digite su nuevo usuario: ");
                       String useString = s.nextLine();
                       System.out.println("digite su nueva contraseña: ");
                       String keyString = s.nextLine();
                     user.CambiarDatos(useString, keyString);  
                    }else{
                        System.out.println("geacias por utilizar el programa: ");
                    }
                    encontrado = true;
                    break;
                }
            }

            if (!encontrado) {
                System.out.println("Usuario o clave incorrectos. Inténtelo de nuevo.");
            }
        } else {
            System.out.println("Opción inválida.");
        }
    }

    public static void guardarDatos(Object data) {
        try (FileOutputStream fileOut = new FileOutputStream("datos.dat");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(data);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos.");
            e.printStackTrace();
        }
    }

    public static User[] leerDatos() {
        try (FileInputStream fileIn = new FileInputStream("datos.dat");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            return (User[]) objectIn.readObject();
        } catch (IOException | ClassNotFoundException | ClassCastException e) {
            System.out.println("Error al leer los datos o los datos no son válidos.");
            return null;
        }
    }

    public static void Accion() {
        System.out.println("---- Seleccione la acción a realizar ----");
        System.out.println("1 - Generar cuenta");
        System.out.println("2 - Validar contraseña");
        System.out.println("3 - Salir");
        System.out.print("Ingrese su opción: ");
    }

    public static void informacion() {
        System.out.println("Ha seleccionado la opción de validación de contraseña.");
        System.out.println("1 - Validar administrador");
        System.out.println("2 - Validar usuario");
        System.out.print("Seleccione la opción: ");
    }
    public static void CambiarDatos(){
        System.out.println("Ahora usted puede cambiar datos si lo desea...");
        System.out.println("ingrese true or false si desea cambiar datos\nSi ingresa true el programa le permitira cambiar informacion\nSi ingresa 2 el programa se saldra de la seccion en la que esta");
        System.out.print("ingrese su opcion: ");
    }
}
