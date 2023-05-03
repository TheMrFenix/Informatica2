package parcial2.prueba1;
public class Car extends Trip{
    private int license;
    private Driver driver;
    private User passenger;
    public Car() {
    }
    public int getLicense() {
        return license;
    }
    public void setLicense(int license) {
        this.license = license;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    public User getPassenger() {
        return passenger;
    }
    public void setPassenger(User passenger) {
        this.passenger = passenger;
    }
    @Override
    public String toString() {
        return "Car{" +
                "id=" + getId() +
                "license=" + license +
                ", driver=" + driver +
                ", passenger=" + passenger +
                '}';
    }
}