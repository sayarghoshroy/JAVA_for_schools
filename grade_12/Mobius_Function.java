// prints value of mobius function of a number
import java.util.*;//all classes of java utility package are imported into the program
class Mobius
{   //class declared
    int n;//'n' stores the number
    void accept()
    {   //accepts number and stores in 'n'
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number");
        n=sc.nextInt();
    }
    int mobius()
    {   //evalutate value of mobius function of 'n'
        if(n==1)
         return 1;
        else
        {   //if 'n' is not equal to 1
            int num=n,d=2,c=0,i=0,j=0,flag=0;//variables declared,'num' stores value of 'n','c' is a counter;'d','i','j' are counters
            while(true)
            {   //finds number of prime factors
                if(num==1)
                 break;
                else if(num%d==0&&isprime(d))
                {   //finds all prime factors
                   c++;//stores number of prime factors
                   num/=d;//value of 'num' modified
                }
                else
                 d++;//value of factor incremented
            }//while loop ends
            int f[]=new int[c];//array stores all prime factors of 'n'
            num=n;
            d=2;//variables re-initialised to standard values
            label://labelling outer while loop
            while(true)
            {   //loop to check if prime factor is repeated by storing them all in array
                if(num==1)//condition to break 'label'
                 break;
                else if(num%d==0&&isprime(d))//rechecks for prime factors
                {
                    f[i]=d;//stores prime factor into array
                    for(j=0;j<i;j++)
                    {   //loop to check for repeated prime factors
                        if(f[j]==f[i])
                        {   //if repeated prime factor is present
                            flag=1;//flag is raised
                            break label;//outer while-loop broken
                        }
                    }
                    i++;
                    num/=d;//values of 'i' and 'd' modified
                }
                else
                 d++;//value of 'd' denoting consecutive factors modified
            }
            if(flag==1)//if repeated prime factor was present
            return 0;
            else//if all prime factors were unique
            return (int)Math.pow(-1,c);
        }
    }//value of Mobius function returned
    void display()
    {   //Displaying value of function in proper order
        System.out.println("M("+n+")="+mobius());
    }
    boolean isprime(int n)
    {   //checks if a number 'n' is a prime number
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
}//end of class
public class Mobius_Function
{   //public class declared
    public static void main()
    {   //main method declared
        Mobius o=new Mobius();
        o.accept();
        o.display();//object created and functions invoked
    }//end of main
}//end of class