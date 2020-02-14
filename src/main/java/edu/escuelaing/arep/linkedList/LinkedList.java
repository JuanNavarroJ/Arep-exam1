/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.linkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase linkedList es una representacion propia de una LinkedList con las funciones basicas para lograr el objetivo del programa.
 * @author Juan David
 */
public class LinkedList implements List<Nodo> {

    //Atributos
    private int size;
    private Nodo nodoPrimero;
    private Nodo nodoUltimo;

    public LinkedList() {
        this.size = 0;
    }

    /**
     * Metodo que permite obtener el tamaño de la linked list
     *
     * @return Retorna el tamaño de la lista
     */
    public int size() {
        return size;
    }

    /**
     * Metodo que permite obtener el numero que se encuentra en un indece dado.
     *
     * @param index Es el indice en el cual se quiere buscar dentro de la linked
     * list.
     * @return Retorna el numero ubicado en el indice dado.
     */
    public Nodo get(int index) {
        Nodo buscar = nodoPrimero;
        boolean encontrado = false;
        while (!encontrado) {
            if (buscar.getPosicion() == index) {
                encontrado = true;
            } else {
                buscar = buscar.getSiguiente();
            }
        }
        return buscar;
    }

    /**
     * Metodo que permite obtener el Nodo llamado cabeza de la linkedList.
     *
     * @return Retorna Retorna el nodo cabeza de la linkedList.
     */
    public Nodo getPrimerNodo() {
        return nodoPrimero;
    }

    /**
     * Metodo que permite obtener el Nodo llamado cola de la linkedList.
     *
     * @return Retorna el nodo cola de la linkedList.
     */
    public Nodo getUltimoNodo() {
        return nodoUltimo;
    }

    /**
     * Metodo que permite agregar un nodo a la linkedList.
     *
     * @param nodo Es el nodo que se quiere agregar a la linkedList.
     * @return Retorna Si fue posible agregar el nodo a la linkedList.
     */
    public boolean add(Nodo nodo) {
        if (nodoPrimero == null) {
            nodoPrimero = nodo;
            nodoUltimo = nodo;
            nodo.setPosicion(size);
            size += 1;

        } else {
            nodoUltimo.setSiguiente(nodo);
            nodo.setAnterior(nodoUltimo);
            nodo.setPosicion(size);
            nodoUltimo = nodo;
            size += 1;
        }
        return true;
    }

    /**
     * Metodo que permite consultar si la linkedList esta vacia.
     *
     * @return Retorna true si la lista esta vacia y false de lo contrario.
     */
    public boolean isEmpty() {
        boolean isEmpty = true;
        if (size >= 0) {
            isEmpty = false;
        }
        return isEmpty;
    }

    /**
     * Metodo que permite remover un nodo de la linkedList segun su posicion en
     * ella.
     *
     * @param index Es el indice que indica la posicion del nodo en la
     * linkedList.
     * @return Retorna el nodo que va a hacer removido de la linkedList.
     */
    public Nodo remove(int index) {
        Nodo nodoRemove = nodoPrimero;
        boolean encontrado = false;
        while (!encontrado) {
            if (nodoRemove.getPosicion() == index) {
                encontrado = true;
            } else {
                nodoRemove = nodoRemove.getSiguiente();
            }
        }
        remove(nodoRemove);
        return nodoRemove;

    }

    /**
     * Metodo que permite remover un nodo de la linkedList.
     *
     * @param nodo Es el nodo que se quiere eliminar.
     */
    public void remove(Nodo nodo) {
        Nodo tempAnterior = nodo.getAnterior();
        Nodo tempSiguiente = nodo.getSiguiente();
        tempAnterior.setSiguiente(tempSiguiente);
        tempSiguiente.setAnterior(tempAnterior);
        if (nodo.equals(nodoPrimero)) {
            nodoPrimero = null;
        } else if (nodo.equals(nodoUltimo)) {
            nodoUltimo = nodo.getAnterior();
        }
        if (size > 0) {
            size -= 1;
        }
    }
    
    public void clear() {
        nodoPrimero = null;
        nodoUltimo = null;
        size = 0;
    }

    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Iterator<Nodo> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean addAll(int index, Collection<? extends Nodo> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Nodo set(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void add(int index, Nodo element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ListIterator<Nodo> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Nodo> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
