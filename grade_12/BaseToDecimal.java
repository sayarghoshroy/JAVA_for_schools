//accepts number in a base between 2 and 36, changes to decimal (recursion)
import java.util.*;//all classes of java utility package are imported into the program
class convert
{   //class declared
    String ch="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";//stores all alphanumeric codes
    int b,f=0;//'b' stores the base of the number and 'f' stores the converted number
    String n="";//'n' holds the original number
    void run()
    {   //accepts number and base and calls recursive function to convert to decimal
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number to be Converted and its Base");
        n=sc.nextLine();
        b=sc.nextInt(); //values accepted
        conv(0);//call to recursive function
    }
    void conv(int i)
    {   //converts number to decimal using recursive technique
        if(i<n.length())
        {   //recursive case
            f=f*b+ch.indexOf(n.charAt(i));
            conv(i+1);//function calls itself
        }
        return;
    }
    void display()
    {   //Displays original number along with its base and number in decimal
        System.out.println("Decimal form of "+n+" in base "+b+" = "+f);
    }
}
public class BaseToDecimal
{   //public class declared
    public static void main()
    {   //main method declared
        convert o=new convert();
        o.run();
        o.display();//object created and functions called
    }//end of main
}//end of class