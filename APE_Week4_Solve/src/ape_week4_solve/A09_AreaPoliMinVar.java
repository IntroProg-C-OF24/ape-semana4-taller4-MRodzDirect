package ape_week4_solve;
import java.util.Scanner;
public class A09_AreaPoliMinVar {
    public static void main(String[] args) {
        double altTri, anchoCuad, areaTotal ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Lado del Cuadrado");
        anchoCuad = sc.nextDouble();
        System.out.println("Ingrese el Alto del Triangulo");
        altTri = sc.nextDouble();
        areaTotal = ((anchoCuad*altTri)+(3*((anchoCuad*altTri)/2)+(Math.pow(anchoCuad,2)))) ;
        System.out.println("El area del Poligono es: "+ areaTotal +" cm");
        sc.close();     
        
        // Por: MRodzDirect 😉
    }
}
