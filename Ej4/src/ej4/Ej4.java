package ej4;

import java.util.Scanner;


public class Ej4 {
    public static void main(String[] args) {
        float b, h;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Vamos a calcular el Área de un triángulo!");
        System.out.println("---------------------------------------");
        System.out.println("Ingrese la base del triángulo");
        b = scan.nextFloat();
        
        System.out.println("");
        
        System.out.println("Ahora ingrese la altura del mismo");
        h = scan.nextFloat();
        System.out.println("---------------------------------------");
        
        System.out.println("El área del triángulo es: " + Triangulo.calcularArea(b, h));
        
    }
}
