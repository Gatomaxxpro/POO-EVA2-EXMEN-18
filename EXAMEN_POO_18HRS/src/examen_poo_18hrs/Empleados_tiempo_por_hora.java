
package examen_poo_18hrs;

public class Empleados_tiempo_por_hora extends Empleado{
private double hora;

    public Empleados_tiempo_por_hora() {
       double hora=0;
     
    }

    
    public double getHora() {
        return hora*hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public Empleados_tiempo_por_hora(double hora) {
        this.hora = hora;
    }

    public Empleados_tiempo_por_hora(double hora, String nombre, String apellido, String tipo, double paga) {
        super(nombre, apellido, tipo, paga);
        this.hora = hora;
    }

    public Empleados_tiempo_por_hora(String nombre, String apellido, String tipo, double paga) {
        super(nombre, apellido, tipo, paga);
    }
    
}
