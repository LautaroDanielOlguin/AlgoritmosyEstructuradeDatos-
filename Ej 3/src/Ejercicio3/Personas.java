package Ejercicio3;

public class Personas {
    static int cant_Personas;
    String nombre, apellido;
    int DNI;
    
    public Personas(){
    }
    
    public Personas(String nombre, String apellido, int DNI){
        this.cant_Personas = ++cant_Personas;
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
    }
    
    int get_cant_Personas(){
        return cant_Personas;
    }
}
