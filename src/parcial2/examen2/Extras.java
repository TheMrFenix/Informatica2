package parcial2.examen2;
public class Extras {
    private int cantidadDelPedido;
    public Extras() {
    }
    public int getCantidadDelPedido() {
        return cantidadDelPedido;
    }
    public void setCantidadDelPedido(int cantidadDelPedido) {
        this.cantidadDelPedido = cantidadDelPedido;
    }
    @Override
    public String toString() {
        return "Extras{" +
                "cantidadDelPedido=" + cantidadDelPedido +
                '}';
    }
}
