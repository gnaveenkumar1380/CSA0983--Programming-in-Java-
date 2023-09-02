import java.util.*;
class palindrome
{
public static void main(String args[])
{
int a,i,b,d;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
int g=a;
int c=0;
while (a!=0)
{
b=a%10;
c=(c*10)+b;
a=a/10;
}
System.out.println("the palindrome for the given number is:"+c);
{
d=(g+c);
System.out.println("the sum of both:"+d);
}
int f=0,e;
int h=d;
{
while (d!=0)
{
e=d%10;
f=(f*10)+e;
d=d/10;
}
if(h == f)
{
System.out.println("the number is palindrome");
}
else
{
System.out.println("the number is not palindrome");
}
}
}
}