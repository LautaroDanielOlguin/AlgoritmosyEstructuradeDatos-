
package com.mycompany.ejercicio1;
public class tabla {
    Empleado[] tabEmpleado;

    public tabla() {
        this.tabEmpleado = new Empleado[1000];
    }
    public int aritmetica(int x){
        return x % 997;
    }
    public void Insertar(Empleado x){
        //tabEmpleado[aritmetica(x.id)]=x;
        //tabEmpleado[multiplicacion(x.id)]=x;
        //tabEmpleado[plegamiento(x.id)]=x;
        tabEmpleado[mitadCuadrado(x.id)]=x;
    }
    
    public int multiplicacion(int x){
        Double r=0.6180334;
        int cantPosiciones=1024;
        Double y;
        int resultado;
        y = r*x-Math.floor(r*x);
        resultado = (int)(y*cantPosiciones);
        return resultado;
    }
    public String getNombre(int id){
        return tabEmpleado[id].getNombre();
    }
    public String getPuesto(int id){
        return tabEmpleado[id].getPuesto();
    }
    public Double getSalario(int id){
        return tabEmpleado[id].getSalario();
    }
    public int mitadCuadrado(int x){
        long y=x;
        long resultado;
        int z;
        String num, aux;
        resultado=y*y;
        num=String.valueOf(resultado);
        int largoMitad=num.length()/2;
        aux=num.substring(largoMitad, largoMitad+3);
        z=Integer.valueOf(aux);
        return z;
    }
    public int plegamiento (int x){
        String palabra, mitadUno, mitadDos;
        int auxUno, auxDos, resultado;
        palabra=String.valueOf(x);
        int largoMitad=palabra.length()/2;
        mitadUno=palabra.substring(0, largoMitad);
        mitadDos=palabra.substring(largoMitad, palabra.length());
        auxUno=Integer.valueOf(mitadUno);
        auxDos=Integer.valueOf(mitadDos);
        resultado=auxUno+auxDos;
        if(resultado>999){
            resultado=resultado-1000;
        }
        return resultado;
    }
}