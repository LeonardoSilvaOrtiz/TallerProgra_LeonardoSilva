package org.example;

public class EmpleadoIndefinido extends Empleado {
    private boolean hasVacations;

    public EmpleadoIndefinido(String nombre, String apellido, int salario, int tiempoContrato){
        super(nombre, apellido, salario, tiempoContrato);

        if(tiempoContrato > 6){
            this.hasVacations = true;
        }else {
            this.hasVacations = false;
        }
    }
    public int pagarFiniquito(){
        if(getTiempoContrato() > 12){
            int bono = 50000;
            int salarioCB = getSalario() + bono;
            return salarioCB * getTiempoContrato();
        }else{
            return super.pagarFiniquito();
        }
    }

    public int darVacaciones(){
        if(hasVacations){
            return super.darVacaciones();
        }else{
            return 0;
        }
    }
}
