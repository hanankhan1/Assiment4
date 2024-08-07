import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Task1 t1 = new Task1();
        Task3 t3 = new Task3();
        Task2 t2 = new Task2();
        Task4 t4 = new Task4();
        Task5 t5 = new Task5();
        Task6 t6 = new Task6();
        Task7 t7 = new Task7();

        while (true) {
            System.out.println("Enter the task number or 0 to exit: ");
            int choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter a number to calculate factorial: ");
                    int num = input.nextInt();
                    int factorial = t1.fact(num);

                    System.out.println("Factorial of " + num + " is: " + factorial);
                }
                break;
                case 2: {
// sir the code is correct i have run it on net beans it run perfectly but i tryed but it shows every comind String is palindrom on IDJ
                    System.out.print("Enter a string to check for palindrome: ");
                    String s = input.nextLine();
                    input.nextLine();
                    boolean isPalindrome = t2.checkPalindrome(s);
                    if (isPalindrome) {
                        System.out.println("It's a palindrome string!");
                    } else {
                        System.out.println("Not a palindrome!");
                    }
                }
                break;
                case 3: {
                    System.out.print("Enter a number-> ");
                    int num = input.nextInt();

                    System.out.print("Enter a digit to count-> ");
                    int digit = input.nextInt();

                    int count = t3.coun_digit(num, digit);
                    System.out.println("The digit " + digit + " appears " + count + " times in the number ->" + num);
                }
                break;
                case 4: {
                    System.out.print("Enter the number of persons in the room-> ");
                    int n = input.nextInt();

                    int totHandshakes = t4.handShakes(n);
                    System.out.println("Total number of handshakes with " + n + " people is-> " + totHandshakes);
                }
                break;
                case 5: {

                    System.out.print("Enter the first number (x)-> ");
                    int x = input.nextInt();

                    System.out.print("Enter the second number (y)-> ");
                    int y = input.nextInt();

                    int gcd = t5.GCD(x, y);
                    System.out.println("The GCD of " + x + " and " + y + " is-> " + gcd);

                }
                break;
                case 6: {
                    System.out.print("Enter the base-> ");
                    int base = input.nextInt();

                    System.out.print("Enter the exponent-> ");
                    int exponent = input.nextInt();

                    int result = t6.power(base, exponent);
                    System.out.println(base + " to power " + exponent + " is-> " + result);

                }
                break;
                case 7: {

                    System.out.print("Enter a string to reverse: ");
                    String s = input.nextLine();
                    input.nextLine();
                    int length = s.length();
                    String reversed = t7.reverse(s, length);

                    System.out.println("Reversed string: " + reversed);

                }
                break;
                case 8: {


                    // here you have to enter the length of the array
                    System.out.print("Enter the value of p(lenght of array): ");
                    int p = input.nextInt();

                    // Generate the array of numbers that start from 1,2,.. soon till the length reach its limits
                    int[] nums = new int[2 * p - 1];
                    for (int i = 0; i < nums.length; i++) {
                        nums[i] = i + 1;
                        //sir this will give you the nums that are bening generated
                        System.out.println(nums[i]);
                    }

                    // Display the binary representation of nums tthat are bening generated above
                    System.out.println("Initial binary representation of nums:");
                    for (int i = 0; i < nums.length; i++) {
                        System.out.println(Integer.toBinaryString(nums[i]));
                    }

                    // Get swap direction from user (left or right)  from werw he want to swap
                    System.out.print("Enter swap direction (left or right): ");
                    String direction = input.next();

                    // Get the bits to swap from the user
                    System.out.print("Enter the first bit position to swap: ");
                    int bit1 = input.nextInt();
                    System.out.print("Enter the second bit position to swap: ");
                    int bit2 = input.nextInt();

                    // Perform the bit swap using a loop
                    for (int i = 0; i < nums.length; i++) {
                        int x = nums[i];

                        // Convert the integer to binary string
                        String biString = String.format("%" + (nums.length) + "s", Integer.toBinaryString(x)).replace(' ', '0');
                        System.out.println("Show tou the binary value complete -> " + biString);
                        char[] binaryArray = biString.toCharArray();

                        // Adjust bit positions if direction is left
                        int pos1;
                        int pos2;
                        if (direction.equalsIgnoreCase("left")) {
                            pos1 = nums.length - bit1 - 1;
                            pos2 = nums.length - bit2 - 1;
                        } else {
                            pos1 = bit1;
                            pos2 = bit2;
                        }

                        // Swap the bits
                        char temp = binaryArray[pos1];
                        binaryArray[pos1] = binaryArray[pos2];
                        binaryArray[pos2] = temp;

                        // Convert the modified binary array back to an integer
                        String modifiedBinaryString = new String(binaryArray);
                        nums[i] = Integer.parseInt(modifiedBinaryString, 2);
                    }

                    // Display the binary representation of nums after swap
                    System.out.println("Binary representation of nums after swap:");
                    for (int i = 0; i < nums.length; i++) {
                        System.out.println(Integer.toBinaryString(nums[i]));
                    }

                    // Convert the modified binary numbers to decimal and calculate the sum
                    long sum = 0;
                    for (int i = 0; i < nums.length; i++) {
                        sum += nums[i];
                    }

                    System.out.println("Sum of the modified array: " + sum);

                }
                break;

                case 0: {
                    System.out.println("Exiting tasks..!");
                    input.close();
                    System.exit(0);
                }
                break;
                default: {
                    System.out.println("Invalid input..!");
                }
            }
        }
    }
}
