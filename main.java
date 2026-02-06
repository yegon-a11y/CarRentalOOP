import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        String adminUser = "Josh";
        String adminPass = "4321";
        int tries = 0;
        boolean access = false;

        System.out.println("Welcome! Please Login.");

        while (tries < 3) {
            System.out.print("Username: ");
            String u = input.nextLine(); 
            
            System.out.print("Password: ");
            String p = input.nextLine(); 

            if (u.equals(adminUser) && p.equals(adminPass)) {
                access = true;
                System.out.println("Login Successful!\n");
                break; 
            } else {
                tries++;
                System.out.println("Wrong! Tries remaining: " + (3 - tries));
            }
        }

        
        if (access) {
            Car myCar = new Car("C001", "Toyota Corolla", 50.0);
            Customer myClient = new Customer("ID101", "John Doe");
            RentalAgency agency = new RentalAgency();

        
            agency.printReceipt(myClient, myCar, 3); // 3 days rental
        } else {
            System.out.println("Access Denied. System Locked.");
        }
    }
}
