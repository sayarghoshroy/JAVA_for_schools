//accept 2 binary numbers and find their difference
import java.util.*;//all classes of java utility package are imported into the program
class minus
{   //class declared
    long a,b;//variables declared
    void input()
    {   //accepts values of minuend and subtrahend
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Minuend and Subtrahend (Minuend - Subtrahend =  Difference)");
        a=sc.nextLong();
        b=sc.nextLong();
    }
    void difference()
    {   //finds difference between 2 binary numbers
        String s="",f="+";//'s' stores difference,'f' determines sign of difference
        if(b>a)
        {   //if minuend is less than subtrahend
            long t=a;
            a=b;
            b=t;//variables swapped
            f="-";//difference will be negative
        }
        while(a>0)
        {   //calculates difference
            if(a%10>b%10)
             s="1"+s;
            else if(a%10==b%10)
             s="0"+s;
            else
            {
                s="1"+s;
                a-=10;
            }//value of difference calculated bit by bit
            a/=10;
            b/=10;//values of 'a' and 'b' modified
        }
        System.out.println("Difference = "+f+s);//displays difference
    }
}//end of class
public class Binary_Subtractor
{   //public class declared
    public static void main()
    {   //main method declared
        minus o=new minus();
        o.input();
        o.difference();//object created and functions invoked
    }//end of main
}//end of class