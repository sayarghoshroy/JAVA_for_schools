import java.io.*;
public class books
{
public static void main(String args[])throws IOException
{
int i,j;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of Terms");
int n=Integer.parseInt(in.readLine());
String b[]=new String[n];
String bs;
double p[]=new double[n];
double ps;
int q[]=new int[n];
int qs;
for(i=0;i<n;i++)
{
System.out.println("Enter Book Name");
b[i]=in.readLine();
System.out.println("Enter Price");
p[i]=Double.parseDouble(in.readLine());
System.out.println("Enter Number of Books");
q[i]=Integer.parseInt(in.readLine());
}
for(i=0;i<n;i++)
{
for(j=i;j<n-i-1;j++)
{
if(p[j]>p[j+1])
{
bs=b[j];
b[j]=b[j+1];
b[j+1]=bs;
ps=p[j];
p[j]=p[j+1];
p[j+1]=ps;
qs=q[j];
q[j]=q[j+1];
q[j+1]=qs;
}
}
}
System.out.println("Name     Price    Quantity");
for(i=0;i<n;i++)
System.out.println(b[i]+" "+p[i]+" "+q[i]);
}
}
