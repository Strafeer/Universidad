
package ejercicio01;


public class Tequila{
    private String ncode;
    private String desc;
    private int cost;
    private int pventa;
    private int existi;
    private int existf;

    public Tequila(){            
    }

    public Tequila(String ncode, String desc, int cost, int pventa, int existi, int existf){
        
        this.ncode = ncode;
        this.desc = desc;
        this.cost = cost;
        this.pventa = pventa;
        this.existi = existi;
        this.existf = existf;  
    }

    public String getNcode() {
        return ncode;
    }

    public void setNcode(String ncode) {
        this.ncode = ncode;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPventa() {
        return pventa;
    }

    public void setPventa(int pventa) {
        this.pventa = pventa;
    }

    public int getExisti() {
        return existi;
    }

    public void setExisti(int existi) {
        this.existi = existi;
    }

    public int getExistf() {
        return existf;
    }

    public void setExistf(int existf) {
        this.existf = existf;
    }

    public int ganancia(){
        return (pventa-cost);
    }
    
    public int usold(){
        return (existi-existf);
    }
    
    public int gananciatotal(){
        return (ganancia()* usold());
    }
    
    public void obdatos(){
        System.out.println("-----------------------------------");
        System.out.println("Nº Código de Producto: " +ncode);
        System.out.println("Descripción: " +desc);
        System.out.println("Costo de Compra: " +cost);
        System.out.println("Precio de Venta: " +pventa);
        System.out.println("Existencia Inicial: " +existi);
        System.out.println("Existencia Final: " +existf);
        System.out.println("-----------------------------------");
        System.out.println("La Ganancia por Unidad es: " +ganancia());
        System.out.println("Se han vendido Tequilas: " +usold());
        System.out.println("La Ganancia Total es: " +gananciatotal());
        System.out.println("-----------------------------------");

         
        
    }

}
