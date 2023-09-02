package org.example;

public class Empleado {
    private String nombre, apellido;
    private  int salario, tiempoContrato, diasVacaciones;
    private boolean hasVacaciones;

    public Empleado(String nombre, String apellido, int salario, int tiempoContrato){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.tiempoContrato = tiempoContrato;
        this.diasVacaciones = darVacaciones();
        this.hasVacaciones = false;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    public int getTiempoContrato() {
        return tiempoContrato;
    }
    public void setTiempoContrato(int tiempoContrato) {
        this.tiempoContrato = tiempoContrato;
    }
    public int getDiasVacaciones() {
        return diasVacaciones;
    }
    public void setDiasVacaciones(int diasVacaciones) {
        this.diasVacaciones = diasVacaciones;
    }
    public boolean getHasVacaciones() {
        return hasVacaciones;
    }
    public void setHasVacaciones(boolean hasVacaciones) {
        this.hasVacaciones = hasVacaciones;
    }

    public void Informacion(){
        System.out.println("Nombre: "+ nombre + " "+apellido);
        System.out.println("Salario: "+salario);
        System.out.println("Tiempo del contrato: "+tiempoContrato);

    }

    public int pagarFiniquito(){
        if(tiempoContrato <= 0){

            throw new IllegalArgumentException("Ingrese un número mayor a 0");

        }else {
            return (salario * tiempoContrato);
        }
    }

    public int darVacaciones(){
        if(tiempoContrato <= 0){
            throw new IllegalArgumentException("Ingrese un número mayor a 0");
        }else {
            return (2 * tiempoContrato);
        }
    }
}
