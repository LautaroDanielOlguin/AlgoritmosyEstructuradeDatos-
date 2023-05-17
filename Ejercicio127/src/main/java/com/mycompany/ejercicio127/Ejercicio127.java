
package com.mycompany.ejercicio127;

import java.util.Scanner;

public class Ejercicio127 {
    
    public static void main(String[] args) {
        int opcion=0;
        int cod;
        Tabla tablaMain =new Tabla();
        Scanner ingreso= new Scanner(System.in);
        TipoSocio socio= new TipoSocio();
        tablaMain.insertar(socio);
        Elemento elementoSocio= new Elemento(socio);
        
        
        while(opcion!=4){
           System.out.println("\n1. Dar de alta un socio");
           System.out.println("\n2. Buscar un socio");
           System.out.println("\n3. Dar de baja un socio");
           System.out.println("\n4. Salir");
           System.out.println("\nEscribe una de las opciones");
           opcion = ingreso.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("1. Dar de alta de un socio");
                   socio=new TipoSocio();
                   tablaMain.insertar(socio);
                   break;
               case 2:
                   System.out.println("2. Buscar un socio");
                   System.out.println("\nIngrese el codigo del socio que desea buscar");
                   cod=ingreso.nextInt();
                   tablaMain.buscar(cod);
                   if(tablaMain.buscar(cod) == null){
                       System.out.println("Este socio se dio de baja");
                   } else{
                       tablaMain.buscar(cod).mostrarSocio().datosSocio();
                   }
                   break;
                case 3:
                   System.out.println("3. Dar de baja un socio");
                   System.out.println("\nIngrese el codigo del socio que desea dar de baja");
                   cod=ingreso.nextInt();
                   tablaMain.eliminar(cod);
                    System.out.println("\n Se ha eliminado el socio");
                   break;
                case 4:
                    System.out.println("\nHa terminado el ingreso de casas!");
                    break;
                default:
                   System.out.println("Solo números entre 1 y 4.");
           }
        
       }
    }
}
