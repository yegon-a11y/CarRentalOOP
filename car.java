public class Car {
    public String carId;
    public String model;
    public double pricePerDay;
    public boolean isAvailable;

    public Car(String carId, String model, double pricePerDay) {
        this.carId = carId;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true; // Car is ready to rent by default
    }
}
