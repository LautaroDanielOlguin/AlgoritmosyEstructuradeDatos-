
package com.mycompany.ejercicio125;

import java.util.Scanner;

public class Ejercicio125 {

    public static void main(String[] args) {
        int opcion=0;
        String cod;
        Scanner ingreso= new Scanner(System.in);
        Casa casaRural= new Casa();
        Tabla t= new Tabla();
        t.insertar(casaRural);
        while(opcion!=4){
           System.out.println("\n1. Dar de alta una casa");
           System.out.println("\n2. Buscar una casa");
           System.out.println("\n3. Dar de baja una casa");
           System.out.println("\n4. Salir");
           System.out.println("\nEscribe una de las opciones");
           opcion = ingreso.nextInt();
           switch(opcion){
               case 1:
                   System.out.println("1. Dar de alta de una casa");
                   casaRural.entradaDatos();
                   t.insertar(casaRural);
                   break;
               case 2:
                   System.out.println("2. Buscar una casa");
                   System.out.println("\nIngrese el codigo de la casa que desea buscar");
                   cod=ingreso.next();
                   t.buscar(cod);
                   if(t.buscar(cod) == null){
                       System.out.println("Esta casa se dio de baja");
                   } else{
                       t.buscar(cod).mostrarDatos();
                   }
                   break;
                case 3:
                   System.out.println("3. Dar de baja una casa");
                   System.out.println("\nIngrese el codigo de la casa que desea dar de baja");
                   cod=ingreso.next();
                   t.eliminar(cod);
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
