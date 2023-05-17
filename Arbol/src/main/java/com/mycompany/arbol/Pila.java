
package com.mycompany.arbol;
import java.util.Vector;
public class Pila {
    
    private static final int INICIAL = 4;
    private int cima;
    private Vector listaPila;

    public Pila() {
        cima = -1;
        listaPila = new Vector(INICIAL);
    }
    
    public void insertar(Object dato){
        cima++;
        listaPila.addElement(dato);
    }
    public Object quitar(){
        Object aux;
        if(cima==-1){
            System.out.println("La pila esta vacia");
        } 
        aux=listaPila.elementAt(cima);
        listaPila.removeElementAt(cima);
        cima--;
        return aux;
    }
}
