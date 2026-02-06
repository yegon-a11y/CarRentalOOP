public class Car {

    String carId;
    String model;
    double pricePerDay;
    boolean available;

    public Car(String carId, String model, double pricePerDay) {
        this.carId = carId;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.available = true;
    }

    
    public void rentCar() {
        available = false;
    }


    public void returnCar() {
        available = true;
    }
}