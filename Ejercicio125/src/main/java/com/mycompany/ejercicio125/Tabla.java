
package com.mycompany.ejercicio125;

public class Tabla {
    static final int tam = 101;
    int numElementos;
    Double factorCarga;
    Casa [] tablaDispersion;
    
    public Tabla() {
        tablaDispersion= new Casa[tam];
        for(int i=0;i<tam;i++){
            tablaDispersion[i]=null;
        }
        numElementos=0;
        factorCarga=0.0;
    }
    
    public int direccion(String codigo){
        int j=0, res;
        Long x;
        x=Long.valueOf(codigo);
        res=(int)(x%tam);
        while (tablaDispersion[res] != null && !tablaDispersion[res].mostrarCodigo().equals(codigo)){
            j++;
            res=res+j*j;
            res=res%tam; //Entender esto
        }     
        return res;
    }
    
    public void insertar(Casa c){
        int p;
        p=direccion(c.mostrarCodigo());
        tablaDispersion[p]=c;
        numElementos++;
        factorCarga=(double)(numElementos)/tam;
        if (factorCarga>0.5) {
           System.out.println("\nEl factor de carga supera el 50%!");   
        }
    }
    
    public Casa buscar(String codigo){
        Casa bus;
        int p;
        p=direccion(codigo);
        bus=tablaDispersion[p];
        if(bus!=null){
            if(!bus.esAlta){
                bus=null;
            }
        }
        return bus;
    }
    
    public void eliminar(String codigo){
        int p;
        p=direccion(codigo);
        if(tablaDispersion[p]!=null){
            tablaDispersion[p].esAlta=false;
        }
    }
}
