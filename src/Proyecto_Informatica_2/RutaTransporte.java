package Proyecto_Informatica_2;
import java.util.ArrayList;
import java.util.Scanner;
public class RutaTransporte extends Transporte{
    private int numeroPedido_Tpt;
    private String tipoTransporte_Tpt;
    private String ciudadSalida_Tpt;
    private String ciudadLlegada_Tpt;
    private int horasdiasViaje_Tpt;
    private double distancia_Tpt;
    public RutaTransporte() {
    }
    public int getNumeroPedido_Tpt() {
        return numeroPedido_Tpt;
    }
    public void setNumeroPedido_Tpt(int numeroPedido_Tpt) {
        this.numeroPedido_Tpt = numeroPedido_Tpt;
    }
    public String getTipoTransporte_Tpt() {
        return tipoTransporte_Tpt;
    }
    public void setTipoTransporte_Tpt(String tipoTransporte_Tpt) {
        this.tipoTransporte_Tpt = tipoTransporte_Tpt;
    }
    public String getCiudadSalida_Tpt() {
        return ciudadSalida_Tpt;
    }
    public void setCiudadSalida_Tpt(String ciudadSalida_Tpt) {
        this.ciudadSalida_Tpt = ciudadSalida_Tpt;
    }
    public String getCiudadLlegada_Tpt() {
        return ciudadLlegada_Tpt;
    }
    public void setCiudadLlegada_Tpt(String ciudadLlegada_Tpt) {
        this.ciudadLlegada_Tpt = ciudadLlegada_Tpt;
    }
    public int getHorasdiasViaje_Tpt() {
        return horasdiasViaje_Tpt;
    }
    public void setHorasdiasViaje_Tpt(int horasdiasViaje_Tpt) {
        this.horasdiasViaje_Tpt = horasdiasViaje_Tpt;
    }
    public double getDistancia_Tpt() {
        return distancia_Tpt;
    }
    public void setDistancia_Tpt(double distancia_Tpt) {
        this.distancia_Tpt = distancia_Tpt;
    }
    @Override
    public String toString() {
        return "Ruta de Transporte{" +
                "Numero de Pedido: " + numeroPedido_Tpt +
                ", Tipo de Transporte: '" + tipoTransporte_Tpt + '\'' +
                ", Ciudad de Salida: '" + ciudadSalida_Tpt + '\'' +
                ", Ciudad de Llegada: '" + ciudadLlegada_Tpt + '\'' +
                ", Horas/Dias de Viaje: " + horasdiasViaje_Tpt +
                ", Distancia: " + distancia_Tpt +
                '}';
    }
    public void MenuRutaTransporte(){
        Scanner sc=new Scanner(System.in);
        RutaCliente rc=new RutaCliente();
        RutaTransporte rutaT=new RutaTransporte();
        Tierra tierra=new Tierra();
        Agua agua=new Agua();
        Aire aire=new Aire();
        ArrayList<RutaTransporte> datosRutaTransporte=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Ruta de transporte");
            System.out.println("║ 1- Numero de pedido asignado");
            System.out.println(rc.getNumeroPedido_Clt());
            rutaT.setNumeroPedido_Tpt(rc.getNumeroPedido_Clt());
            System.out.println("║ 2- Tipo de transporte asignado");
            System.out.println(rc.getTipoTransporte_Clt());
            rutaT.setTipoTransporte_Tpt(rc.getTipoTransporte_Clt());
            if (rc.getTipoTransporte_Clt().equals("Tierra")){
                System.out.println("║ 3- Pais de salida asignado");
                System.out.println(rc.getCiudadSalida_Clt());
                rutaT.setCiudadSalida_Tpt(rc.getCiudadSalida_Clt());
                System.out.println("╚ 4- Pais de llegada asignada");
                System.out.println(rc.getCiudadLlegada_Clt());
                rutaT.setCiudadLlegada_Tpt(rc.getCiudadLlegada_Clt());
                datosRutaTransporte.add(rutaT);
                System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
                op=sc.nextInt();
                if (op == 0) {
                    tierra.MenuTierra();
                }
            } else if (rc.getTipoTransporte_Clt().equals("Agua")){
                System.out.println("║ 3- Pais de salida asignado");
                System.out.println(rc.getCiudadSalida_Clt());
                rutaT.setCiudadSalida_Tpt(rc.getCiudadSalida_Clt());
                System.out.println("║ 4- Pais de llegada asignada");
                System.out.println(rc.getCiudadLlegada_Clt());
                rutaT.setCiudadLlegada_Tpt(rc.getCiudadLlegada_Clt());
                datosRutaTransporte.add(rutaT);
                System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
                op=sc.nextInt();
                if (op == 0) {
                    agua.MenuAgua();
                }
            } else if (rc.getTipoTransporte_Clt().equals("Aire")) {
                System.out.println("║ 3- Pais de salida asignado");
                System.out.println(rc.getCiudadSalida_Clt());
                rutaT.setCiudadSalida_Tpt(rc.getCiudadSalida_Clt());
                System.out.println("║ 4- Pais de llegada asignada");
                System.out.println(rc.getCiudadLlegada_Clt());
                rutaT.setCiudadLlegada_Tpt(rc.getCiudadLlegada_Clt());
                datosRutaTransporte.add(rutaT);
                System.out.print("(press 1) if you wanna go back/(press 0) to keep going: ");
                op=sc.nextInt();
                if (op == 0) {
                    aire.MenuAire();
                }
            }
        } while (1!=op);
    }
}
