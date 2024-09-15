package area_triangulo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Area_Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String [] args){
         
        double base, altura, resultadoTriangulo;
        double radio, resultadoCirculo;
        final double PI = 3.1416;
        
        Scanner obj = new Scanner(System.in);

            // Menú para elegir qué cálculo realizar
            System.out.println("Seleccione la figura para calcular el área:");
            System.out.println("1. Triángulo");
            System.out.println("2. Círculo");
            System.out.print("Ingrese el número de su elección (1 o 2): ");
            int eleccion = obj.nextInt();
            
            switch (eleccion) {
                case 1:
                    // Calcular el área del triángulo
                    System.out.print("Ingrese base del triángulo:\t");
                    base = obj.nextDouble();
                    
                    System.out.print("Ingrese altura del triángulo:\t");
                    altura = obj.nextDouble();
                    
                    resultadoTriangulo = (base * altura) / 2;
                    
                    System.out.println("El área del triángulo es: " + resultadoTriangulo);
                    break;

                case 2:
                    // Calcular el área del círculo
                    System.out.print("Ingrese radio del círculo:\t");
                    radio = obj.nextDouble();
                    
                    resultadoCirculo = PI * radio * radio;
                    
                    System.out.println("El área del círculo es: " + resultadoCirculo);
                    break;
                    
                default:
                    System.out.println("Opción no válida. Por favor, elija 1 o 2.");
                    break;
            }
        }
    }
