package Parcial1.Practica1;
import java.util.*;
class Ejercicio20 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Double E1,E2,E3,Pro;
        System.out.println("Ingrese el puntaje del examen 1: ");
        E1= sc.nextDouble();
        System.out.println("Ingrese el puntaje del examen 2: ");
        E2= sc.nextDouble();
        System.out.println("Ingrese el puntaje del examen 3: ");
        E3= sc.nextDouble();
        E1=E1*0.25;
        E2=E2*0.25;
        E3=E3*0.5;
        Pro=E1+E2+E3;
        System.out.println("El promedio total es de: "+Pro);
    }
}
