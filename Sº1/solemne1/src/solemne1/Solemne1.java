
package solemne1;

import java.util.*;

public class Solemne1 {


    public static void main(String[] args) {
        Scanner nr = new Scanner (System.in);
        
        String nom;
        char extra;
        int npizzas;
        float propina;
          
                
        for (int i = 1; i <= 3; i++){
            System.out.println("****************************************************************");
            System.out.println("                         CLIENTE Nº" +i);
            System.out.println("****************************************************************");
            System.out.println("Nombre del Cliente: ");
            nom = nr.nextLine();
            System.out.println("¿Cuántas Pizzas Napolitanas Quiere? ($12.30 C/U): ");
            npizzas = nr.nextInt();
            System.out.println("¿Desea agregar Extra de Queso y Extra de Salsa por $5 dólares? (Responda con una 'S' en caso de que sea así, sino sólo escriba cualquier caracter)");
            extra = nr.next().charAt(0);
            System.out.println("¿Cuánto desea aportar a nuestra propina por el buen servicio?");
            propina = nr.nextFloat();
            nr.nextLine();
            
            Pizza objpizza = new Pizza (nom, extra, npizzas, propina);
            objpizza.obdatos();
            
        }        
                

    }
    
}


/*
1. Creación de una clase para crear los objetos pertinentes del problema planteado. (LISTO)

2. La clase debe tener al menos 4 atributos con diversos tipos: String, int, char, float, etc. y no debe exceder de
6 atributos. (LISTO)

3. La clase debe tener todos sus métodos constructores (sin parámetros y con todos los parámetros), y los
métodos getters y setters. (LISTO)

4. La clase debe tener un método (no void) que realice cálculos según una condición (usar if) de uno o más
atributos y retorne (return) el tipo de valor del método. (LISTO)

5. La clase debe tener un método (void) que muestre por pantalla todos los valores de los atributos, y
adicionalmente mostrar el valor calculado del punto 4. (LISTO)

6. En el método principal main() (que debe estar dentro de la clase principal que tiene el nombre del proyecto)
se deben leer (usando Scanner) los datos de entrada para 3 entidades (usar ciclo) siguiendo igual en los
puntos 7 a 8. (Recomendación: Hágalo para una sola entidad y luego que funcione implemente el ciclo
para las 3 entidades) (LISTO)

7. En el método principal main() se debe crear un objeto una vez leído los datos para cada entidad, es decir,
con el ciclo se deben leer los datos para 3 entidades pero cada vez que se hayan leído los datos para una
entidad, se debe proceder a crear el respectivo objeto con esos datos. (LISTO)

8. En el método principal main() cada vez que sea creado un objeto se debe llamar al método que muestra los
datos (punto 5). Debe tomar una captura de pantalla (Print Screen) con el resultado de al menos 1 entidad
junto con parte del código de su Proyecto en NetBeans. (LISTO) */ 


/* SOLUCIÓN:

1) 

2) Pizzas 
STRING = nombre del que lo pide
CHAR = extra de queso S o N 
INT = cantidad de pizzas
FLOAT = propina en dólares (Usar sistema de dólares para poder usar decimales "." ejemplo 1.50

3)

4) Tipo CHAR como en el trabajo S = Si, N = No sumarle X valor más por el extra de queso y salsa

5) observar.datos

6) Ciclo for para incluir 3 entradas distintas en un mismo objeto

7) OBJ pizzas

8) observar.datos cada vez que se termina una orden de cada pizza

*/




