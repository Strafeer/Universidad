package ejercicio00;

import java.util.*;
        
public class Ejercicio00 {

    public static void main(String[] args) {
        
        Scanner cal = new Scanner (System.in);
        
        float base, altura;
        
        System.out.print("Ingrese Base: ");
        base = cal.nextFloat();
        
        System.out.print("Ingrese Altura: ");
        altura = cal.nextFloat();
        
        Triangulo objtri = new Triangulo(base, altura);
        
        System.out.println("El área del triángulo es: " +objtri.area());

    }
    
}
