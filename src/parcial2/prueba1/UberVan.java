package parcial2.prueba1;
public class UberVan extends Car {
    private String typeCarAccepted;
    private String seatsMaterial;
    public UberVan() {
    }
    public String getTypeCarAccepted() {
        return typeCarAccepted;
    }
    public void setTypeCarAccepted(String typeCarAccepted) {
        this.typeCarAccepted = typeCarAccepted;
    }
    public String getSeatsMaterial() {
        return seatsMaterial;
    }
    public void setSeatsMaterial(String seatsMaterial) {
        this.seatsMaterial = seatsMaterial;
    }

    @Override
    public String toString() {
        return "UberVan{" +
                "id=" + getId() +
                "license=" + getLicense() +
                ", driver=" + getDriver() +
                ", passenger=" + getPassenger() +
                "typeCarAccepted='" + typeCarAccepted + '\'' +
                ", seatsMaterial='" + seatsMaterial + '\'' +
                '}';
    }
}
