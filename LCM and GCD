import java.util.Scanner;

public class LCMGCDProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int lcm = findLCM(numbers);
        int gcd = findGCD(numbers);

        System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }

    // Function to find the LCM
    public static int findLCM(int[] numbers) {
        int lcm = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            lcm = (lcm * numbers[i]) / findGCD(lcm, numbers[i]);
        }
        return lcm;
    }

    // Function to find the GCD
    public static int findGCD(int[] numbers) {
        int gcd = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            gcd = findGCD(gcd, numbers[i]);
        }
        return gcd;
    }

    // Function to find the GCD of two numbers
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
