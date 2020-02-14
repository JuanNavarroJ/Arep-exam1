/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuealing.arep.calculadora;


/**
 * Clase calculadora que representa una calculadora estadistica basica la cual
 * permite obtener la media y desviacion estandar.
 *
 * @author Juan David
 */
public class Calculadora {

    //Atributos
    private double sumatoria;

    public Calculadora() {
    }

    /**
     * Metodo que calcula la sumatoria de todos los elementos de la linkedList
     *
     * @param lista Es la linkedList donde esta la informacion que se va a
     * analizar.
     * @return Retorna la suma de todos los elementos de la linkedList
     */
    public double calcularSumatoria(Double[] lista) {
        sumatoria = 0;
        for (int i = 0; i < lista.length; i++) {
            sumatoria = sumatoria + lista[i];
        }
        return sumatoria;
    }

}
