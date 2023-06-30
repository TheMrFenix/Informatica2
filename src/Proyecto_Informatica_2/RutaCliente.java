package Proyecto_Informatica_2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class RutaCliente extends Cliente{
    private int numeroPedido_Clt; // Clt=Cliente
    private String tipoTransporte_Clt; // por tierra, agua o aire.
    private String ciudadSalida_Clt;
    private String ciudadLlegada_Clt;
    private String tipoMercancias_Clt;
    private int cantidadMercancias_Clt;
    private double peso_Clt;
    private String destinatario_Clt;
    private double distancia_Clt;
    public RutaCliente() {
    }
    public int getNumeroPedido_Clt() {
        return numeroPedido_Clt;
    }
    public void setNumeroPedido_Clt(int numeroPedido_Clt) {
        this.numeroPedido_Clt = numeroPedido_Clt;
    }
    public String getTipoTransporte_Clt() {
        return tipoTransporte_Clt;
    }
    public void setTipoTransporte_Clt(String tipoTransporte_Clt) {
        this.tipoTransporte_Clt = tipoTransporte_Clt;
    }
    public String getCiudadSalida_Clt() {
        return ciudadSalida_Clt;
    }
    public void setCiudadSalida_Clt(String ciudadSalida_Clt) {
        this.ciudadSalida_Clt = ciudadSalida_Clt;
    }
    public String getCiudadLlegada_Clt() {
        return ciudadLlegada_Clt;
    }
    public void setCiudadLlegada_Clt(String ciudadLlegada_Clt) {
        this.ciudadLlegada_Clt = ciudadLlegada_Clt;
    }
    public String getTipoMercancias_Clt() {
        return tipoMercancias_Clt;
    }
    public void setTipoMercancias_Clt(String tipoMercancias_Clt) {
        this.tipoMercancias_Clt = tipoMercancias_Clt;
    }
    public int getCantidadMercancias_Clt() {
        return cantidadMercancias_Clt;
    }
    public void setCantidadMercancias_Clt(int cantidadMercancias_Clt) {
        this.cantidadMercancias_Clt = cantidadMercancias_Clt;
    }
    public double getPeso_Clt() {
        return peso_Clt;
    }
    public void setPeso_Clt(double peso_Clt) {
        this.peso_Clt = peso_Clt;
    }
    public String getDestinatario_Clt() {
        return destinatario_Clt;
    }
    public void setDestinatario_Clt(String destinatario_Clt) {
        this.destinatario_Clt = destinatario_Clt;
    }
    public double getDistancia_Clt(){
        return distancia_Clt;
    }
    public void setDistancia_Clt(double distancia_Clt){
        this.distancia_Clt = distancia_Clt;
    }
    @Override
    public String toString() {
        return "Ruta del Cliente{" +
                " Numero de Pedido: " + numeroPedido_Clt +
                ", Tipo de Transporte: '" + tipoTransporte_Clt + '\'' +
                ", Ciudad de Salida: '" + ciudadSalida_Clt + '\'' +
                ", Ciudad de Llegada: '" + ciudadLlegada_Clt + '\'' +
                ", Tipo de Mercancias: '" + tipoMercancias_Clt + '\'' +
                ", Cantidad de Mercancias: " + cantidadMercancias_Clt +
                ", Peso: " + peso_Clt +
                ", Destinatario: '" + destinatario_Clt + '\'' +
                ", Distancia: '" + distancia_Clt + '\'' +
                '}';
    }
    public void MenuRutaCliente(){
        Scanner sc=new Scanner(System.in);
        Random rnd=new Random();
        PagoCliente pc=new PagoCliente();
        RutaCliente rutaCliente=new RutaCliente();
        ArrayList<RutaCliente> DatosRutaCliente=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Registro de ruta");
            int rnp= rnd.nextInt(20);
            System.out.println("║ Numero de pedido ["+rnp+"]");
            System.out.print("║ 1- Ingrese numero de pedido:");
            int nump=sc.nextInt();
            rutaCliente.setNumeroPedido_Clt(nump);
            System.out.println("║ Tipos de transporte (Tierra, Agua, Aire)");
            System.out.print("║ 2- Ingrese tipo de transporte:");
            String tipot=sc.next();
            if (tipot.equals("Tierra")||tipot.equals("Agua")||tipot.equals("Aire")){
                rutaCliente.setTipoTransporte_Clt(tipot);
                System.out.print("║ 3- Ingresar ciudad de salida:");
                String cs=sc.next();
                rutaCliente.setCiudadSalida_Clt(cs);
                System.out.print("║ 4- Ingresar ciudad de llegada:");
                String cll=sc.next();
                rutaCliente.setCiudadLlegada_Clt(cll);
                System.out.print("║ 5- Ingresar tipo de mercancias:");
                String tm=sc.next();
                rutaCliente.setTipoMercancias_Clt(tm);
                System.out.print("║ 6- Ingresar cantidad de mercancias:");
                int cm=sc.nextInt();
                rutaCliente.setCantidadMercancias_Clt(cm);
                System.out.print("║ 7- Ingresar peso:");
                double peso=sc.nextDouble();
                rutaCliente.setPeso_Clt(peso);
                System.out.print("║ 8- Ingresar destinatario:");
                String dest=sc.next();
                rutaCliente.setDestinatario_Clt(dest);
                System.out.print("╚ 9- Ingresar distancia:");
                double dist=sc.nextDouble();
                rutaCliente.setDistancia_Clt(dist);
                System.out.println("Estos son los datos que ingresaste");
                System.out.println(rutaCliente.toString());
                DatosRutaCliente.add(rutaCliente);
            } else {
                System.out.println("tipo incorreto");
            }
            System.out.println("(press 1) if you wanna go back/(press 0) to keep going:");
            op=sc.nextInt();
            if (op==0){
                pc.CalcularPago();
            }
        } while (op!=1);
    }
    public void CalcularPago(){
        Scanner sc=new Scanner(System.in);
        PagoCliente pagoC=new PagoCliente();
        ArrayList<PagoCliente> datosDePago=new ArrayList<>();
        int op=0;
        do {
            System.out.println("╔ Datos de pago");
            System.out.print("║ 1- Ingresar cuenta bancaria:");
            int cb=sc.nextInt();
            pagoC.setCuentaBancaria_Clt(cb);
            System.out.println("║ Cantidad a pagar");
            System.out.println(pagoC.calcularPago());
            System.out.print("╚ 2- Ingresar la cantidad de pago:");
            double can=sc.nextDouble();
            if (can== pagoC.calcularPago()) {
                pagoC.setCantidadPago_Clt(can);
                System.out.println("Datos ingrasados");
                System.out.println(pagoC.toString());
                datosDePago.add(pagoC);
            } else {
                System.out.println("vuelva a intentarlo");
            }
            System.out.println("(press 1) if you wanna go back/(press 0) to keep going:");
            op=sc.nextInt();
        } while (op!=1);
    }
}
