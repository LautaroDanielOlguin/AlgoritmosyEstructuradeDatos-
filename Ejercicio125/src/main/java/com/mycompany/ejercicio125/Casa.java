
package com.mycompany.ejercicio125;
import java.util.Scanner;
public class Casa {
    String id;
    String poblacion;
    String direccion;
    int numHabitacion=0;
    Double precio=0.0;
    boolean esAlta;
    Scanner entrada = new Scanner (System.in);

    public Casa() {
        entradaDatos();
    }
    
    public void entradaDatos(){
        System.out.println("\n Codigo (10 caracteres): ");
        id=entrada.next();
        System.out.println("\n Poblacion: ");
        poblacion=entrada.next();
        System.out.println("\n Direccion: ");
        direccion=entrada.next();
        System.out.println("\n Numero de habitaciones: ");
        numHabitacion=entrada.nextInt();
        System.out.println("\n Precio por dia: ");
        precio=entrada.nextDouble();
        esAlta=true;
        
    }
    public String mostrarCodigo(){
        return id;
    }
    public void mostrarDatos(){
        System.out.println("\n Casa Rural " + id);
        System.out.println("\n Poblacion: " + poblacion);
        System.out.println("\n Direccion: " + direccion);
        System.out.println("\n Precio por dia: " + precio);
    }
}
