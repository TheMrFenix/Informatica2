package Parcial1.Practica3;
import java.util.*;
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Cb, Gn,N=0,Nn=1;
        System.out.println("Ingrese el la cantidad de numeros que de desea calcular:");
        Gn= sc.nextInt();
        for (int i=0; i<Gn; i++){
            Cb=Nn*Nn*Nn;
            System.out.println("El cubo de "+(N+1)+" es: "+Cb);
            N++;
            Nn++;
        }
    }
}
