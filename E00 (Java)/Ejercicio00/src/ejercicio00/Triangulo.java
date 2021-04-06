
package ejercicio00;


public class Triangulo {
    
    private float base;
    private float altura;
    
    public Triangulo(){
    
    }
    
public Triangulo (float base, float altura){
    this.base = base;
    this.altura = altura;
    
}

public float area(){
    return base*altura/2;
}
}
