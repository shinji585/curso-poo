package com.example.StudyLibreries;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 * by @shinji585
 */

// generamos los metodos necesarios para poder utilizar lo que seria los atributo de la entidad 
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Usuario {

    /*
     * la libreria de jakarta validator nos sirve para procesar errores dependiendo
     * de unas condiciones que nosotros le demos sin tener que utilizar if else o
     * try-catch y estos errores solo deben ser procesados si surgen esto nos ayuda
     * a reducir las lineas de codigo como tal no es una libreria si no un framework
     * algo a tener en cuenta
     * 
     * Las categorias que podemos encontrar son:
     * 
     * | Categoría | Descripción breve | Ejemplos anotaciones |
     * | ------------------------------- |
     * --------------------------------------------------- |
     * ----------------------------------------------------------------------- |
     * | **Validaciones básicas** | Verifican condiciones simples sobre atributos |
     * `@NotNull`, `@NotEmpty`, `@NotBlank` |
     * | **Validaciones numéricas** | Validan rangos, valores mínimos, máximos,
     * positivos | `@Min`, `@Max`, `@Positive`, `@PositiveOrZero` |
     * | **Validaciones de texto** | Validan tamaño, formato, patrones | `@Size`,
     * `@Pattern`, `@Email` |
     * | **Validaciones booleanas** | Verifican que un booleano sea true o false |
     * `@AssertTrue`, `@AssertFalse` |
     * | **Validaciones temporales** | Validan fechas y tiempos pasados o futuros |
     * `@Past`, `@PastOrPresent`, `@Future`, `@FutureOrPresent` |
     * | **Validaciones de colección** | Validan elementos dentro de colecciones |
     * Se pueden usar anotaciones en tipos genéricos: `List<@NotBlank String>` |
     * | **Validaciones personalizadas** | Crear tus propias reglas (más avanzado) |
     * Crear anotaciones propias usando interfaces y validadores |
     * 
     * 
     * en el dia de hoy en esta clase se estara estudiando las validaciones basicas estas constan de las anotaciones: @notnull @notempty @notblank 
     */

     // la anotacion @Notnull nos ayuda a verificar que el campo de un atributo no este vacio es decir cualquier cosa que queremos que obligatoriamente contenga informacion en los atributos declarados abajo por ejemplo queremos que tanto enmail como nombre contengan lo que seria informacion y no este vacion

    @NotNull(message = "el email no debe estar vacio")
    private String email;
    @NotNull(message = "el nombre no puede estar vacio")
    private String nombre;

    // el @NotNull define que los campos (atributos) no pueden estar vacios y que lanza un mensaje si la validacion falla indicandole a el usuario que ingreso algo mal
    
    //las anotaciones `@NotEmpty`, `@NotBlank`  nos sirven cada una con un proposito diferente la notacion @NotEmpty sirve para que datos compuestos no este vacios es decir que no se aceptan ceros elementos o ceros caracteres mientras que la anotacion @NotBlank es utilizada unicamente en Strings y es utilizadas para validar que una String no sea null, "" o " " (solo espacios) 
}
