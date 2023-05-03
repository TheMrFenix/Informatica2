package parcial2.prueba1;
class UberBlack extends  Car{
    private String typeCarAccepted;
    private String seatsMaterial;
    public UberBlack() {
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
        return "UberBlack{" +
                "id=" + getId() +
                "license=" + getLicense() +
                ", driver=" + getDriver() +
                ", passenger=" + getPassenger() +
                "typeCarAccepted='" + typeCarAccepted + '\'' +
                ", seatsMaterial='" + seatsMaterial + '\'' +
                '}';
    }
}