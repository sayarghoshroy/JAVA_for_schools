//to check if a number is a smith number or not... 666... 6+6+6=18 and sum of digits of its prime factors 2+3+3+(3+7)=18
import java.util.*;//all classes of java utility package are imported into the program
class Smith
{   //class declared
    static Scanner sc=new Scanner(System.in);//Scanner object created for the entire class
    static int sumDig(int n)
    {   //function for finding sum of digits
        int s=0;
        while(n>0)
        {   //calculates sum of digits
            s=s+n%10;
            n=n/10;
        }
        return s;//returns sum
    }
    int sumPrimeFact(int n)
    {   //generates prime factors and finds their sum 
        int i=2,sum=0;//variables declared
        while(n>1)
        {
            if(n%i==0)
            {   //finds sum of prime factors
                sum=sum+sumDig(i); //Here 'i' is the prime factor of 'n' and we are finding its sum
                n=n/i;
            }
            else
                i++;//value of factor increased
        }
        return sum;//returns sum of prime factors
    }
    void show()
    {  //accepts number and checks if it is a smith number
       System.out.print("Enter a Number : ");
       int n=sc.nextInt();
       if(isPrime(n))
       System.out.println("It is not a Smith Number since it is not composite");
       else
       {
         int a=sumDig(n);// finding sum of digit
         int b=sumPrimeFact(n); //finding sum of prime factors
         System.out.println("Sum of Digit = "+a);//Sum of digits displayed
         System.out.println("Sum of Prime Factor = "+b);//Sum of prime factors displayed
         if(a==b)
          System.out.println("It is a Smith Number");
         else
          System.out.println("It is Not a Smith Number");
       }
    }//Final result printed
    static boolean isPrime(int n)
    {   //checks if a number is prime or not
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}
public class Smith_Number_Check
{   //public class declared
    public static void main()
    {   //main method declared
        Smith o=new Smith();
        o.show();//object created and functions invoked
    }//end of main
}//end of class