/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algebrafunction;
/**
 *
 * @author Johann Lopez
 */
public class AlgebraFunction {
    
    // Método estático para calcular f(x, y)
    public static double calcularFuncion(double x, double y) {
        return Math.pow(x, 2) + 2 * x * y + Math.pow(y, 2);
    }

    // Método principal para ejecutar el programa
    
    public static void main(String[] args) {
        // TODO code application logic here
        // Ejemplo de uso de la función
        double x = 3.0;
        double y = 4.0;
        double resultado = calcularFuncion(x, y);
        
        // Mostrar el resultado
        System.out.println("El valor de la fun X y Y(" + x + ", " + y + ") es: " + resultado);
    }
  }
    

