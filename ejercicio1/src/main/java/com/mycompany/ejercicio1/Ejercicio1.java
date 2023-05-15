package com.mycompany.ejercicio1;
public class Ejercicio1 {

    public static void main(String[] args) {
        Empleado empUno= new Empleado(245643,"Jorge", 200.0);
        Empleado empDos= new Empleado(245981,"Raul", 300.0);
        Empleado empTres= new Empleado(257135,"Javier", 500.0);
        tabla tablilla = new tabla();
        tablilla.Insertar(empUno);
        tablilla.Insertar(empDos);
        tablilla.Insertar(empTres);
        int posicion;
        
        //posicion = tablilla.aritmetica(empUno.id);
        //posicion = tablilla.multiplicacion(empUno.id);
        //posicion = tablilla.plegamiento(empUno.id);
        posicion = tablilla.mitadCuadrado(empUno.id);
        System.out.println("========================");
        System.out.println("Empleado UNO: ");
        System.out.println("Nombre: " + tablilla.getNombre(posicion));
        System.out.println("Salario: " + tablilla.getSalario(posicion));
        System.out.println("Posicion: " + posicion);
        System.out.println("========================");
        System.out.println("========================");
        
        //posicion = tablilla.aritmetica(empDos.id);
        //posicion = tablilla.multiplicacion(empDos.id);
        //posicion = tablilla.plegamiento(empDos.id);
        posicion = tablilla.mitadCuadrado(empDos.id);
        System.out.println("Empleado DOS: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
        System.out.println("========================");
        System.out.println("========================");
        
        //posicion = tablilla.aritmetica(empTres.id);
        //posicion = tablilla.multiplicacion(empTres.id);
        //posicion = tablilla.plegamiento(empTres.id);
        posicion = tablilla.mitadCuadrado(empTres.id);
        System.out.println("Empleado TRES: ");
        System.out.println("Nombre: "+ tablilla.getNombre(posicion));
        System.out.println("Salario: "+ tablilla.getSalario(posicion));
        System.out.println("Posicion: "+ posicion);
       
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        System.out.println("indice tabla eUno: "+ tablilla.multiplicacion(empUno.id));
        System.out.println("indice tabla eDos: "+ tablilla.multiplicacion(empDos.id));
        System.out.println("indice tabla eTres: "+ tablilla.multiplicacion(empTres.id));
    }
}
