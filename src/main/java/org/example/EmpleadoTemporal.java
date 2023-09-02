package org.example;

public class EmpleadoTemporal extends Empleado {
    private boolean isRenovado, hasVacations;

    public EmpleadoTemporal(String nombre, String apellido, int salario, int tiempoContrato){
        super(nombre,apellido, salario, tiempoContrato);
        this.isRenovado = false;
        this.hasVacations = false;
    }

    public boolean getIsRenovado() {
        return isRenovado;
    }
    public void setRenovado(boolean isRenovado){
        this.isRenovado = isRenovado;
    }
    public boolean getHasVacations(){
        return hasVacations;
    }
    public void setHasVacations(boolean hasVacations){
        this.hasVacations = hasVacations;
    }

    public void extenderContrato(int meses){
        setRenovado(true);
        setTiempoContrato(getTiempoContrato() + meses);

        if(getTiempoContrato() > 6){
            setHasVacations(true);
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
