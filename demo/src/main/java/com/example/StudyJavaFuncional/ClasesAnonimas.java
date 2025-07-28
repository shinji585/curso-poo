package com.example.StudyJavaFuncional;

import java.util.*;


public class ClasesAnonimas {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese su nombre: ");
        String nombre = s.nextLine();

        System.out.print("¿Desea recibir un saludo? (true/false): ");
        boolean saludo = s.nextBoolean();
        s.nextLine(); // Limpiar buffer

        if (saludo) {
            InnerClasesAnonimas datos = new InnerClasesAnonimas() {
                @Override
                public void mostrarSaludo() {
                    System.out.println("Hello " + nombre + ", how've you been in your life?");
                }
            };
            datos.mostrarSaludo();
        }

        System.out.print("¿Desea realizar una operación matemática? (true/false): ");
        boolean operacionEstado = s.nextBoolean();
        s.nextLine(); // limpiamos el buffer

        Number resultado = operacionMatematica(operacionEstado);
        if (resultado != null) {
            System.out.println("Resultado final: " + resultado);
        }
    }

    public static Number operacionMatematica(boolean estado) {
        if (estado) {
            System.out.print("Ingrese el primer número: ");
            Number a = s.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            Number b = s.nextDouble();

            System.out.print("""
                ¿Qué operación desea realizar?
                1. Sumar
                2. Restar
                3. Multiplicar
                4. Dividir
                -> """);
            int opcion = s.nextInt();

            interfacePrueba<Number> operaciones = new interfacePrueba<>() {
                @Override
                public Number sumar(Number x, Number y) {
                    return x.doubleValue() + y.doubleValue();
                }

                @Override
                public Number restar(Number x, Number y) {
                    return x.doubleValue() - y.doubleValue();
                }

                @Override
                public Number multiplicar(Number x, Number y) {
                    return x.doubleValue() * y.doubleValue();
                }

                @Override
                public Number dividir(Number x, Number y) {
                    if (y.doubleValue() == 0) return Double.NaN;
                    return x.doubleValue() / y.doubleValue();
                }
            };

            return switch (opcion) {
                case 1 -> operaciones.sumar(a, b);
                case 2 -> operaciones.restar(a, b);
                case 3 -> operaciones.multiplicar(a, b);
                case 4 -> operaciones.dividir(a, b);
                default -> {
                    System.out.println("Opción inválida");
                    yield null;
                }
            };
        }
        return null;
    }
}

// interface generic 
interface interfacePrueba<N extends Number> {
    Number sumar(N a, N b);
    Number restar(N a, N b);
    Number multiplicar(N a, N b);
    Number dividir(N a, N b);
}

// clase abstracta
abstract class InnerClasesAnonimas {
    void mostrarSaludo() {}
    void pedirSaludo(String nombre) {}
}
