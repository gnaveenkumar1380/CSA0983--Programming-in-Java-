import java.util.Scanner;

public class sumofevenNumbers 
{
 public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the value of n: ");
 int n = scanner.nextInt();

 int sum = 0;
 int i = 1;
 while (i <= n) 
{
 if (i % 2 == 0) 
{
 sum += i;
 }
 i++;
 }
system.out.println("sum of even numbers for first " + n + " natural numbers is:"+sum );
}
}