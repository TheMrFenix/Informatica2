package parcial2.examen2;
public class Tarjeta extends Pago{
    private int numero;
    private int cvv;
    private int fecha;
    public Tarjeta() {
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCvv() {
        return cvv;
    }
    public void setCvv(int cvv) {
        this.cvv = cvv;
    }
    public int getFecha() {
        return fecha;
    }
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    @Override
    public String toString() {
        return "Tarjeta{" +
                "id='" + getId() + '\'' +
                "numero=" + numero +
                ", cvv=" + cvv +
                ", fecha=" + fecha +
                '}';
    }
}
