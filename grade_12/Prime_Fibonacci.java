//prints 'n' terms of prime fibonacci series
import java.util.*;//all classes of java utility package are imported into the program
class p_fibo
{   //class delared
    int n;//'n' stores number of terms
    public void input()
    {   //accepts number of terms
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number Of Terms");
        n=sc.nextInt();
    }
    public void display()
    {   //displays the series in order
        int c=0;//'c' denotes number of terms
        System.out.println("The Prime Fibonacci Series :-");
        for(int i=3;c<n;i++)
        {   //loop to print terms
            if(isPrime(fib(i)))//calls function isPrime() and recursive function fib()
            {//if the fibonacci number is a prime
             System.out.println(fib(i));
             c++;//value of 'c' incremented
            }
        }
    }
    public static int fib(int n)
    {   //recursive function to find (n+1)th term of fibonacci series
        if(n==0)
        return 0;//base case
        if(n==1)
        return 1;//base case
        return fib(n-1)+fib(n-2);//recursive case
    }
    static boolean isPrime(int n)
    {   //checks if a number is prime or not
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}//end of class
public class Prime_Fibonacci
{  //public class declared
   public static void main()
   { //main method declared
     p_fibo o=new p_fibo();
     o.input();
     o.display();//object created and functions invoked
   }//end of main
}//end of class