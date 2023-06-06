package arbolbbusqueda;
public class ArbolBinario {
    protected Nodo raiz;
  
    public ArbolBinario(){
        raiz = null;
    }
  
    public ArbolBinario(Nodo raiz){
        this.raiz = raiz;
    }
  
    public Nodo rArbol(){
        return raiz;
    }
  
  // Comprueba el estatus del árbol
    boolean esVacio(){
        return raiz == null;
    }

    public static Nodo newArbol(Nodo rIzqu, Object dato, Nodo rDere){
        return new Nodo(rIzqu, dato, rDere);
    }

  // Recorrido de un árbol binario en preorden
    public static void preorden(Nodo r){
        if (r != null){
        r.visitar();
         preorden (r.subIzq());
        preorden (r.subDer());
        }
    }
  
  // Recorrido de un árbol binario en inorden
    public static void inorden(Nodo r){
        if (r != null){
             inorden (r.subIzq());
            r.visitar();
            inorden (r.subDer());
        }
    }
  
  // Recorrido de un árbol binario en postorden
    public static void postorden(Nodo r){
        if (r != null){
            postorden (r.subIzq());
            postorden (r.subDer());
            r.visitar();
        }
    }

}
