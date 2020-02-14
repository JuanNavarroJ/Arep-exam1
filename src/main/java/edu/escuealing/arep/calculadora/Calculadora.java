/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuealing.arep.calculadora;

import edu.escuelaing.arep.linkedList.LinkedList;

/**
 * Clase calculadora que representa una calculadora estadistica basica la cual
 * permite obtener la media y desviacion estandar.
 *
 * @author Juan David
 */
public class Calculadora {

    //Atributos
    private static LinkedList lista;
    private double media;
    private double dEstandar;
    private double sumatoria;
    private double sumatoriaDEstandar;

    public Calculadora() {
        lista = new LinkedList();
    }

    /**
     * Metodo que calcula la sumatoria de todos los elementos de la linkedList
     *
     * @param lista Es la linkedList donde esta la informacion que se va a
     * analizar.
     * @return Retorna la suma de todos los elementos de la linkedList
     */
    private double calcularSumatoria(LinkedList lista) {
        sumatoria = 0;
        for (int i = 0; i < lista.size(); i++) {
            sumatoria = sumatoria + lista.get(i).getValor();
        }
        return sumatoria;
    }

    /**
     * Metodo que permite calcular la sumatoria de la diferencia entre cada
     * elemento de la linkedList y su media al cuadrado.
     *
     * @param lista Es la linkedList donde esta la informacion que se va a
     * analizar.
     * @return Retorna la sumatoria de la diferencia entre cada elemento de la
     * linkedList y su media al cuadrado.
     */
    private double calcularSumatoriaDEstandar(LinkedList lista) {
        sumatoriaDEstandar = 0;
        for (int i = 0; i < lista.size(); i++) {
            sumatoriaDEstandar = sumatoriaDEstandar + Math.pow(lista.get(i).getValor() - media, 2);
        }
        return sumatoriaDEstandar;
    }

    /**
     * Metodo que permite el calcular la media de los valores dados.
     *
     * @param lista Es la linkedList donde esta la informacion que se va a
     * analizar.
     * @return Retorna la media de los valores dados.
     */
    public double calcularMedia(LinkedList lista) {
        media = 0;
        media = calcularSumatoria(lista) / lista.size();
        media = Math.round(media * 100.0) / 100.0;
        return media;
    }

    /**
     * Metodo que permite calcular la desviacion estandar de los valores dados.
     *
     * @param lista Es la linkedList donde esta la informacion que se va a
     * analizar.
     * @return Retorna la desviacion estandar de los valores dados.
     */
    public double calcularDesviacionEstandar(LinkedList lista) {
        dEstandar = 0;
        calcularMedia(lista);
        calcularSumatoriaDEstandar(lista);
        dEstandar = Math.sqrt(sumatoriaDEstandar / (lista.size() - 1));
        dEstandar = Math.round(dEstandar * 100.0) / 100.0;
        return dEstandar;
    }

    
    
    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
