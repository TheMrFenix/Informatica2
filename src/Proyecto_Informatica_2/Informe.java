package Proyecto_Informatica_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Informe {
    private String estadoInicialViaje_Tpt;
    private String estadoDuranteViaje_Tpt;
    private String estadoFinalViaje_Tpt;
    private String observaciones_Tpt;
    public Informe() {
    }
    public String getEstadoInicialViaje_Tpt() {
        return estadoInicialViaje_Tpt;
    }
    public void setEstadoInicialViaje_Tpt(String estadoInicialViaje_Tpt) {
        this.estadoInicialViaje_Tpt = estadoInicialViaje_Tpt;
    }
    public String getEstadoDuranteViaje_Tpt() {
        return estadoDuranteViaje_Tpt;
    }
    public void setEstadoDuranteViaje_Tpt(String estadoDuranteViaje_Tpt) {
        this.estadoDuranteViaje_Tpt = estadoDuranteViaje_Tpt;
    }
    public String getEstadoFinalViaje_Tpt() {
        return estadoFinalViaje_Tpt;
    }
    public void setEstadoFinalViaje_Tpt(String estadoFinalViaje_Tpt) {
        this.estadoFinalViaje_Tpt = estadoFinalViaje_Tpt;
    }
    public String getObservaciones_Tpt() {
        return observaciones_Tpt;
    }
    public void setObservaciones_Tpt(String observaciones_Tpt) {
        this.observaciones_Tpt = observaciones_Tpt;
    }
    @Override
    public String toString() {
        return "Informe de Transporte{" +
                "Estado Inicial del Viaje: '" + estadoInicialViaje_Tpt + '\'' +
                ", Estado Durante el Vieaje: '" + estadoDuranteViaje_Tpt + '\'' +
                ", Estado Final del Viaje: '" + estadoFinalViaje_Tpt + '\'' +
                ", Observaciones: '" + observaciones_Tpt + '\'' +
                '}';
    }
    public void InformeTransporte(){
        Scanner sc=new Scanner(System.in);
        Informe informe=new Informe();
        ArrayList<Informe> datosInforme=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Informe de Transporte");
            System.out.print("║ 1- Ingrese el estado inicial del viaje:");
            String inicial=sc.next();
            informe.setEstadoInicialViaje_Tpt(inicial);
            System.out.print("║ 2- Ingrese el estado durante el viaje:");
            String durante=sc.next();
            informe.setEstadoDuranteViaje_Tpt(durante);
            System.out.print("║ 3- Ingrese el estado final del viaje:");
            String fin=sc.next();
            informe.setEstadoFinalViaje_Tpt(fin);
            System.out.print("╚ 4- Ingrese sus observaciones:");
            String obs=sc.next();
            informe.setObservaciones_Tpt(obs);
            datosInforme.add(informe);
            System.out.println("Estos son los datos que ingresaste");
            System.out.println(informe.toString());
            System.out.println("to get the hell out of here press 1:");
            op=sc.nextInt();
        } while (op!=1);
    }
}
