import java.io.*;
public class perfectnumber
{
public static boolean isperfectnumber(int number)
{
if (number <=0)
{
return false;
}
int sum=1;
for(int i=1;i<=number/2;i++)
{
if (number % i=0)
{
sum+=i;
}
}
return sum = number;
}
public static void main(String [] args)
{
int number = 28;
if(isperfectnumber(number))
{
System.out.println("number" + " perfect number: ");
}
else
{
System.out.println("number" + " not perfect number: ");
}
}
}
