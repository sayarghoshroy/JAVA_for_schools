import java.io.*;
public class fac
{
public static double fact(int n)
{
double f=1;
for(int i=1;i<=n;i++)
f=f*i;
return f;
}
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a Number");
int n=Integer.valueOf(in.readLine());
System.out.println("Required Factorial of "+n+" = "+(fact(n)));
}
}