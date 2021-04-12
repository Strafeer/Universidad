
package ejercicio04;

public class Empleado3 {
    private String nombre;
    private String rut;
    private int nhijos;
    private int sueldob;   
    
    public Empleado3(){
        
    }
    
    public Empleado3 (String nombre, String rut, int nhijos, int sueldob){
        
        this.nombre = nombre;
        this.rut = rut;
        this.nhijos = nhijos;
        this.sueldob = sueldob;
    }     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getNhijos() {
        return nhijos;
    }

    public void setNhijos(int nhijos) {
        this.nhijos = nhijos;
    }

    public int getSueldob() {
        return sueldob;
    }

    public void setSueldob(int sueldob) {
        this.sueldob = sueldob;
    }
    
    public int salud(){
        return (sueldob*10/100);
    }
    
    public int hijos(){
        return (nhijos*20000);
    }
    
    public int sueldol(){
        return (sueldob+hijos()-salud());
    }
    public void obdatos3(){
        System.out.println("-----------------------------------");
        System.out.println("Nombre del Empleado: " +nombre);
        System.out.println("Rut del Empleado: " +rut);
        System.out.println("Sueldo Base: " +sueldob); 
        System.out.println("Número de Hijos: " +nhijos);
        System.out.println("-----------------------------------");
        System.out.println("Bono a Pagar por Nº de Hijos: " +hijos());
        System.out.println("Descuento de Previsión para Salud: " +salud());
        System.out.println("Sueldo Líquido a Pagar: " +sueldol());
        System.out.println("-----------------------------------");  
        
    }        
}
