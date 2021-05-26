import java.io.*;//imports input-output stream
public class menuDriven//declares main class
{
public static void main(String args[])throws IOException//declares main method
{
int ch,n,T=0;//variables declared
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Choice of Category");//Menu being displayed
System.out.println("1.Lower Stall = Rupees. 50");
System.out.println("2.Upper Stall = Rupees. 90");
System.out.println("3.Balcony = Rupees. 150");
System.out.println("4.Box = Rupees. 200");
ch=Integer.parseInt(in.readLine());//Accepts the user's choice
System.out.println("Enter Number of Seats Required");
n=Integer.parseInt(in.readLine());//Accepts number of seats
switch(ch)//To determine the total amount
{
case 1:
T=50*n;
break;
case 2:
T=90*n;
break;
case 3:
T=150*n;
break;
case 4:
T=200*n;
break;
default:
System.out.println("Invalid Choice");
break;
}
if(T!=0)// To Print the required Details
{
System.out.println("Number of Seats = "+n);
System.out.println("Total Amount to be Paid = Rupees. "+T);
}
}
}//Program Terminates