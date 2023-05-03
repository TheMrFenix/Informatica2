package parcial2.prueba1;
public class UberX extends Car{
    private String brand;
    private String model;
    public UberX() {
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "UberX{" +
                "id=" + getId() +
                "license=" + getLicense() +
                ", driver=" + getDriver() +
                ", passenger=" + getPassenger() +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}