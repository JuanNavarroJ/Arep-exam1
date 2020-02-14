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
    private int sumatoria;

    /**
     * Metodo que calcula la sumatoria de todos los elementos de una lista dada
     *
     * @param lista Es la cual queremos calcular 
     * @return Retorna la suma de todos los elementos de la linkedList
     */
    public int calcularSumatoria(int[] lista) {
        sumatoria = 0;
        for (int i = 0; i < lista.length; i++) {
            sumatoria = sumatoria + lista[i];
        }
        return sumatoria;
    }

}
