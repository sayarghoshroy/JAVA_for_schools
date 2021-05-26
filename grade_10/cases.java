import java.io.*;
public class cases
{
public static void main(String args[])throws IOException
{
String s;
int l,i,j,c=0;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a String");
s=in.readLine();
s=s.toUpperCase();
l=s.length();
System.out.println("CHARACTERS     FREQUENCY");
for(j=65;j<=90;j++)
{
for(i=0;i<l;i++)
{
if(s.charAt(i)==j)
c=c+1;
}
System.out.println("    "+(char)j+"              "+c);
c=0;
}
}
}