package ej2;


public class Calculadora {
    int s1, s2;
    float f1, f2;
    
    public Calculadora(int s1, int s2){
        this.s1 = s1;
        this.s2 = s2;
    }
    
    public Calculadora(float f1, float f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    
    public int sumarEntero(int s1, int s2){
        return s1+s2;    
    }
    
      public int restaEntero(int s1, int s2){
        return s1-s2;    
    }
      
    public float restaFlotante(float f1, float f2){
        return f1-f2;    
    }
    
    public float sumarFlotante(float f1, float f2){
        return f1+f2;
    }
    
    public int multiEntero(int s1, int s2){
        return s1*s2;    
    }
    
    public float multiFlotante(float f1, float f2){
        return f1*f2;
    }
    
    public int dividirEntero(int s1, int s2){
        return s1/s2;    
    }
    
    public float dividirFlotante(float f1, float f2){
        return f1/f2;
    }    
}
