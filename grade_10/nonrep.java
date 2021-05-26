import java.io.*;
public class nonrep
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a Natural Number");
int n=Integer.parseInt(in.readLine());
int c=0,zero=0,i,j;
String s;
char ch;
while(true)
{
n++;
s=Integer.toString(n);
for(i=0;i<s.length();i++)
{
ch=s.charAt(i);
c=0;
for(j=0;j<s.length();j++)
{
if(ch==s.charAt(j))
c++;
}
if(c>1)
break;
}
if(c==1)
{
if(s.indexOf('0')<0)
break;
}
}
System.out.println("Required Non Repetitive Number is "+n);
}
}

