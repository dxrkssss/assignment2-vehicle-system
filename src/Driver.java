import java.util.ArrayList;
import java.util.List;

public class Driver {
    private String name;
    private String licenseNumber;
    private List<Vehicle> vehicles;

    public Driver(String name, String licenseNumber) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }
    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void displayDriverInfo() {
        System.out.println("Driver: " + name + ", License: " + licenseNumber);
    }
}