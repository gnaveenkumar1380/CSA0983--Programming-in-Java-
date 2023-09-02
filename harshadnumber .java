import java.io.*;
import java.util.Scanner;

public class HarshadNumber {
public static void main(String[] args) { 
Scanner scanner = new Scanner(System.in); 
System.out.print("Enter a number: ");
int number = scanner.nextInt();
        
if (isHarshadNumber(number)) {
System.out.println(number + " is a Harshad number.");
}
else {
System.out.println(number + " is not a Harshad number.");
        }
    }

    public static boolean isHarshadNumber(int number) {
        int sum = 0;
        int originalNumber = number;
        
        // Calculate the sum of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        
        // Check if the number is divisible by the sum of its digits
        return originalNumber % sum == 0;
    }
}
