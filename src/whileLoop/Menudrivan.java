package whileLoop;

import java.util.Scanner;

public class Menudrivan {
	//Create a menu-driven program that allows the user to choose and perform different operations.
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    int a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    int b = sc.nextInt();
                    System.out.println("Addition = " + (a + b));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("Subtraction = " + (a - b));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();
                    System.out.println("Multiplication = " + (a * b));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    a = sc.nextInt();
                    System.out.print("Enter second number: ");
                    b = sc.nextInt();

                    if (b != 0) {
                        System.out.println("Division = " + (a / (double)b));
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

}
