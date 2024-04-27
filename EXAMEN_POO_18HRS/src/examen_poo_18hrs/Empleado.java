package examen_poo_18hrs;

public abstract class Empleado {

    private String nombre;
    private String apellido;
    private double paga;
    private String tipo;

    public Empleado() {
        String nombre = "name del empleado:";
        String apellido = "introduce el nombre del empleado:";
        double paga = 0;
        String tipo = "tipo de empleado:";

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Empleado(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
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

    public double getPaga() {
        return paga;
    }

    public void setPaga(double paga) {
        this.paga = paga;
    }

    public Empleado(String nombre, String apellido, String tipo, double paga) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paga = paga;
        this.tipo = tipo;
    }

    public void ImprimieDt() {
        System.out.println("nombre del empleado:" + nombre + " " + apellido);
        System.out.println("empleado:" + tipo + "");
        System.out.println("paga del empleado " + paga*10);

    }
}
