package parcial2.prueba1;
public class Paypal extends Payments {
    private String email;
    public Paypal() {
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Paypal{" +
                "id='" + getId() + '\'' +
                "email='" + email + '\'' +
                '}';
    }
}