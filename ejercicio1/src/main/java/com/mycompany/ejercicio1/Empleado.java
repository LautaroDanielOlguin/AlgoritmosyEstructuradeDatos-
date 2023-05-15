package com.mycompany.ejercicio1;
public class Empleado {
    int id;
    String nombre;
    Double salario;
    String puesto;
    String fechaContratacion;
    public Empleado(int id,String nombre, Double salario){
        this.id=id;
        this.nombre=nombre;
        this.salario=salario;
    }

    public Empleado(int id, String nombre, Double salario, String puesto){
        this.id=id;
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleado(int id, String nombre, Double salario, String puesto, String fechaContratacion) {
        this.id=id;
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.fechaContratacion = fechaContratacion;
    }
    
    public int getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public Double getSalario() {
        return salario;
    }
    public String getPuesto() {
        return puesto;
    }
    public String getFechaContratacion() {
        return fechaContratacion;
    }
    
}
