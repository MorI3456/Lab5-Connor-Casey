//This code is made by Connor Casey 9/26/24
import java.util.Scanner;

// Class for Problem 1: ShipCostCalculator
class Problem1 {
    public void run() { // Run is just executing everthing inside of it 
        Scanner x = new Scanner(System.in);// Scanner is just recceiveing the input and the scanners name is "x"

        // Get the item price
        System.out.print("Enter the price of your item: ");
        double price = x.nextDouble();

        double shippingCost;
        double totalPrice;

        // If-else 
        if (price >= 100) {
            shippingCost = 0; // Free shipping 
        } else {
            shippingCost = price * 0.02; // 2% shipping 
        }

        // Calculate total cost
        totalPrice = price + shippingCost;

        // Display results
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Total Price: $" + totalPrice);
    }
}

// Class for Problem 2: BirthMonth
class Problem2 {
    public void run() {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their birth month
        System.out.print("Enter your birth month (1-12): ");
        
        // Check if the user input is an integer
        if (in.hasNextInt()) {
            int month = in.nextInt(); // Reading the input as an integer
            
            // Check if the month is within the valid range 1 to 12
            if (month >= 1 && month <= 12) {
                System.out.println("Your birth month is: " + month); // Output the valid month
            } else {
                System.out.println("You entered an incorrect month value: " + month); // Output error for invalid month
            }
        } else {
            String trash = in.next(); // Capture invalid input as a String
            System.out.println("You entered an incorrect value: " + trash); // Error message for non-integer input
        }
    }
}

// Class for Problem 3: PartyAffiliation
class Problem3 {
    public void run() {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their party affiliation
        System.out.print("Enter your party affiliation (D, R, or I): ");
        String party = in.next().toUpperCase(); // Read input and convert it to uppercase

        // Cascaded if-else for party affiliation
        if (party.equals("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (party.equals("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (party.equals("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get Other.");
        }
    }
}

// Class for Problem 4: TheaterKiosk
class Problem4 {

    public void run() {
        Scanner in = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        
        if (in.hasNextInt()) {
            int age = in.nextInt(); // Read input as an integer
            
            // Check if the user is 21 or older
            if (age >= 21) {
                
                System.out.println("You get a wristband.");
            } else {
                System.out.println("You do not get a wristband.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid age.");
        }
    }
}

// Main class to call each problem
public class Main {
    public static void main(String[] args) {

        // Create instances of each problem class
        Problem1 problem1 = new Problem1();
        Problem2 problem2 = new Problem2();
        Problem3 problem3 = new Problem3();
        Problem4 problem4 = new Problem4();

        // Call the run methods of each class
        System.out.println("Problem 1: ShipCostCalculator");
        problem1.run();
        System.out.println("------------------------------\n");

        System.out.println("Problem 2: BirthMonth");
        problem2.run();
        System.out.println("------------------------------\n");

        System.out.println("Problem 3: PartyAffiliation");
        problem3.run();
        System.out.println("------------------------------\n");

        System.out.println("Problem 4: TheaterKiosk");
        problem4.run();
        System.out.println("------------------------------\n");

        System.out.println("All problems completed!");
    }
}
