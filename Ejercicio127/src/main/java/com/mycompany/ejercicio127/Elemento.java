
package com.mycompany.ejercicio127;

public class Elemento {
    TipoSocio socio;
    Elemento sig;
    public Elemento (TipoSocio s){
        socio=s;
        sig=null;
    }
    public TipoSocio mostrarSocio(){
        return socio;
    }
}

