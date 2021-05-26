//prime triplets refer to set of numbers (i,i+2,i+6 or i,i+4,i+6) where they all are prime numbers, finds and prints prime triplets within a certain range
import java.util.*;//imports all classes of java utility package into the program
class triplet
{   //class declared
    int lower,upper,c;//variables declared
    triplet()
    {   //default constructor
        lower=0;
        upper=0;
        c=0;
    }
    void accept()
    {   //values of lower, upper accepted
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter lower Limit");
        lower=sc.nextInt();
        System.out.println("Enter upper Limit");
        upper=sc.nextInt();
    }
    void show()
    {   //displays prime triplets and number of prime triplets in range
        System.out.println("Searching for Prime Triplets and Displaying:-");
        for(int i=lower;i<=upper-6;i++)
        {   //loop to find prime triplets within range
            if(isPrime(i)&&(isPrime(i+2)||isPrime(i+4))&&isPrime(i+6))
            {
                System.out.print(i+"\t");
                if(isPrime(i+2))
                 System.out.print(i+2+"\t");
                else
                 System.out.print(i+4+"\t");
                System.out.print(i+6+"\n");
                c++;//c is a counter variable
            }
        }
        System.out.println("Number of Prime Triplets in Range = "+c);//displays value of c
    }
    static boolean isPrime(int n)
    {   //checks if a number is a prime number
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
public class prime_Triplets
{   //public class declared
    public static void main()
    {   //main method declared
        triplet o=new triplet();
        o.accept();
        o.show();//object created and functions invoked
    }//main ends
}//class ends