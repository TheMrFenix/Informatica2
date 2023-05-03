package Parcial1.Practica3;
import java.util.*;
public class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Ang;
        double Hip,Opu,sen;
        System.out.print("Ingrese la hipotenusa:");
        Hip=sc.nextDouble();
        System.out.print("Ingrese el cateto opuesto: ");
        Opu= sc.nextDouble();
        System.out.print("Ingrese el angulo: ");
        Ang=sc.nextInt();
        if (Ang != 0){
            sen=Hip/Opu;
            System.out.print("El seno es: "+sen);
        } else {
            System.out.print("El angulo debe ser distino de 0");
        }
    }
}