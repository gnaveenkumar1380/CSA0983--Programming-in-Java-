import java.io.*;
public class DivisibleByNine 
{
 public static void main(String[] args) 
{
 System.out.println("Numbers between 100 and 900 divisible by 9:");
 for (int i = 100; i <= 900; i++) 
{
 if (i % 9 == 0) 
 System.out.println(i);
}
}
}