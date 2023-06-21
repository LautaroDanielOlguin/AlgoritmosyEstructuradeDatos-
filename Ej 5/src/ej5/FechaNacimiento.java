package ej5;

import java.time.LocalDate;
import java.time.Period;

public class FechaNacimiento {
    LocalDate nacimiento;

    public FechaNacimiento(){
    }
    
    public FechaNacimiento(LocalDate nacimiento){
        this.nacimiento = nacimiento;
    }
    
    int yearsOld(LocalDate nacimiento){
        Period años = Period.between(nacimiento, LocalDate.now());
        return años.getYears();
    }
}