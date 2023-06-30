package Proyecto_Informatica_2;
public class PagoCliente extends RutaCliente{
    private int cuentaBancaria_Clt;
    private double cantidadPago_Clt;
    public PagoCliente() {
    }
    public int getCuentaBancaria_Clt() {
        return cuentaBancaria_Clt;
    }
    public void setCuentaBancaria_Clt(int cuentaBancaria_Clt) {
        this.cuentaBancaria_Clt = cuentaBancaria_Clt;
    }
    public double getCantidadPago_Clt() {
        return cantidadPago_Clt;
    }
    public void setCantidadPago_Clt(double cantidadPago_Clt) {
        this.cantidadPago_Clt = cantidadPago_Clt;
    }
    @Override
    public String toString() {
        return "Pago del Cliente{" +
                "por Peso de Mercancias: " + getPeso_Clt() +
                ", Cuenta Bancaria: " + cuentaBancaria_Clt +
                ", Cantidad de Pago: " + cantidadPago_Clt +
                '}';
    }
    public double calcularPago(){
        RutaCliente ruta_Clt=new RutaCliente();
        double peso= ruta_Clt.getPeso_Clt();
        double distancia= ruta_Clt.getDistancia_Clt();
        double p = peso*distancia*0.1;
        double pago= p+100000;
        return pago;
    }
}
