
package examen_poo_18hrs;


public class Empleados_tiempo_completo extends Empleado{
private double tiempoC;

    public double getTiempoC() {
        return tiempoC;
    }

    public void setTiempoC(double tiempoC) {
        this.tiempoC = tiempoC;
    }

    public Empleados_tiempo_completo(double tiempoC) {
        this.tiempoC = tiempoC;
    }
    public Empleados_tiempo_completo(String nombre, String apellido, String tipo, double paga) {
        super(nombre, apellido, tipo, paga);
    }
    
}
