package ej6;

public class Alumno {
    private String nombre, apellido;
    final float nota1, nota2, nota3;

    public Alumno(String nombre, String apellido, float nota1, float nota2, float nota3){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public float getPromedio(){
        return (nota1 + nota2 + nota3) / 3;
    }
    
}
