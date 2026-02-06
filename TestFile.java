public class TestFiles {
    public static void main(String[] args) {
        System.out.println("Running Tests...");
        
        RentalAgency testAgency = new RentalAgency();
        double result = testAgency.calculateTotal(100.0, 2);
        
        if (result == 200.0) {
            System.out.println("Test Passed: Math is correct.");
        } else {
            System.out.println("Test Failed: Math is wrong.");
        }
    }
}
