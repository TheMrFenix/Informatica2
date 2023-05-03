package Parcial1.Practica4;
import java.util.Random;
public class Ejercicio11{
    public static void main(String[] args) {
        int MatrizA [][] = new int [12][12];
        int MatrizB [][] = new int [12][12];
        Random rnd=new Random();

        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                MatrizA [i][j] = rnd.nextInt(20);
            }
        }
        for (int i=0; i<12; i++){
            for (int j=0; j<12; j++){
                MatrizB[i][j] = rnd.nextInt(20);
            }
        }
        boolean diagonales=true;
        for (int i=0; i<12; i++){
            if (MatrizA[i][i] != MatrizB[i][i]){
                diagonales=false;
                break;
            }
        }
        if (diagonales){
            System.out.println("Las diagonales son iguales");
        } else {
            System.out.println("Las diagonales no son iguales");
        }
    }
}
