package com.example.StudyLibreries;

import java.util.Set;


import javax.swing.JOptionPane;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Validar_Usuario {
    /*
     * cada validacion tiene que tener una clase que contenga el objecto invalido y
     * que ademas de eso busuq elos errores creando un validador una posible
     * solucion y ademas de eso una posible solucion
     */

    private Usuario usuario;

    public void Validador() {
        // creamos el validador
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        // creamos el objecto de errores
        Set<ConstraintViolation<Usuario>> errores = validator.validate(this.usuario);

        // ahora podemos validar y lanzar excepciones dependiendo si estas las encuentra
        // para corregir los errores
        if (!errores.isEmpty()){
            for (ConstraintViolation<Usuario> constraintViolation : errores) {
                JOptionPane.showMessageDialog(null, constraintViolation.getMessage(), "Campo vacio", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nombre registrado exitosamente", "Campo vacio", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
