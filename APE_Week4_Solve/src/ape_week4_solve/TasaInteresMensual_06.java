package ape_week4_solve;
import java.util.Scanner;
public class TasaInteresMensual_06 {
    public static void main(String[] args) {
    double prest , tasa, resultado ;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el prestamo total ($) de su banco");
    prest = sc.nextDouble();
    System.out.println("Ingrese la tasa de interes anual (%) que le cobra");
    tasa =  sc.nextDouble();
    resultado = (prest*(tasa*0.01))/12 ;
        System.out.println("Usted tiene que pagar "+ resultado +"$"+ " cada mes");
}
}
