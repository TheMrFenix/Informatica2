package Parcial1.Practica5;
public class Ejercicio1 {
    public static void main(String[] args){
        int size = 3;
        int totalLimit = 4000000;
        int[] fibArray = new int[size];
        fibArray[0] = 0;  fibArray[1] = 1;
        int total = 0;
        while( true ) {
            fibArray[2] = fibArray[0] + fibArray[1] ;
            if((fibArray[2]%2) ==0) {
                if((total + fibArray[2]) >= totalLimit) {
                    break;
                }
                total += fibArray[2];
            }
            System.out.println(fibArray[2]);
            fibArray[0] = fibArray[1] ;
            fibArray[1] = fibArray[2] ;
        }
        System.out.println("Total "+  total );
    }
}
