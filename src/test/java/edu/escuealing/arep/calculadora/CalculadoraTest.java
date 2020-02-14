/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuealing.arep.calculadora;


import edu.escuelaing.arep.linkedList.LinkedList;
import edu.escuelaing.arep.linkedList.Nodo;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 *
 * @author Juan David
 */
public class CalculadoraTest {

    @Test
    public void deberiaSacarMedia() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        
        Nodo n1 = new Nodo(186.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(699.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(132.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(272.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(291.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(331.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(199.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1890.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(788.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1601.0,0,null,null);
        lista.add(n10);
        
        assertTrue(cal.calcularMedia(lista) == 638.9);
    }
    
    @Test
    public void deberiaSacarLaDesviacionEstandar() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(186.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(699.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(132.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(272.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(291.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(331.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(199.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1890.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(788.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1601.0,0,null,null);
        lista.add(n10);
        assertTrue(cal.calcularDesviacionEstandar(lista) == 625.63);
    }

    @Test
    public void deberiaSacarLaDesviacionEstandarDeColumn1() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(160.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(591.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(114.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(229.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(230.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(270.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(128.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1657.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(624.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1503.0,0,null,null);
        lista.add(n10);
        assertTrue(cal.calcularDesviacionEstandar(lista) == 572.03);
    }
    
    @Test
    public void deberiaSacarLaMediaDeColumn1() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(160.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(591.0,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(114.0,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(229.0,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(230.0,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(270.0,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(128.0,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(1657.0,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(624.0,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(1503.0,0,null,null);
        lista.add(n10);
        assertTrue(cal.calcularMedia(lista) == 550.6);
    }
    
    @Test
    public void deberiaSacarLaDesviacionEstandarDeColumn2() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(15.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(69.9,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(6.5,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(22.4,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(28.4,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(65.9,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(19.4,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(198.7,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(38.8,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(138.2,0,null,null);
        lista.add(n10);
        assertTrue(cal.calcularDesviacionEstandar(lista) == 62.26);
    }
    
    @Test
    public void deberiaSacarLaMediaDeColumn2() {
        Calculadora cal = new Calculadora();
        LinkedList lista = new LinkedList();
        Nodo n1 = new Nodo(15.0,0,null,null);
        lista.add(n1);
        Nodo n2 = new Nodo(69.9,0,null,null);
        lista.add(n2);
        Nodo n3 = new Nodo(6.5,0,null,null);
        lista.add(n3);
        Nodo n4 = new Nodo(22.4,0,null,null);
        lista.add(n4);
        Nodo n5 = new Nodo(28.4,0,null,null);
        lista.add(n5);
        Nodo n6 = new Nodo(65.9,0,null,null);
        lista.add(n6);
        Nodo n7 = new Nodo(19.4,0,null,null);
        lista.add(n7);
        Nodo n8 = new Nodo(198.7,0,null,null);
        lista.add(n8);
        Nodo n9 = new Nodo(38.8,0,null,null);
        lista.add(n9);
        Nodo n10 = new Nodo(138.2,0,null,null);
        lista.add(n10);
        assertTrue(cal.calcularMedia(lista) == 60.32);
    }
}
