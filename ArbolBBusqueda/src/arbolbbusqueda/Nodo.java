package arbolbbusqueda;

public class Nodo {
    protected Object dato;
    protected Nodo izq;
    protected Nodo der;
  
    public Nodo(Object valor){
        dato = valor;
        izq = null;
        der = null;
    }

    public Nodo(Nodo rIzq, Object valor, Nodo rDer){
        this.dato = valor;
        izq = rIzq;
        der = rDer;
    }
  
    public Object valorNodo(){ return dato; }
    public Nodo subIzq(){ return izq; }
    public Nodo subDer(){ return der; }
    public void newValor(Object d){ dato = d; }
    public void rIzq(Nodo n){ izq = n; }
    public void rDer(Nodo n){ der = n; }

    void visitar(){
         System.out.print(dato + " ");
    }

    
}
