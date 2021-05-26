import java.io.*;
public class merger
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of terms in both the Arrays");
int n=Integer.parseInt(in.readLine());
int i;
int a[]=new int[n];
int b[]=new int[n];
for(i=0;i<n;i++)
{
System.out.println("Enter Term "+(i+1)+" in Array 'a'");
a[i]=Integer.parseInt(in.readLine());
System.out.println("Enter Term "+(i+1)+" in Array 'b'");
b[i]=Integer.parseInt(in.readLine());
}
int c[]=new int[2*n];
int s=0;
for(i=0;i<n;i++)
{
c[s]=a[i];
s++;
c[s]=b[i];
s++;
}
for(i=0;i<2*n;i++)
System.out.println(c[i]);
}
}
