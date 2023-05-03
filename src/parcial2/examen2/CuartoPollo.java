package parcial2.examen2;
public class CuartoPollo {
    private int cantidadDelPedido;
    public CuartoPollo() {
    }
    public int getCantidadDelPedido() {
        return cantidadDelPedido;
    }
    public void setCantidadDelPedido(int cantidadDelPedido) {
        this.cantidadDelPedido = cantidadDelPedido;
    }
    @Override
    public String toString() {
        return "CuartoPollo{" +
                "cantidadDelPedido=" + cantidadDelPedido +
                '}';
    }
}