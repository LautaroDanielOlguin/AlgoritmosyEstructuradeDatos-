package Ejercicio3;
import java.util.Scanner;


public class Ejercicio3 {
    public static void main(String args[]) {
       String nombre_Persona, apellido_Persona;
       int DNI, op = 0;
       int cant_Personas = 1;
       Scanner scan = new Scanner(System.in);
       Personas  people1, people2, people3, people4, people5;
       people1 = null;
       people2 = null;
       people3 = null;
       people4 = null;
       people5 = null;
       while(op != 3){

       System.out.println("-------------MENU-------------");
       System.out.println("1. Ingresar datos de persona nueva");
       System.out.println("2. Mostrar personas actuales");
       System.out.println("3. Salir");
       System.out.println("------------------------------");
       System.out.println("");
        
       op = scan.nextInt();
       scan.nextLine();
       
       switch(op){
           case 1:
               if(cant_Personas <=5){
                    System.out.println("Ingrese el nombre de la persona");
                    nombre_Persona = scan.nextLine();
                    System.out.println("Ingrese el apellido de la persona");
                    apellido_Persona = scan.nextLine();
                    System.out.println("Por último, ingrese el DNI de la persona");
                    DNI = scan.nextInt();
                    
                    switch(cant_Personas){
                        case 1:
                            people1 = new Personas(nombre_Persona, apellido_Persona, DNI);
                            cant_Personas++;
                            System.out.println("La cantidad de personas actualmente es: " + people1.get_cant_Personas());
                            break;
                        case 2:
                            people2 = new Personas(nombre_Persona, apellido_Persona, DNI);
                            cant_Personas++;
                            System.out.println("La cantidad de personas actualmente es: " + people1.get_cant_Personas());
                            break;
                        case 3:
                            people3 = new Personas(nombre_Persona, apellido_Persona, DNI);
                            cant_Personas++;
                            System.out.println("La cantidad de personas actualmente es: " + people1.get_cant_Personas());
                            break;
                        case 4:
                            people4 = new Personas(nombre_Persona, apellido_Persona, DNI);
                            cant_Personas++;
                            System.out.println("La cantidad de personas actualmente es: " + people1.get_cant_Personas());
                            break;
                        case 5:
                            people5 = new Personas(nombre_Persona, apellido_Persona, DNI);
                            cant_Personas++;
                            System.out.println("La cantidad de personas actualmente es: " + people1.get_cant_Personas());
                            break;
                    }
               }
               else{
                System.out.println("Ya se han ingresado el máximo de personas");
               }
               break;
           case 2:
               if(cant_Personas > 1){
                   for(int i=1; i<cant_Personas; i++){
                       switch(i){
                           case 1:
                               System.out.println("----------Persona----------");
                               System.out.println("Nombre: " + people1.nombre);
                               System.out.println("Apellido " + people1.apellido);
                               System.out.println("DNI: " + people1.DNI);
                               System.out.println("----------------------------");
                               break;
                           case 2:
                               System.out.println("----------Persona----------");
                               System.out.println("Nombre: " + people2.nombre);
                               System.out.println("Apellido " + people2.apellido);
                               System.out.println("DNI: " + people2.DNI);
                               System.out.println("----------------------------");
                               break;
                           case 3:
                               System.out.println("----------Persona----------");
                               System.out.println("Nombre: " + people3.nombre);
                               System.out.println("Apellido " + people3.apellido);
                               System.out.println("DNI: " + people3.DNI);
                               System.out.println("----------------------------");
                               break;
                           case 4:
                               System.out.println("----------Persona----------");
                               System.out.println("Nombre: " + people4.nombre);
                               System.out.println("Apellido " + people4.apellido);
                               System.out.println("DNI: " + people4.DNI);
                               System.out.println("----------------------------");
                               break;
                           case 5:
                               System.out.println("----------Persona----------");
                               System.out.println("Nombre: " + people5.nombre);
                               System.out.println("Apellido " + people5.apellido);
                               System.out.println("DNI: " + people5.DNI);
                               System.out.println("----------------------------");
                               break;
                       }
                   }
               }
               else{
                System.out.println("Ya se han ingresado el máximo de personas");
               }
               break;
           case 3:
               System.out.println("Hasta la próxima!");
               break;
       }
       }
    }
}
