//accepts number less than 4000, prints its deimal equivalent
import java.util.*;//all classes of java utility package are imported into the program
class roman
{   //class declared
    int num;//variable 'num' to store number declared
    roman()
    {   //default constructor initialized value of 'num'
        num=0;
    }
    void accept()
    {   //accepts number from the user
        Scanner sc=new Scanner(System.in);//Scanner object created
        do
        {
         System.out.println("Enter Number less than 4000");
         num=sc.nextInt();
        }
        while(num>=4000);//validation of input data done in the loop
    }
    void show()
    {   //prints the number in Roman Numberals
        String thou[]={"","M","MM","MMM"};
        String hund[]={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ten[]={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        //Arrays store necessary Roman numeral codes
        int th=num/1000;
        int h=(num/100)%10;
        int t=(num/10)%10;
        int u=num%10;
        //Digits in different positions calculated
        System.out.println("Roman Equivalent= "+thou[th]+hund[h]+ten[t]+unit[u]);//Roman Numeral Value Printed
    }
}//class ends
public class Decimal_to_Roman
{   //public class declared
    public static void main()
    {   //main method declared
        roman o=new roman();
        o.accept();
        o.show();//object created and functions invoked
    }//end of main
}//end of class