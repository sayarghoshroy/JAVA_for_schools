import java.io.*;//imports input-output package
class Library//class declared
{
int acc_num;
String title,author;
//DataMembers Declared
void input()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Accession Number");
acc_num=Integer.parseInt(in.readLine());
System.out.println("Enter Book's title");
title=in.readLine();
System.out.println("Enter Book's Author");
author=in.readLine();
}
void compute()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter number of Days Late");
int n=Integer.parseInt(in.readLine());
System.out.println("Fine to be Paid = Rupees. "+(n*2));
}
void display()
{
System.out.println("Accession Number : "+acc_num+" Title : "+title+" Author : "+author);
}
}//class ends
public class bookworm
{
public static void main(String args[])throws IOException//main method declared
{
Library obj=new Library();//object created
obj.input();
obj.compute();
obj.display();//methods declared
}
}

