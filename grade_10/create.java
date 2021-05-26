import java.io.*;
class Taximeter
{
String taxino;
String name;
int km;
long amt;
Taximeter(String t, String n, int d)
{
taxino=t;
name=n;
km=d;
}
void compute()
{
if(km>=1 && km<=2)
amt=km*25;
if(km>2 && km<=6)
amt=km*32;
if(km>6 && km<=12)
amt=km*40;
if(km>12 && km<=18)
amt=45;
if(km>18)
amt=km*50;
}
void display()
{
System.out.println("Taxi Number : "+taxino);
System.out.println("Distance Travelled : "+km);
System.out.println("Total Cost : "+amt);
System.out.println("Passenger Name : "+name);
}
}
public class create
{
public static void main(String args[])throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Taxi Number");
String t=in.readLine();
System.out.println("Enter Passenger's Name");
String n=in.readLine();
System.out.println("Enter Distance Travelled in Kilometres");
int d=Integer.parseInt(in.readLine());
Taximeter obj1 = new Taximeter(t,n,d);
obj1.compute();
obj1.display();
}
}