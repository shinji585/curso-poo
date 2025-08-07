package com.example.StudyJavaFuncional.PaqueteFunction.supplierStutdy;

import java.util.HashMap;
import java.util.function.Supplier;

public class CreatePhones {
    /*
     * en esta clase creamos los objectos de tipo telefono pero utilizando
     * polimorfismo y supplier<T>
     */
    private static HashMap<String, Supplier<Telefono<Integer>>> MAPA_DE_TELEFONO = new HashMap<>();

    // almacenamos valores estaticos
    static {
        MAPA_DE_TELEFONO.put("normal", () -> new NormalPhone<>());
        MAPA_DE_TELEFONO.put("smartphone", () -> new SmartPhone<>());
    }

    // creamos objectos de tipo telefono en un metodo
    public Telefono<Integer> crearTelefono(String tipo) {
        // transformamos el string a lowercase
        tipo = tipo.toLowerCase().trim();

        // obtenemos el supplier del mapa segun el tipo
        Supplier<Telefono<Integer>> supplier = MAPA_DE_TELEFONO.get(tipo);

        // validamos
        if (supplier != null) {
            return supplier.get();
        } else {
            throw new IllegalArgumentException("Tipo de telefono no valido:  " + tipo);
        }

    }
}
