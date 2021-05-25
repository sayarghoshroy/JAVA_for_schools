//find lcm wihout using value of hcf of 2 numbers... use value of lcm to find hcf
import java.util.*;//imports all classes of java utility package into the program
class calc
{   //class declared
    int a,b,LCM,HCF;//variables declared
    void accept()
    {   //accepts values of 'a', 'b'
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The 2 Numbers");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void calculate()
    {   //calculates lcm and hcf
        int n=1,m=1;
        if(a>b)
        {   //makes sure that b>a
            int swap=a;
            a=b;
            b=swap;
        }
        outer://outer for loop labelled as 'outer'
        for(int i=1;i<=b;i++)
        {
            n=a*i;
            for(int j=1;j<=i;j++)
            {
                m=b*j;
                if(n==m)
                break outer;
            }
        }//'n' or 'm' becomes the lcm
        LCM=n;
        HCF=(a*b)/n;//values of LCM, HCF initialized
    }
    void display()
    {   //displays necessary values of numbers, HCF, LCM
        System.out.println("The Numbers Are : "+a+" and "+b+"\nLCM is "+LCM+"\nHCF is "+HCF);
    }
}//end of class
public class LCM_HCF
{   //public class declared
    public static void main()
    {//public class declared
      calc o=new calc();
      o.accept();
      o.calculate();
      o.display();//object created and methods invoked
    }//end of main
}//end of class