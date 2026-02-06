public class RentalAgency {
    
    public double calculateTotal(double pricePerDay, int days) {
        return pricePerDay * days;
    }


    public void printReceipt(Customer c, Car car, int days) {
        double total = calculateTotal(car.pricePerDay, days);
        System.out.println("RENTAL RECEIPTf");
        System.out.println("Customer: " + c.name);
        System.out.println("Car Model: " + car.model);
        System.out.println("Total Cost: $" + total);
        System.out.println("--------------------------");
    }
}
