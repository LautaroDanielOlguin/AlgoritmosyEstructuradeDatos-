
package com.mycompany.ejercicio127;

import java.util.Scanner;

public class TipoSocio {
    class Fecha{
            int dia;
            int mes;
            int anio;
            public Fecha(int dia, int mes, int anio) {
                this.dia = dia;
                this.mes = mes;
                this.anio = anio;
            }
            public String fechaTexto(){
                return " " + dia + "-" + mes + "-" + anio;
            }
    }
        int codigo;
        String nombre;
        int edad;
        Fecha fechaAlta;
        public TipoSocio() {
            entrada();
        }
        public int mostrarCodigo(){
            return codigo;
        }
        public void entrada(){
            int d;
            int m;
            int a;
            Scanner entrada=new Scanner(System.in);
            System.out.println("\n Codigo de socio: ");
            codigo=entrada.nextInt();
            System.out.println("\n Nombre: ");
            nombre=entrada.next();
            System.out.println("\n Edad: ");
            edad=entrada.nextInt();
            System.out.println("\n Dia de alta: ");
            d=entrada.nextInt();
            System.out.println("\n Mes de alta: ");
            m=entrada.nextInt();
            System.out.println("\n Anio de alta: ");
            a=entrada.nextInt(); 
            fechaAlta = new Fecha(d, m, a);
        }
        public void datosSocio(){
            System.out.println("\n Codigo de socio: " + codigo);
        
            System.out.println("\n Nombre: " + nombre);

            System.out.println("\n Edad: " + edad);

            System.out.println("\n Fecha de alta: " + fechaAlta.fechaTexto());
        }
}
