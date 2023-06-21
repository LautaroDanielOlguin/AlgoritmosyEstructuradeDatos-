package ej2;

import java.util.Scanner;

/*Crea una clase "Calculadora" que tenga varios métodos sobrecargados para realizar 
operaciones matemáticas como suma, resta, multiplicación y división 
con diferentes tipos de datos, como enteros, flotantes y números complejos.*/

public class Ejercicio2{
    public static void menu_Enteros(int a, int b){
    int op2;
    Calculadora calculadora;
    
    calculadora = new Calculadora(a, b);
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Elija la operación a realizar con los números ingresados)");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Salir");
    
    op2 = leer.nextInt();
    
    switch(op2){
        case 1: //suma
            System.out.println("La suma de los dos enteros es: " + calculadora.sumarEntero(a, b));
            break;
        case 2: //resta
            System.out.println("La resta de los dos enteros es: " + calculadora.restaEntero(a, b));
            break;
        case 3: //multiplicacion
            System.out.println("La multiplicacion de los dos enteros es: " + calculadora.multiEntero(a, b));
            break;
        case 4: //division
            System.out.println("La división de los dos enteros es: " + calculadora.dividirEntero(a, b));
            break;
        case 5: //salir
            break;
    }
    }
    
    public static void menu_Flotantes(float a, float b){
    int op2;
    Calculadora calculadora;
    
    calculadora = new Calculadora(a, b);
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Elija la operación a realizar con los números ingresados)");
    System.out.println("1. Suma");
    System.out.println("2. Resta");
    System.out.println("3. Multiplicación");
    System.out.println("4. División");
    System.out.println("5. Salir");
    
    op2 = leer.nextInt();
    
    switch(op2){
        case 1: //suma
            System.out.println("La suma de los dos enteros es: " + calculadora.sumarFlotante(a, b));
            break;
        case 2: //resta
            System.out.println("La resta de los dos enteros es: " + calculadora.restaFlotante(a, b));
            break;
        case 3: //multiplicacion
            System.out.println("La multiplicacion de los dos enteros es: " + calculadora.multiFlotante(a, b));
            break;
        case 4: //division
            System.out.println("La división de los dos enteros es: " + calculadora.dividirFlotante(a, b));
            break;
        case 5: //salir
            break;
    }
    }
    
    public static void main(String[] args) {
        int op = 0;
        int op2;
        int e1, e2; //enteros
        float f1, f2; // flotantes
        Scanner leer = new Scanner(System.in);
        while(op != 3){
            System.out.println("Elija el tipo de dato a utilizar(Entero o Flotante)");
            System.out.println("1. Entero");
            System.out.println("2. Flotante");
            System.out.println("3. Salir");
            
            op = leer.nextInt();
            leer.nextLine();
              
            switch(op){
                case 1:
                    System.out.println("Ingrese el primer número");
                    e1 = leer.nextInt();
                    
                    System.out.println("Ahora ingrese el segundo nùmero");
                    e2 = leer.nextInt();
                    
                    menu_Enteros(e1, e2);
                    break;
                case 2:
                    System.out.println("Ingrese el primer número");
                    f1 = leer.nextFloat();
                    
                    System.out.println("Ahora ingrese el segundo nùmero");
                    f2 = leer.nextFloat();
                    
                   menu_Flotantes(f1, f2);
                    break;
                case 3:
                    System.out.println("Hasta la proxima!");
                    break;
            }
        }
    }
}
