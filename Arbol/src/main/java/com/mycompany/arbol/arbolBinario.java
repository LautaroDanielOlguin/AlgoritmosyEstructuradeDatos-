
package com.mycompany.arbol;

public class arbolBinario {
    protected nodo raiz;
    public arbolBinario() {
        raiz=null;
    }
    public arbolBinario(nodo raiz) {
        this.raiz = raiz;
    }
    public nodo raizArbol(nodo raiz){
        return raiz;
    }
    public boolean estaVacio(){
        return raiz == null;
    }
    public void preorden(nodo r){
        if (r != null){
            r.visitar();
            preorden (r.subIzq());
            preorden (r.subDer());
        }
    }
    public void inorden(nodo r){
        if (r != null){
            inorden (r.subIzq());
            r.visitar();
            inorden (r.subDer());
        }
    }
    public void postorden(nodo r){
        if (r != null){
            postorden (r.subIzq());
            postorden (r.subDer());
            r.visitar();
        }
    }
    
}
