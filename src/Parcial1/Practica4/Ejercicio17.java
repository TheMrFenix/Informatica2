package Parcial1.Practica4;
import java.util.Random;
public class Ejercicio17 {
    public static void main(String[] args){
        Random rnd=new Random();
        String [] nombres={"Juan","Pedro","Maria","Luis","Ana"};
        int [][] horasTrabajadas = new int[5][6];
        double [] sueldoHora = {10.0,12.0,15.0,11.0,13.0};
        int horasTotales, maxHoraL=0;
        double sueldoSemanal,totalPago=0.0;
        String trabajoMaxHL="";
        for (int i=0; i<5; i++){
            for (int j=0; j<6; j++){
                horasTrabajadas[i][j]= rnd.nextInt(8)+1;
            }
        }
        System.out.println("Reporte de horas trabajadas y sueldo semanal:");
        for (int i=0; i<5; i++){
            horasTotales=0;
            sueldoSemanal=0.0;
            for (int j=0; j<6; j++){
                horasTotales+=horasTrabajadas[i][j];
                sueldoSemanal+=horasTrabajadas[i][j]*sueldoHora[i];
                if (j == 0 && horasTrabajadas[i][j] > maxHoraL){
                    maxHoraL=horasTrabajadas[i][j];
                    trabajoMaxHL=nombres[i];
                }
            }
            System.out.printf("%s: %d horas trabajadas, sueldo semanal de $%.2f%n",nombres[i],horasTotales,sueldoSemanal);
            totalPago+=sueldoSemanal;
            System.out.printf("Total que pagara la empresa: $%.2f%n",totalPago);
            System.out.printf("El trabajador que trabaja mas horas el dia lunes es %s, con %d horas%n",trabajoMaxHL, maxHoraL);
        }
    }
}
