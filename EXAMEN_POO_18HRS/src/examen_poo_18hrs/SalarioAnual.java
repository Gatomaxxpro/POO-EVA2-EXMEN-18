
package examen_poo_18hrs;


public abstract class  SalarioAnual extends Empleado{
private double Sal;

    public SalarioAnual() {
        double sal;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double Sal) {
        this.Sal = Sal;
    }

    public SalarioAnual(double Sal) {
        this.Sal = Sal;
    }
    public void ImprimirDt(){
        System.out.println("salario"+getPaga());
    }
}
