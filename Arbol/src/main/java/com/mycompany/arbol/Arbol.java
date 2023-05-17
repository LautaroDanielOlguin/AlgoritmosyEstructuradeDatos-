
package com.mycompany.arbol;

public class Arbol {

    public static void main(String[] args) {
        arbolBinario arbol;
        nodo a1, a2, a;
        Pila pilaArbol=new Pila();
        a1=new nodo(null,"juan",null);
        a2=new nodo(null,"jose",null);
        a=new nodo(a1,"jorge",a2);
        pilaArbol.insertar(a);
        a1=new nodo(null,"juana",null);
        a2=new nodo(null,"josefa",null);
        a=new nodo(a1,"jorgina",a2);
        pilaArbol.insertar(a);
        a2=(nodo) pilaArbol.quitar();
        a1=(nodo) pilaArbol.quitar();
        a=new nodo(a1,"Ricky",a2);
        arbol=new arbolBinario(a);
        System.out.println("\nRecorrido Preorden \n");
        arbol.preorden(a);
        System.out.println("\nRecorrido Inorden \n");
        arbol.inorden(a);
        System.out.println("\nRecorrido Postorden \n");
        arbol.postorden(a);
    }
}
