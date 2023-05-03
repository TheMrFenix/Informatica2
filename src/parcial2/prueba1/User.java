package parcial2.prueba1;
public class User extends Account{
    @Override
    public String toString() {
        return "User{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", document='" + getDocument() + '\'' +
                '}';
    }
}
