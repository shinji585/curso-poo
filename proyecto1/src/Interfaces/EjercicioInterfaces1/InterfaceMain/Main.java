package Interfaces.EjercicioInterfaces1.InterfaceMain;

import Interfaces.EjercicioInterfaces1.Interfacesserveces.ComidaRapidad;
import java.util.*;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
       // solicitamos los valores
       System.out.print("Ingrese la cantidad de azúcar en su comida (g): ");
       while (!s.hasNextDouble()) {
           System.out.println("⚠️  Error: Debe ingresar un número decimal.");
           s.next();
       }
       double azucar = s.nextDouble();
       s.nextLine(); // Limpieza de buffer

       System.out.print("Ingrese el tipo de comida rápida: ");
       String comidaRapida = s.nextLine();
       while (!comidaRapida.matches("^[A-Za-z ]+$")) { // Aceptamos espacios
           System.out.print("⚠️  Error: Solo letras (sin números ni caracteres especiales).\nReingrese el nombre: ");
           comidaRapida = s.nextLine();
       }

       System.out.print("Ingrese la cantidad de calorías del plato (kcal): ");
       while (!s.hasNextDouble()) {
           System.out.println("⚠️  Error: Debe ingresar un número decimal.");
           s.next();
       }
       double calorias = s.nextDouble();
       s.nextLine();

       System.out.print("Ingrese la cantidad de proteínas (g): ");
       double proteinas = validarNumero();

       System.out.print("Ingrese la cantidad de grasa (g): ");
       double grasa = validarNumero();

       System.out.print("Ingrese la cantidad de carbohidratos (g): ");
       double carbohidratos = validarNumero();

       // Crear objeto
       ComidaRapidad comidaRapidad = new ComidaRapidad(azucar, comidaRapida, calorias, proteinas, grasa, carbohidratos);

       // Mostrar datos de la comida
       System.out.println(comidaRapidad);
       System.out.println("✅  ¿Es saludable?: " + (comidaRapidad.esSaludables() ? "Sí 🥗" : "No 🍔"));
   }

   // Método auxiliar para validar números
   private static double validarNumero() {
       while (!s.hasNextDouble()) {
           System.out.println("⚠️  Error: Debe ingresar un número decimal.");
           s.next();
       }
       double numero = s.nextDouble();
       s.nextLine();
       return numero;
   }
}
