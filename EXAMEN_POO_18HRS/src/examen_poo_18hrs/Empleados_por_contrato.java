
package examen_poo_18hrs;

public class Empleados_por_contrato extends Empleado {

    private double aumento;

    public Empleados_por_contrato() {
        double aumento = 0;
    }

    public Empleados_por_contrato(double aumento) {
        this.aumento = aumento;
    }

    public Empleados_por_contrato(double aumento, String tipo) {
        super(tipo);
        this.aumento = aumento;
    }

    public Empleados_por_contrato(double aumento, String nombre, String apellido, String tipo, double paga) {
        super(nombre, apellido, tipo, paga);
        this.aumento = aumento*10;
    }

}
