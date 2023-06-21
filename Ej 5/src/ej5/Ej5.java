package ej5;

import java.time.LocalDate;
import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        LocalDate fechaNacimiento;
        Scanner scan = new Scanner(System.in);
        FechaNacimiento años;
        
        System.out.println("Por favor ingrese su fecha de nacimiento");
        fechaNacimiento = LocalDate.parse(scan.nextLine());
        
        años = new FechaNacimiento(fechaNacimiento);
        
        System.out.println("La edad que usted tiene es: " + años.yearsOld(fechaNacimiento));
    }
}
