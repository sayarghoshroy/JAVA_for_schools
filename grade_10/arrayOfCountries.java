import java.io.*;//imports input-output stream
public class arrayOfCountries//declares main class
{
public static void main(String args[])throws IOException//declares main method
{
String s;//Variables declared
int n,i,c=0;//Variables declared
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of Terms");
n=Integer.parseInt(in.readLine());//Number of terms Accepted
String country[]=new String[n];//First Array Created
String capital[]=new String[n];//Second Array Created
for(i=0;i<n;i++)/*Loop to Accept Names of Countries 
and their Capitals*/
{
System.out.println("Enter Country Name");
country[i]=in.readLine();//Accepts Country Name
System.out.println("Enter Name Of Capital");
capital[i]=in.readLine();//Accepts Capital's Name
}
System.out.println("Enter Search Term i.e Name Of Country");
s=in.readLine();//Search term accepted
for(i=0;i<n;i++)//Loop to Search for the Country Name
{
if(s.equals(country[i]))
{
System.out.println("The Name of The Capital City is "+capital[i]);//Prints the Result if Search is Successful
c=c+1;
}
}
if(c==0)
System.out.println("Invalid Search Term");//Printed if Search term does not exist
}
}//Program Terminates

