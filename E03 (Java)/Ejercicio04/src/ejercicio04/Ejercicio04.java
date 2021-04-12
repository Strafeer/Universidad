
package ejercicio04;

import java.util.*;

public class Ejercicio04 {

    public static void main(String[] args) {
        
        Empleado1 objempleado1 = new Empleado1("Juan Pablo Grey","20.369.129-5", 4, 700000);
        
        Empleado2 objempleado2 = new Empleado2("Tulio Enrique León Alcala","13.914.203-2", 3, 700000);
        
        Empleado3 objempleado3 = new Empleado3("Romina Alvarez Figueroa","19.017.279-8", 7, 700000);
        
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        
        while(!salir){
            
            System.out.println("1. Empleado Nº1");
            System.out.println("2. Empleado Nº2");
            System.out.println("3. Empleado Nº3");
            System.out.println("4. Salir");
            
            System.out.print("Escribe una de las opciones: ");
            opcion = sn.nextInt();
            
            switch(opcion){
                case 1: 
                    objempleado1.obdatos();
                    break;
                case 2:
                    objempleado2.obdatos2();
                    break;
                case 3:  
                    objempleado3.obdatos3();
                    break;
                case 4: 
                    salir = true;
                    break;
                default: 
                    System.out.println("Sólo números entre 1 y 4.");
                    
                    
                    
            }
                     
        }

        
        
        

    }
    
}
