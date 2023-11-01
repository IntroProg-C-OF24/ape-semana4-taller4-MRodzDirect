/*
Algoritmo-1

Generar un algoritmo que permite calcular y presentar el área de un triángulo. 
Los datos deben ser pedidos al usuario.
 */

package ape_week4_solve;
import java.util.Scanner;
public class AreaTriang_1 {

    public static void main(String[] args) {
     double baseTri;
     double altTri;
     double areaTri;
     Scanner sc = new Scanner(System.in); // new scanner (System.in) = Declarar e Inicializar
        System.out.println("Ingresar la base del triangulo: ");
     baseTri = sc.nextDouble();
     System.out.println("Ingresar la altura del triangulo: ");
     altTri = sc.nextDouble();
     
     areaTri = (baseTri*altTri)/2 ;
        System.out.println("La area del triangulo es: "+areaTri);
    }
    /**
     * Si lo que se declara comienza con: Mayuscula = objeto / Minuscula = variable
     * ALT+SHIFT+F = INDENTACION o Format
     * Algoritmo-1
     */
}
