//accepts two binary numbers and prints their addition result
import java.util.*;//all classes of java utility package are imported into the program
class binary_add
{   //class declared
    long a,b;
    String add="";//variables declared
    void input()
    {   //accepts values of 2 binary numbers from the user
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Two Numbers ");
        a=sc.nextLong();
        b=sc.nextLong();
    }
    void calc()
    { //calculates sum of two binary numbers and stores in add
      int carry=0,sum;//variables declared
      while(a>0||b>0||carry>0)
      {   //while loop begins
          if(carry+a%10+b%10<=1)
          {
           add=Long.toString(carry+a%10+b%10)+add;
           carry=0;
          }
          else
          {
           if(carry+a%10+b%10==2)
            add="0"+add;
            else
            add="1"+add;
            carry=1;
          }
          a/=10;
          b/=10;
      }//while loop ends, result has been found
    }
    void display()
    {   //displays the result with suitable message
        System.out.println("The Sum = "+ add);
    }
}
public class Binary_Adder
{   //public class declared
    public static void main()
    {   //main method declared
        binary_add o=new binary_add();
        o.input();
        o.calc();
        o.display();//object created and functions invoked
    }//end of main
}//end of class