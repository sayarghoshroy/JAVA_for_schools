import java.io.*;
public class octal
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a Octal Number (Consisting of digits from 0-7)");
String n=in.readLine();
String s="",a="";
char ch;
for(int i=0;i<n.length();i++)
{
ch=n.charAt(i);
switch(ch)
{
case '0':
a="000";
break;
case '1':
a="001";
break;
case '2':
a="010";
break;
case '3':
a="011";
break;
case '4':
a="100";
break;
case '5':
a="101";
break;
case '6':
a="110";
break;
case '7':
a="111";
break;
case '.':
a=".";
break;
}
s=s+a;
}
System.out.println("Binary Equivalent of octal "+n+" = "+s);
}
}