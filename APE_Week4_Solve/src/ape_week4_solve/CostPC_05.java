package ape_week4_solve;
import java.util.Scanner;
public class CostPC_05 {
    public static void main(String[] args) {
        double cpu, mouse, keyboard, screen, costTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Colocar el costo de su cpu: ");
        cpu = sc.nextDouble();
        System.out.println("Colocar el costo de su mouse: ");
        mouse = sc.nextDouble();
        System.out.println("Colocar el costo de su teclado: ");
        keyboard = sc.nextDouble();
        System.out.println("Colocar el costo de su pantalla: ");
        screen = sc.nextDouble();
        costTotal = cpu + mouse + keyboard + screen ;
        System.out.println("La computadora que desea comprar cuesta: "+ costTotal);
    }
}
