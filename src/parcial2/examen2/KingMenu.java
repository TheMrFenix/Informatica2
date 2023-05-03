package parcial2.examen2;
public class KingMenu {
    private int cantidadDelPedido;
    public KingMenu() {
    }
    public int getCantidadDelPedido() {
        return cantidadDelPedido;
    }
    public void setCantidadDelPedido(int cantidadDelPedido) {
        this.cantidadDelPedido = cantidadDelPedido;
    }
    @Override
    public String toString() {
        return "KingMenu{" +
                "cantidadDelPedido=" + cantidadDelPedido +
                '}';
    }
}
