package Parcial1.Practica4;
import java.util.Random;
public class Ejercicio13 {
    public static void main(String[] args){
        int [] calificaciones = new int[100];
        Random rnd= new Random();
        double suma=0;
        int contador=0;
        for(int i=0; i<100; i++){
            calificaciones[i]= rnd.nextInt(101);
            System.out.print(calificaciones[i]+" ");
            suma += calificaciones[i];
        }
        double promedio=suma/100;
        System.out.println();
        System.out.println("La califica promedio del grupo es: "+promedio);
        for(int i=0; i<100; i++){
            if (calificaciones[i]>promedio){
                contador++;
            }
        }
        System.out.println("El numero de estudiantes con calificaciones por encima del promeio es: "+contador);
    }
}
