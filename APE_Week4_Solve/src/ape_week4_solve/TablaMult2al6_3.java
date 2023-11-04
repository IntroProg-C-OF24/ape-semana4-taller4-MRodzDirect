package ape_week4_solve;
import java.util.Scanner;
public class TablaMult2al6_3 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int num1, mult0, mult1, mult2, mult3, mult4, mult5, mult6, mult7, mult8, mult9, mult10, mult11, mult12, solve;
        mult0 = 0;
        mult1 = 1;
        mult2 = 2;
        mult3 = 3;
        mult4 = 4;
        mult5 = 5;       
        mult6 = 6;        
        mult7 = 7;        
        mult8 = 8;       
        mult9 = 9;        
        mult10 = 10;       
        mult11 = 11;        
        mult12 = 12;        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entre el 2 y 6");
        num1 = sc.nextInt();
        if (num1 >=2 && num1 <= 6) {
            System.out.println("La tabla de multiplicar del " + num1 + " es");
            solve = num1 * mult0;
            System.out.println(num1 + " x "+ mult0 +" = " + solve);
            solve = num1 * mult1;
            System.out.println(num1 + " x "+ mult1 +" = " + solve);
            solve = num1 * mult2;
            System.out.println(num1 + " x "+ mult2 +" = " + solve);
            solve = num1 * mult3;
            System.out.println(num1 + " x "+ mult3 +" = " + solve);
            solve = num1 * mult4;
            System.out.println(num1 + " x "+ mult4 +" = " + solve);
            solve = num1 * mult5;
            System.out.println(num1 + " x "+ mult5 +" = " + solve);
            solve = num1 * mult6;
            System.out.println(num1 + " x "+ mult6 +" = " + solve);
            solve = num1 * mult7;
            System.out.println(num1 + " x "+ mult7 +" = " + solve);
            solve = num1 * mult8;
            System.out.println(num1 + " x "+ mult8 +" = " + solve);
            solve = num1 * mult9;
            System.out.println(num1 + " x "+ mult9 +" = " + solve);
            solve = num1 * mult10;
            System.out.println(num1 + " x "+ mult10 +" = " + solve);
            solve = num1 * mult11;
            System.out.println(num1 + " x "+ mult11 +" = " + solve);
            solve = num1 * mult12;
            System.out.println(num1 + " x "+ mult12 +" = " + solve);
        } else {
            System.out.println("El número ingresado no está en el rango válido.");
            
        }
    }
}
