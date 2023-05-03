package parcial2.prueba1;
public class Card extends Payments {
    private int number;
    private int cvv;
    private int date;
    public Card() {
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    @Override
    public String toString() {
        return "Card{" +
                "id='" + getId() + '\'' +
                "number=" + number +
                ", cvv=" + cvv +
                ", date=" + date +
                '}';
    }
}
