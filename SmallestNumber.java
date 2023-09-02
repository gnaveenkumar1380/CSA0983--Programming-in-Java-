import java.io.*;
class SmallestNumber 
{
int[] numbers;
public SmallestNumber(int[] numbers) 
{
this.numbers = numbers;
}

public int findSmallestNumber() 
{
int smallest = numbers[0];
for (int i = 1; i < numbers.length; i++) 
if (numbers[i] < smallest) 
{
smallest = numbers[i];
}
return smallest;
}
}
public class SmallestNumber {
public static void main(String[] args) 
{
int[] numbers = {4, 2, 9, 1, 7, 5};
SmallestNumber number = new SmallestNumber(numbers);
int smallestNumber = number.findSmallestNumber();
System.out.println("The smallest number is: " + smallestNumber);
}
}
