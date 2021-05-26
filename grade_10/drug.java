import java.io.*;
public class drug
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of Packets");
int n=Integer.parseInt(in.readLine());
int s[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter Size of Packet");
s[i]=Integer.parseInt(in.readLine());
}
int c=0,h=0,copy;
for(int i=0;i<n;i++)
{
copy=s[i];
for(int j=0;j<n;j++)
{
if(s[j]==copy)
c++;
}
if(c>h)
h=c;
c=0;
}
System.out.println("Reduced Number of Packets = "+h);
}
}
