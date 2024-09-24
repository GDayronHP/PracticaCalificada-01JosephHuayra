package com.huayra.laboratorio06
import org.junit.Test

class Ejercicio01Kotlin {

    // Declarar la variable booleanValue con el valor false por defecto
    var booleanValue: Boolean = false

    @Test
    // Declarar la función main en la que se ejecutará la aplicación
    fun main(){
        // Declarar en dos variables de tipo string las cadenas que se van a comparar
        val cadena1 = "hello";
        val cadena2 = "world";

        // Asignar en una variable el resultado de la función verifiAnagrama
        val resultado: Boolean = verifAnagrama(cadena1, cadena2);

        // Imprimir el resultado con un formato caracteristico
        if (resultado) {
            //Imprimir la entrada y la salida con las variables obtenidas
            println("Entrada: '${cadena1}', '${cadena2}'")
            println("Salida: ${resultado}")
        } else {
            println("Entrada: '${cadena1}', '${cadena2}'")
            println("Salida: ${resultado}")
        }
    }

    // Declarar la función verifiAnagrama en la que se encuentra la lógica principal
    private fun verifAnagrama(cadena1: String, cadena2: String): Boolean {
        // Reasignar en la variable booleanValue la comparación de las cadenas de texto que han sido convertidas en array y ordenadas
        booleanValue = cadena1.toCharArray().sorted() == cadena2.toCharArray().sorted()
        // Retornar el valor booleano
        return booleanValue;
    }
}