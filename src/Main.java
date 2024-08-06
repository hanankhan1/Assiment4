import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Task1 t1 = new Task1();

        while(true){
            System.out.println("Enter the task number or 0 to exit: ");
            int choice = input.nextInt();

            switch (choice){
                case 1: {
                    System.out.print("Enter a number to calculate factorial: ");
                    int num = input.nextInt();
                    int factorial = t1.fact(num); // Calling the fact method

                    System.out.println("Factorial of " + num + " is: " + factorial);
                } break;
                case 0: {
                    System.out.println("Exiting tasks..!");
                    input.close(); // Close the Scanner object before exiting
                    System.exit(0); // Exit the program
                } break;
                default: {
                    System.out.println("Invalid input..!");
                }
            }
        }
    }
}
