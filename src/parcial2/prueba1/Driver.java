package parcial2.prueba1;
public class Driver extends Account {
    private String email;
    private String password;
    public Driver() {
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "Driver{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", document='" + getDocument() + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
