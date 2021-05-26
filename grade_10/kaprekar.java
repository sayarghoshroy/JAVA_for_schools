import java.io.*;
public class kaprekar
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a Positive Integer");
long N=Long.parseLong(in.readLine());
long s=N*N;
int n=1,f=0;
while(s/n>0)
{
if(s%n>0||s==1)
{
if(s%n+s/n==N)
{
f=1;
break;
}
}
n*=10;
}
if(f==0)
System.out.println("The Number is not a Kaprekar Number");
else
System.out.println("The Number is a Kaprekar Number");
}
}
