package arbolbbusqueda;
import java.util.Comparator;

public class ArbolBinarioBusqueda extends ArbolBinario{
    public final Comparator prueba;

    public ArbolBinarioBusqueda(){
        super();
        prueba = new ComparaEnteros();
    }

    public Nodo buscar(Object buscado){
        if (raiz == null){
         return null;
        }else{
            return localizar(rArbol(), buscado);
        }
    }

    protected Nodo localizar(Nodo rSub, Object buscado){
        if (rSub == null){
            return null;
        }
        else if (prueba.compare(buscado ,rSub.valorNodo()) < 0){
            return localizar(rSub.subIzq(), buscado);
        }
        else if (prueba.compare(buscado ,rSub.valorNodo()) > 0){
        return localizar(rSub.subDer(), buscado);
        }
        else{
            System.out.println("el valor se encuentra en el arbol binario");
        }
      return raiz;
  }

    public void insertar(Object valor) throws Exception{
        raiz = insertar(raiz, valor);
    }

  //método interno para realizar la operación
    protected Nodo insertar(Nodo rSub, Object dato) throws Exception{
        if (rSub == null){
            rSub = new Nodo(dato);
        }
        else if (prueba.compare(dato ,rSub.valorNodo()) < 0){
            Nodo iz;
            iz = insertar(rSub.subIzq(), dato);
            rSub.rIzq(iz);
    }
        else if (prueba.compare(dato, rSub.valorNodo()) > 0){
            Nodo dr;
            dr = insertar(rSub.subDer(), dato);
            rSub.rDer(dr);
    }else{
        throw new Exception("Nodo duplicado");
    }
      return rSub;
  }


    public void eliminar (Object valor) throws Exception{
        raiz = eliminar(raiz, valor);
    }

  //método interno para realizar la operación
    protected Nodo eliminar (Nodo rSub, Object dato) throws Exception{
        if (rSub == null){
            throw new Exception ("No encontrado el nodo con la clave");
        }
        else if (prueba.compare(dato ,rSub.valorNodo()) < 0){
            Nodo iz;
            iz = eliminar(rSub.subIzq(), dato);
            rSub.rIzq(iz);
        }
        else if (prueba.compare(dato ,rSub.valorNodo()) > 0){
            Nodo dr;
            dr = eliminar(rSub.subDer(), dato);
            rSub.rDer(dr);
    }else{ // Nodo encontrado
        Nodo q;
        q = rSub; // nodo a quitar del árbol
        if (q.subIzq() == null){
            rSub = q.subDer();
        }
        else if (q.subDer() == null){
            rSub = q.subIzq();
        }
        else{ // tiene rama izquierda y derecha
            q = reemplazar(q);
        }
        q = null;
        System.out.println("nodo eliminado");
    }
        return rSub;
    }

// método interno para susutituir por el mayor de los menores
    private Nodo reemplazar(Nodo act){
        Nodo a, p;
        p = act;
        a = act.subIzq(); // rama de nodos menores
        while (a.subDer() != null){
             p = a;
            a = a.subDer();
        }
        act.newValor(a.valorNodo());
        if (p == act){
            p.rIzq(a.subIzq());
        }
        else{
            p.rDer(a.subIzq());
        }
    return a;
  }
  private class ComparaEnteros implements Comparator {
	  public int compare(Object o1, Object o2) {
	    return ((Integer)o1).intValue() - ((Integer)o2).intValue();
	  }
  }
    
}
