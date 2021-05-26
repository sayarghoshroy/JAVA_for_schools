import java.util.*;
public class choices
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Your Choice");
System.out.println("1. Print 1st 10 terms of Fibonacci Series");
System.out.println("2. Find Sum of Digits");
int ch=sc.nextInt();
switch(ch)
{
case 1:
int a=0,b=1;
System.out.println(a);
System.out.println(b);
for(int i=1;i<=8;i++)
{
int c=a+b;
System.out.println(c);
a=b;
b=c;
}
break;
case 2:
System.out.println("Enter an Integer Number");
int n=sc.nextInt();
int sum=0;
while(n!=0)
{
sum=sum+n%10;
n=n/10;
}
System.out.println("Sum of the Digits = "+sum);
break;
default:
System.out.println("Invalid Choice");
break;
}
}
}
