
package com.mycompany.arbol;

public class nodo {
    protected Object valor;
    protected nodo izq;
    protected nodo der;

    public nodo(Object valor) {
        this.valor = valor;
        izq = null;
        der = null;
    }

    public nodo(nodo izq, Object valor, nodo der) {
        this.valor = valor;
        this.izq = izq;
        this.der = der;
    }
    
    public Object valorNodo(){return valor;}
    public void newValor(Object dato){valor=dato;}
    public nodo subIzq(){return izq;}
    public void newIzq(nodo izquierdo){izq=izquierdo;}
    public nodo subDer(){return der;}
    public void newDer(nodo derecho){der=derecho;}
    void visitar(){
        System.out.println(valor + "");
    }
}
