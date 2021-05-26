import java.io.*;
public class arrays 
{
public static void main(String args[])throws IOException
{
int n, i, j, pos;
double s, min;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of terms");
n=Integer.parseInt(in.readLine());
double num[]=new double[n];
for(i=0;i<n;i++)
{
System.out.println("Enter Term Number "+(i+1)+" in the Array");
num[i]=Double.parseDouble(in.readLine());
}
for(i=0;i<n;i++)
{
pos=i;
min=num[pos];
for(j=i;j<n;j++)
{
if(num[j]<min)
{
pos=j;
min=num[pos];
}
}
s=num[i];
num[i]=min;
num[pos]=s;
}
for(i=0;i<n;i++)
System.out.println(num[i]);
}
}
