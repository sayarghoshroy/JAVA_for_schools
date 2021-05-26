import java.util.*;
public class counting
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a String");
String s=sc.nextLine();
int c=0;
s=s.toUpperCase();
for(int i=0;i<(s.length()-1);i++)
{
if(s.charAt(i)==s.charAt(i+1))
c=c+1;
}
System.out.println("Number of Double Letter Sequences = "+c);
}
}