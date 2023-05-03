package parcial2.examen2;
public class Menu{
    private String cartaDelDia;
    public Menu() {
    }
    public String getCartaDelDia() {
        return cartaDelDia;
    }
    public void setCartaDelDia(String cartaDelDia) {
        this.cartaDelDia = cartaDelDia;
    }
    @Override
    public String toString() {
        return "Menu{" +
                "cartaDelDia=" + cartaDelDia +
                '}';
    }
}
