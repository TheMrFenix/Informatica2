package Parcial1.Practica3;
import java.util.*;
public class Ejercicio14 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Ca, Na, ContA=0, ContB=0;
        System.out.println("Ingrese la cantidad de alumnos: ");
        Na= sc.nextInt();
        for (int i=1; i<=Na; i++){
            System.out.println("Ingrese la calificacion de el alumno "+i+"(0-100): ");
            Ca= sc.nextInt();
            if (Ca >50){
                ContA++;
            } else {
                ContB++;
            }
        }
        System.out.println("La cantidad de aprobados es de: "+ContA);
        System.out.println("La cantidad de reprobados es de: "+ContB);
    }
}