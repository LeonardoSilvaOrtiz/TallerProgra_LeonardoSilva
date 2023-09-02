package org.example;

public class Main {
    public static void main(String[] args) {
        try{
            EmpleadoIndefinido empleadoIndefinido = new EmpleadoIndefinido("jona","cea",300000,13);
            empleadoIndefinido.Informacion();

            int finiquitoIndefinido = empleadoIndefinido.pagarFiniquito();
            System.out.println("Finiquito: $" + finiquitoIndefinido);
            System.out.println("Días de vacaciones: "+empleadoIndefinido.darVacaciones());
        }
        catch (IllegalArgumentException e){
            System.out.println("Error ingreso" + e);

        }



    }
}