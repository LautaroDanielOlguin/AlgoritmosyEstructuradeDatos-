
package com.mycompany.ejercicio127;

public class Tabla {
    static final int TAMANIO = 97;
    int numElementos=0;
    Elemento [] tablaDispersa;

    public Tabla() {
        tablaDispersa= new Elemento[TAMANIO];
        for(int i=0;i<TAMANIO;i++){
            tablaDispersa[i]=null;
        }
        numElementos=0;
    }
    public int dispersion(int x){ 
        return x%TAMANIO;
    }
    public void insertar(TipoSocio s){
        int p;
        Elemento nuevo;
        p=dispersion(s.mostrarCodigo());
        nuevo= new Elemento(s);
        nuevo.sig= tablaDispersa[p];
        tablaDispersa[p]=nuevo;
        numElementos++;
    }
    public void eliminar(int codigo){
        int p;
        p=dispersion(codigo);
        if(tablaDispersa[p]!=null){
            Elemento anterior, actual;
            anterior=null;
            actual=tablaDispersa[p];
            while((actual.sig !=null) && (actual.mostrarSocio().mostrarCodigo()!=codigo)){
                anterior=actual;
                actual=actual.sig;
            
            }
            if(actual.mostrarSocio().mostrarCodigo()!=codigo){
                System.out.println("No se encuentra en la tabla el socio" +codigo);
                
            } else{
                if(anterior==null){
                    tablaDispersa[p]=actual.sig;
                } else{
                    anterior.sig=actual.sig;
                }
                actual=null;
                numElementos--;
            }
        }
        
    }
    
    public Elemento buscar(int codigo){
        Elemento e=null;
        int p;
        p=dispersion(codigo);
        if(tablaDispersa[p]!=null){
            e=tablaDispersa[p];
            while((e.sig!=null) && (e.mostrarSocio().mostrarCodigo()!=codigo)){
                e=e.sig;
            }
            if(e.mostrarSocio().mostrarCodigo()!=codigo){
                e=null;
            }
        }
        return e;
    }
    
}
