
package solemne1;


public class Pizza {
    private String nom;
    private char extra;
    private int npizzas;
    private float propina;

    public Pizza() {
    }

    public Pizza(String nom, char extra, int npizzas, float propina) {
        this.nom = nom;
        this.extra = extra;
        this.npizzas = npizzas;
        this.propina = propina;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public char getExtra() {
        return extra;
    }

    public void setExtra(char extra) {
        this.extra = extra;
    }

    public int getNpizzas() {
        return npizzas;
    }

    public void setNpizzas(int npizzas) {
        this.npizzas = npizzas;
    }

    public float getPropina() {
        return propina;
    }

    public void setPropina(float propina) {
        this.propina = propina;
        
    }
    
    public int pextra(){
        
        switch (extra){
            case 'S' -> {
                if (extra == 'S')
                    return (int) (5* npizzas);
                else
                    return 0;
                
            }

                                
        }
        return 0;
        
    }
     
    public float totalpizza(){
        return (float) (npizzas * 12.30);
    }
    
    public float totalventa(){
        return (float) ((totalpizza() + propina) +pextra());    
    }
    

    
    public void obdatos(){
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("                                 BOLETA                                  ");
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Nombre del Cliente: " +nom);
        System.out.println("Número de Pizzas Napolitanas que pidió: " +npizzas);
        System.out.println("¿Quiso Agregarle un extra?: " +extra);
        System.out.println("Valor Adicional por el extra pedido: $"+pextra());
        System.out.println("¿Cuánto dejó de propina?: $"+propina);
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Precio Total de la Transacción (Incluida la propina): $"+totalventa());
        System.out.println("-------------------------------------------------------------------------");
    }
}


