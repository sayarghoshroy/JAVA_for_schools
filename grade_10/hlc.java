import java.io.*;
public class hlc
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter first Number");
int a=Integer.parseInt(in.readLine());
System.out.println("Enter Second Number");
int b=Integer.parseInt(in.readLine());
int n=1,m=1;
if(a>b)
{
int x=a;
a=b;
b=x;
}

outer:
for(int i=1;i<=b;i++)
{
n=a*i;
for(int j=1;j<=i;j++)
{
m=b*j;
if(n==m)
break outer;
}
}
System.out.println("LCM = "+n);
System.out.println("HCF = "+(a*b/n));
}
}