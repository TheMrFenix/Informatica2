package parcial2.examen2;
public class MedioPollo {
    private int cantidadDelPedido;
    public MedioPollo() {
    }
    public int getCantidadDelPedido() {
        return cantidadDelPedido;
    }
    public void setCantidadDelPedido(int cantidadDelPedido) {
        this.cantidadDelPedido = cantidadDelPedido;
    }
    @Override
    public String toString() {
        return "MedioPollo{" +
                "cantidadDelPedido=" + cantidadDelPedido +
                '}';
    }
}
