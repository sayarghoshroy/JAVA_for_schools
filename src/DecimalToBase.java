//accepts decimal number, converts to any base between 2 and 36
import java.util.*;//all classes of java utility package are imported into the program
class convert
{   //class declared
    char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    int b,n;//'ch' stores alphanumeric codes,'b' stores base to be converted,'n' stores the number
    String f="";//variables declared, 'f' stores changed number
    void Run()
    {   //accepts number and base to be converted and calls function to initiate conversion
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal Number and the Base to be Converted");
        n=sc.nextInt();
        b=sc.nextInt();
        conv(n);//calls recursive function
    }
    void conv(int n)
    {   //recursive funstion to carry out base conversion
        if(n>0)
        {   //recursive case
            f=Character.toString(ch[n%b])+f;
            conv(n/b);//function calling itself
        }
    }
    void display()
    {   //Diplays original and converted number
        System.out.println("Decimal Number = "+n+" , Number in Base "+b+" = "+f);
    }
}
public class DecimalToBase
{   //public class declared
    public static void main()
    { //main method declared
      convert o=new convert();
      o.Run();
      o.display();//object created and functions invoked
    }//end of main
}//end of class