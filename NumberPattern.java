import java.io.*; 
public class NumberPattern 
{
public static void main(String[] args) 
{
int rows = 4;

for (int i = 1; i <= rows; i++) 
{
for (int j = 1; j <= i; j++) 
{
for (int k = 1; k <= i; k++) 
{
System.out.print(9);
}
System.out.print(" ");
}
System.out.println();
}
}
}
