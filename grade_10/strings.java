import java.io.*;//imports input-output stream
public class strings//declares main class
{
public static void main(String args[])throws IOException//declares main method
{
int c=0;//Integer Variable Declared
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a String");
String s=in.readLine();//string accepted
s=s.toUpperCase();//converts the string to Uppercase
int l=s.length();//determines length of the string
for(int i=0;i<(l-1);i++)//loop to check for double letter sequences
{
if(s.charAt(i)==s.charAt(i+1))
c=c+1;//counter to count number of instances
}
System.out.println("Number of Double Letter Sequences = "+c);
//number of double letter sequences printed
}
}//program terminates
