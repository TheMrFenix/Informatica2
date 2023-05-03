package parcial2.examen2;
public class Pedido {
    private int id;
    public Pedido() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                '}';
    }
}