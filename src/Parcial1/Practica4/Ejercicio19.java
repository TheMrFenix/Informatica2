package Parcial1.Practica4;
import  java.util.Random;
public class Ejercicio19 {
    public static void main(String[] args){
        int R=6, C=5;
        int [][] matriz= new int[R][C];
        Random rnd= new Random();
        for (int i=0; i<R; i++){
            for (int j=0; j<C; j++){
                matriz[i][j]= rnd.nextInt(10);
            }
        }
        int [] sumaReglones= new int[R];
        for (int i=0; i<R; i++) {
            int suma=0;
            for (int j=0; j<C; j++){
                suma+=matriz[i][j];
            }
            sumaReglones[i]=suma;
        }
        int[] sumaColumnas= new int[C];
        for (int j=0;j<C; j++){
            int suma=0;
            for (int i=0; i<R; i++){
                suma+= matriz[i][j];
            }
            sumaColumnas[j]=suma;
        }
        System.out.println("Matriz:");
        for (int i=0; i<R; i++){
            for (int j=0;j<C;j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Suma de reglones: ");
        for (int i=0; i<R; i++){
            System.out.print(sumaReglones[i]+" ");
        }
        System.out.println();
        System.out.println("Suma de columnas: ");
        for (int j=0; j<C; j++){
            System.out.print(sumaColumnas[j]+" ");
        }
        System.out.println();
    }
}

