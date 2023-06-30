package Proyecto_Informatica_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Tierra extends RutaTransporte{
    private int  cantidadMercancias_Tpt;
    private double pesoMercancias_Tpt;
    private String proveedor_Tpt;
    private String destinatario_Tpt;
    private String posicionTrabajo_Tpt;
    public Tierra() {
    }
    public int getCantidadMercancias_Tpt() {
        return cantidadMercancias_Tpt;
    }
    public void setCantidadMercancias_Tpt(int cantidadMercancias_Tpt) {
        this.cantidadMercancias_Tpt = cantidadMercancias_Tpt;
    }
    public double getPesoMercancias_Tpt() {
        return pesoMercancias_Tpt;
    }
    public void setPesoMercancias_Tpt(double pesoMercancias_Tpt) {
        this.pesoMercancias_Tpt = pesoMercancias_Tpt;
    }
    public String getProveedor_Tpt() {
        return proveedor_Tpt;
    }
    public void setProveedor_Tpt(String proveedor_Tpt) {
        this.proveedor_Tpt = proveedor_Tpt;
    }
    public String getDestinatario_Tpt() {
        return destinatario_Tpt;
    }
    public void setDestinatario_Tpt(String destinatario_Tpt) {
        this.destinatario_Tpt = destinatario_Tpt;
    }
    public String getPosicionTrabajo_Tpt() {
        return posicionTrabajo_Tpt;
    }
    public void setPosicionTrabajo_Tpt(String posicionTrabajo_Tpt) {
        this.posicionTrabajo_Tpt = posicionTrabajo_Tpt;
    }
    @Override
    public String toString() {
        return "Transporte por Tierra{" +
                "Cantidad de Mercancias: " + cantidadMercancias_Tpt +
                ", Peso de Mercancias: " + pesoMercancias_Tpt +
                ", Proveedor: '" + proveedor_Tpt + '\'' +
                ", Destinatario: '" + destinatario_Tpt + '\'' +
                ", Posicion de Trabajo: '" + posicionTrabajo_Tpt + '\'' +
                '}';
    }
    public void MenuTierra(){
        Scanner sc=new Scanner(System.in);
        RutaCliente rc=new RutaCliente();
        Cliente cliente=new Cliente();
        Tierra tierra=new Tierra();
        ArrayList<Tierra> DatosTierra=new ArrayList<>();
        Informe informe=new Informe();
        int op=0;
        do {
            System.out.println("╔ Area Terrestre");
            System.out.println("║ 1- Cantidad de mercancias asignada");
            System.out.println(rc.getCantidadMercancias_Clt());
            tierra.setCantidadMercancias_Tpt(rc.getCantidadMercancias_Clt());
            System.out.println("║ 2- Peso de mercancias asignada");
            System.out.println(rc.getPeso_Clt());
            tierra.setPesoMercancias_Tpt(rc.getPeso_Clt());
            System.out.println("║ 3- Proveedor asignado");
            System.out.println(cliente.getNombreCE_Clt());
            tierra.setProveedor_Tpt(cliente.getNombreCE_Clt());
            System.out.println("╚ 4- Destinatario asignado");
            System.out.println(rc.getDestinatario_Clt());
            tierra.setDestinatario_Tpt(rc.getDestinatario_Clt());
            DatosTierra.add(tierra);
            System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
            op=sc.nextInt();
            if (op == 0) {
                informe.InformeTransporte();
            }
        } while (op!=1);
    }
}
