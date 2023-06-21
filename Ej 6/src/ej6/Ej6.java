package ej6;
import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {

        float nota1, nota2, nota3;
        String nombre, apellido;
        Alumno alumno;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Bienvenido! Por favor ingrese los siguientes datos del alumno:");
        System.out.print("Nombre: ");
        nombre = scan.nextLine();
        System.out.print("Apellido: ");
        apellido = scan.nextLine();
        System.out.print("Ingrese la 1era nota del alumno: ");
        nota1 = scan.nextFloat();
        System.out.print("Ingrese la 2da nota del alumno: ");
        nota2 = scan.nextFloat();
        System.out.print("Ingrese la 3er nota del alumno: ");
        nota3 = scan.nextFloat();
        scan.nextLine();
        
        alumno = new Alumno(nombre, apellido, nota1, nota2, nota3);
        alumno.setNombre(nombre);
        alumno.setApellido(apellido);

        System.out.println("Datos ingresados exitósamente!");
        System.out.println("Aprete cualquier tecla para continuar...");
        scan.nextLine();
        System.out.println("-------------DATOS DE ALUMNO-------------");
        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Apellido del alumno: " + alumno.getApellido());
        System.out.println("Promedio final del alumno:" + alumno.getPromedio());
    }
    
}
