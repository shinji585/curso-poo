package com.example.StudyJavaFuncional.PaqueteFunction.supplierStutdy;

public class Main {
    public static void main(String[] args) {

        // creamos un objecto de createphones 
        CreatePhones crearTelefono = new CreatePhones();

         // Creamos objetos de diferentes tipos usando la fábrica
        Telefono<Integer> telefonoNormal = crearTelefono.crearTelefono("normal");
        Telefono<Integer> smartphone = crearTelefono.crearTelefono("smartPhone");

        System.out.println("Objeto creado: " + telefonoNormal.getClass().getSimpleName());
        System.out.println("Objeto creado: " + smartphone.getClass().getSimpleName());
    }
}
