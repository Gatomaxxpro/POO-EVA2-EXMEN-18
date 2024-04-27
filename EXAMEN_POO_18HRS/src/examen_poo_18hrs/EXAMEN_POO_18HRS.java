
package examen_poo_18hrs;


public class EXAMEN_POO_18HRS {

   
    public static void main(String[] args) {
     Empleados_por_contrato em=new Empleados_por_contrato(0.1, "maximiliano", "bernal","contrato:", 308);
     em.ImprimieDt();
     Empleados_tiempo_completo emp=new Empleados_tiempo_completo("marisol", "martinez", "tiempo completo:", 750);
     emp.ImprimieDt();
     Empleados_tiempo_por_hora empl=new Empleados_tiempo_por_hora(80, "mario", "bernal", "hora:", 80);
     empl.ImprimieDt();
     
    }

    
    
}
