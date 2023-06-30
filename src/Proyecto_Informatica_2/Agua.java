package Proyecto_Informatica_2;
import java.util.ArrayList;
import java.util.Scanner;
public class Agua extends RutaTransporte{
    private String  tipoVehiculo_Tpt;
    private int  cantidadMercancias_Tpt;
    private double pesoMercancias_Tpt;
    private String proveedor_Tpt;
    private String destinatario_Tpt;
    private String posicionTrabajo_Tpt;
    public Agua() {
    }
    public String getTipoVehiculo_Tpt() {
        return tipoVehiculo_Tpt;
    }
    public void setTipoVehiculo_Tpt(String tipoVehiculo_Tpt) {
        this.tipoVehiculo_Tpt = tipoVehiculo_Tpt;
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
        return "Transporte por Mar{" +
                "Tipo de Vehiculo: '" + tipoVehiculo_Tpt + '\'' +
                ", Cantidad de Mercancias: " + cantidadMercancias_Tpt +
                ", Peso de Mercancias: " + pesoMercancias_Tpt +
                ", Proveedor: '" + proveedor_Tpt + '\'' +
                ", Destinatario: '" + destinatario_Tpt + '\'' +
                ", Posicion de Trabajo: '" + posicionTrabajo_Tpt + '\'' +
                '}';
    }
    public void MenuAgua(){
        Scanner sc=new Scanner(System.in);
        RutaCliente rc=new RutaCliente();
        Cliente cliente=new Cliente();
        Agua agua=new Agua();
        ArrayList<Agua> DatosAgua=new ArrayList<>();
        Informe informe=new Informe();
        int op=0;
        do {
            System.out.println("╔ Area Maritima");
            System.out.println("║ 1- Cantidad de mercancias asignada");
            System.out.println(rc.getCantidadMercancias_Clt());
            agua.setCantidadMercancias_Tpt(rc.getCantidadMercancias_Clt());
            System.out.println("║ 2- Peso de mercancias asignada");
            System.out.println(rc.getPeso_Clt());
            agua.setPesoMercancias_Tpt(rc.getPeso_Clt());
            System.out.println("║ 3- Proveedor asignado");
            System.out.println(cliente.getNombreCE_Clt());
            agua.setProveedor_Tpt(cliente.getNombreCE_Clt());
            System.out.println("╚ 4- Destinatario asignado");
            System.out.println(rc.getDestinatario_Clt());
            agua.setDestinatario_Tpt(rc.getDestinatario_Clt());
            DatosAgua.add(agua);
            System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
            op=sc.nextInt();
            if (op == 0) {
                informe.InformeTransporte();
            }
        } while (op!=1);
    }
}
