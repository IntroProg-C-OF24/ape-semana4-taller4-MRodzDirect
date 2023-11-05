package ape_week4_solve;
import java.util.Scanner;
public class PlanillaLuzDesc_07 {
    public static void main(String[] args) {
    int desc, edad;
    double kilHo, kilSpend, totalDesc, totalNoDesc;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el $ costo de cada kilovatio por hora segun su planilla de Luz");
    kilHo = sc.nextDouble();
    System.out.println("Ingrese la cantidad de kilovatios que ha consumido este mes segun su planilla de Luz");
    kilSpend = sc.nextDouble();
    System.out.println("Ingrese su edad");
    edad = sc.nextInt();
    if (edad>=65){
    System.out.println("Ingrese el descuento (%) que ofrece su plan por mayoria de edad");
    desc = sc.nextInt();
    // check formula regarding kilHo as monthly cost, not hourly
    totalDesc = (kilHo*kilSpend)*(1-(desc*0.01));
        System.out.println("El costo de su planilla de Luz es "+ totalDesc + "$");
    // Alternative: totalDesc = (kilHo*kilSpend)-(kilHo*kilSpend*desc)
    } 
    else {
    totalNoDesc= kilHo * kilSpend;
    System.out.println("El costo de su planilla de Luz es "+ totalNoDesc + "$");
            }
    
    sc.close();
    }
}
