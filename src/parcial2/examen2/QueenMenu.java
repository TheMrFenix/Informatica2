package parcial2.examen2;
public class QueenMenu {
    private int cantidadDelPedido;
    public QueenMenu() {
    }
    public int getCantidadDelPedido() {
        return cantidadDelPedido;
    }
    public void setCantidadDelPedido(int cantidadDelPedido) {
        this.cantidadDelPedido = cantidadDelPedido;
    }
    @Override
    public String toString() {
        return "QueenMenu{" +
                "cantidadDelPedido=" + cantidadDelPedido +
                '}';
    }
}