// En este ejercicio asumimos que los minutos consumidos y el costo por minuto son redondeados, es decir son enteros. (Por proposito de practica con variable int)
package ape_week4_solve;
import java.util.Scanner;
public class CostPlanillaTelf_04 {
    public static void main(String[] args) {
        int costMin, minuGast, costTotal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar costos por minuto de su plan: ");
        costMin = sc.nextInt();
        System.out.println("Ingresar minutos que usted ha gastado: ");
        minuGast = sc.nextInt();
        costTotal = costMin*minuGast ;
        System.out.println("El valor de su planilla para este mes es: "+ costTotal);
      // Por: MRodzDirect, El Original 😉         
    }
}
