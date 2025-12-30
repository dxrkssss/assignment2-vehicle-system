public class Main {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Brad Pitt", "AB274839");
        Driver driver2 = new Driver("Joe Keery", "58193642");

        Vehicle car = new Car("Range Rover", 2024, driver1, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Yamaha", 2019, driver1, false);
        Vehicle truck = new Truck("Ford", 2021, driver2, 1.5, 2);

        driver1.addVehicle(car);
        driver1.addVehicle(motorcycle);
        driver2.addVehicle(truck);

        Vehicle[] vehicles = { car, motorcycle, truck };

        for (Vehicle vehicle : vehicles) {
            vehicle.startEngine();
            vehicle.displayInfo();
            vehicle.getDriver().displayDriverInfo();
            vehicle.stopEngine();
            System.out.println("----------------------");
        }
    }
}
