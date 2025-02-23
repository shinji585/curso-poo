package FinalProyect.Main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import FinalProyect.Service.Admi;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // creamos lo que seria un metodo para solicitar la accion a realizar
        int accion = 0;
        Accion();
        do {
            accion = s.nextInt();
            s.nextLine();
            switch (accion) {
                case 1 -> {
                    System.out.print("ingrese el tipo de cuenta que quiere generar (solo ingrese user o admi): ");
                    String valor = s.nextLine();
                    // validamos los tipos de datos
                    if (valor.equalsIgnoreCase("admi")) {
                        System.out.print("ingrese la cantidad de cuentas que desea generar: ");
                        int numero = s.nextInt();

                        // creamos una matriz que sea igual a la cantidad de datos que queremos ingresar 
                        Admi[][] administradores = new Admi[numero][numero];
                        for (int i = 0; i < administradores.length; i++) {
                            for (int j = 0; j < administradores[i].length; j++) {
                                administradores[i][j] = new Admi();
                                // llenamos la matriz con los datos que nos solicitan 
                                System.out.print("Ingrese el nombre del administrador: ");
                                administradores[i][j].setName(s.nextLine());
                                s.nextLine();
                                System.out.print("ingrese la key del administrador: ");
                                administradores[i][j].setKey(s.nextLine());
                            }
                        }
                        // ahora que tenemos los datos llenos pasamos a convertirlos a un tipo de archivo para que estos se almacene en otro formato y asi poder validarlos en un futuro 
                        // generamos un try-catch
                        try (FileOutputStream output = new FileOutputStream("datos.dat")) {
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(output);
                            // pasamos el vector a lo que seria el objectoutputStrem
                            objectOutputStream.writeObject(administradores);
                            System.out.println("el vector se ha serializado correctamente");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }

                    }else if  (valor.equalsIgnoreCase("user")){

                    }

                    // creamos lo que seria una matriz de tipo de dato que se quiere generar

                }
            }
        } while (accion != 3);
    }

    public static void Accion() {
        System.out.println("----ingrese la accion a realizar----");
        System.out.println("\t1 para generar cuenta");
        System.out.println("\t2 para validar contraseña");
        System.out.println("\t3 para salir");
        System.out.print("ingrese la accion: ");
    }
}
