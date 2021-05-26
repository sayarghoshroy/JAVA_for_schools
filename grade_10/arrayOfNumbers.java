import java.io.*;//imports input-output stream
public class arrayOfNumbers//main class declared
{
public static void main(String args[])throws IOException//main method declared
{
DataInputStream in=new DataInputStream(System.in);
int n,i;//Variables Declared
System.out.println("Enter Number of Terms");
n=Integer.parseInt(in.readLine());//Accepts Number of Terms
int chng[]=new int[n];//First Array Declared
int fin[]=new int[n];//Second Array Declared
for(i=0;i<n;i++)//To initialize Array Elements
{
System.out.println("Enter Term Number "+(i+1)+" in Array chng");
chng[i]=Integer.parseInt(in.readLine());
if((chng[i])%2==0)//Finds Square of even number
fin[i]=(chng[i]*chng[i]);
else//Finds Cube of Odd Number
fin[i]=(chng[i]*chng[i]*chng[i]);
}
System.out.println("The Final Array is -->");
//Prints the resulting Array
for(i=0;i<n;i++)
{
System.out.println("Term Number "+(i+1)+" is "+(fin[i]));
}
}
}//Program Terminates


