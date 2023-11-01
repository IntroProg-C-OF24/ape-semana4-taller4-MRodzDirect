
package ape_week4_solve;
import java.util.Scanner;

public class GastoHijos_2 {
    
    public static void main(String[] args) {
        double  gastoHijo1, gastoHijo2, gastoHijo3, gastoTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar gastos de hijo 1: ");
        gastoHijo1 = sc.nextDouble();
        System.out.println("Ingresar gastos de hijo 2: ");
        gastoHijo2 = sc.nextDouble();
        System.out.println("Ingresar gastos de hijo 3: ");
        gastoHijo3 = sc.nextDouble();
        gastoTotal = gastoHijo1 + gastoHijo2 + gastoHijo3;
        System.out.println("Los costos totales de los tres hijos son: "+ gastoTotal);
    }
}
