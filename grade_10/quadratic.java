import java.io.*;//imports input-output stream
public class quadratic//declares main class
{
public static void main(String args[])throws IOException//declares main method
{
double a,b,c,dis;//variables declared
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter co-efficient 'A'");
a=Double.parseDouble(in.readLine());
System.out.println("Enter co-efficient 'B'");
b=Double.parseDouble(in.readLine());
System.out.println("Enter co-efficient 'C'");
c=Double.parseDouble(in.readLine());
//The Three Co-efficients have been accepted
dis=(b*b)-4*a*c;//Value of Discriminant Calculated
//Nature of Roots being Checked
if(dis==0)
System.out.println("The Roots are Equal");
if(dis<0)
System.out.println("The Roots are Imaginary");
if(dis>0)
System.out.println("The Roots are Real");
//Nature of Roots Printed
}
}//Program Terminates
