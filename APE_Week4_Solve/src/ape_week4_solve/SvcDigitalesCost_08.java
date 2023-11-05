package ape_week4_solve;
import java.util.Scanner;
public class SvcDigitalesCost_08 {
    public static void main(String[] args) {
        double netflix, spotify, youtube, dropbox, totalNoDesc, totalDesc;
        int edad, desc;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el costo de su suscripcion mensual en Netflix");
        netflix = sc.nextDouble();
        System.out.println("Ingrese el costo de su suscripcion mensual en Spotify");
        spotify = sc.nextDouble();
        System.out.println("Ingrese el costo de su suscripcion mensual en YouTube");
        youtube = sc.nextDouble();
        System.out.println("Ingrese el costo de su suscripcion mensual en Dropbox");
        dropbox = sc.nextDouble();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        if (edad <=30){
            System.out.println("Ingrese el descuento (%) por contratar este pack de servicios");
            desc = sc.nextInt();
            totalDesc= (netflix+spotify+youtube+dropbox)*(1-(desc*0.01));
            System.out.println("Su total a pagar es: "+ totalDesc + " $");
    
        } 
        else {
            totalNoDesc = (netflix+spotify+youtube+dropbox);
            System.out.println("Su total a pagar es: "+ totalNoDesc + " $");
        }
         sc.close();
}
}