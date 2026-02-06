import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        String correctUsername = "Josh";
        String correctPassword = "1234";

        Scanner input = new Scanner(System.in);

        int attempts = 3;

    
        while (attempts > 0) {

            System.out.print("Enter Username: ");
            String username = input.nextLine();

            System.out.print("Enter Password: ");
            String password = input.nextLine();

        
            System.out.print("Password entered: ");
            for (int i = 0; i < password.length(); i++) {
                System.out.print("*");
            }
            System.out.println();

        
            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                System.out.println("Login successful. Welcome!");
                break;
            } else {
                attempts--;
                System.out.println("Incorrect username or password.");
                System.out.println("Attempts remaining: " + attempts);
    l
            }

        
            if (attempts == 0) {
                System.out.println("Too many failed attempts. Account locked.");
            }
        }

        input.close();
    }
}