import java.io.*;
public class crypto
{
public static void main(String args[])throws IOException
{
String f="";
String s;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Your Choice :");
System.out.println("1.Encoding");
System.out.println("2.Decoding");
int c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
System.out.println("Enter Message To Be Encoded");
s=in.readLine();
for(int i=0;i<(s.length());i++)
f=f+((int)(s.charAt(i)-96))+" ";
System.out.println("Encoded Message : "+f);
break;
case 2:
int p=0;
System.out.println("Enter Code to be Decoded");
s=in.readLine();
for(int i=0;i<(s.length());i++)
{
if(s.charAt(i)!=' ')
p=p*10+((int)(s.charAt(i)));
else
{
f=f+((char)(p+96))+" ";
p=0;
}
}
System.out.println("Decoded Message : "+f);
break;
default:
System.out.println("Invalid Choice");
break;
}
}
}