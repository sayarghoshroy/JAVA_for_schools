import java.io.*;
class oooo
{
static String s="";
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter A Number in decimal form");
int n=Integer.parseInt(in.readLine());
conv(n);
System.out.println("The Number in Octal Form = "+s);
}
static void conv(int n)
{
if(n==0)
;
else 
{
s=Integer.toString(n%8)+s;
conv(n/8);
}
}
}
