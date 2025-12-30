public abstract class Vehicle {
    protected String brand;
    protected int year;
    protected Driver driver;

    protected Vehicle(String brand, int year, Driver driver) {
        this.brand = brand;
        this.year = year;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}
