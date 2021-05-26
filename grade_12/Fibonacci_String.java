//A sequence of Fibonacci Strings is generated as follows:
//S0 = “a”, S1 = “b”, Sn = S(n-1) + S(n-2) where ‘+’ denotes concatenation. Thus the sequence is:
//a, b, ba, bab, babba, babbabab, ………. n terms.
//prints the sequence of fibonacci strings upto 'n' terms
import java.util.*;//imports all classes of java utility package into the program
class FiboString
{   //class declared
    String x,y,z;
    int n; //variables declared
    FiboString()
    {  //Default Constructor
        x="a";
        y="b";
        z="";
    }
    void accept()
    {   //accepts value of number of terms
        Scanner sc=new Scanner(System.in);//Scaner object created
        System.out.println("\nEnter the number of terms");
        n=sc.nextInt();
    }
    void generate()
    {   //generates the terms of the fibonacci string series
        System.out.println("The Fibonacci String Series is : ");
        if(n == 1) //if number of terms is equal to 1
            System.out.println(x);
        else if(n>=2) //if number of terms is more than or equal to 2
        {
            System.out.println(x+"\n"+y);//prints first 2 terms
            for(int i=3;i<=n;i++)
            {   //prints the terms starting from the third
                z=y+x;
                System.out.println(z);
                x=y;
                y=z;
            }
        }
    }
}//class ends
public class Fibonacci_String
{   //public class declared
    public static void main()
    {   //main method declared
        FiboString ob=new FiboString();
        ob.accept();
        ob.generate();//object created and functions invoked
    }//end of main
}//end of class