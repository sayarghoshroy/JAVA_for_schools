import java.io.*;
class mensuration
{
double area(double r)
{
double area=Math.PI*r*r;
return area;
}
double area(double l,double b)
{
double area=l*b;
return area;
}
double area(double a, double b, double c)
{
double s=(a+b+c)/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
return area;
}
void volume()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Radius of Sphere");
Double r=Double.parseDouble(in.readLine());
double vol=(4/3)*r*r*r;
System.out.println("Volume of the Sphere = "+vol+" cubic units");
}
}
public class methodoops
{
public static void main(String args[])throws IOException
{
int ch;
DataInputStream in=new DataInputStream(System.in);
mensuration obj=new mensuration();
System.out.println("Enter Your Choice");
System.out.println("1. To Find Area of Circle");
System.out.println("2. To Find Area of Square");
System.out.println("3. To Find Area of Triangle");
System.out.println("4. To Find Volume of Sphere");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
System.out.println("Enter Radius");
double r=Double.parseDouble(in.readLine());
System.out.println("Area of the Circle is "+(obj.area(r))+" square units");
break;
case 2:
System.out.println("Enter Length of Rectangle");
double l=Double.parseDouble(in.readLine());
System.out.println("Enter Breadth of Rectangle");
double b=Double.parseDouble(in.readLine());
System.out.println("The Area of the Rectangle is "+(obj.area(l,b))+" square units");
break;
case 3:
System.out.println("Enter Length of :-");
System.out.println("First Side");
double p=Double.parseDouble(in.readLine());
System.out.println("Second Side");
double q=Double.parseDouble(in.readLine());
System.out.println("Third Side");
double s=Double.parseDouble(in.readLine());
System.out.println("The Area of the Triangle is "+(obj.area(p,q,s))+" square units");
break;
case 4:
obj.volume();
break;
default:
System.out.println("Invalid Choice");
break;
}
}
}




