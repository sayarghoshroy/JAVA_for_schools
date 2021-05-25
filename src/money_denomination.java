//accepts a sum of money and prints its denomination into notes of 1000,500,100,50,20,10,5,2,1
import java.util.*;//all classes of java utility package are imported into the program
class deno
{   //class declared
    int n;//'n' stores the amount of money
    deno()
    {   //default constructor initiates 'n' to 0
        n=0;
    }
    public void input()
    {   //accepts value of 'n' from the user
        Scanner sc=new Scanner(System.in);//Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        n=sc.nextInt();
    }
    public void display()
    {   //displays the money denomination
        int t[]={1000,500,100,50,20,10,5,2,1};//array holds values of different amounts of notes
        int c=0,m;//'c' is a counter,'m' holds number of notes of a type
        System.out.println("Denominations of the amount "+n+" :");
        for(int i=0;i<=8;i++)
        {   //loop to calculate and print denomination
            m=n/t[i];
            n%=t[i];
            if(m!=0)
             System.out.println(t[i]+"\tX\t"+m+"\t=\t"+t[i]*m);//Amount of notes displayed
            c+=m;//value of counter increased
        }
        System.out.println("Total Number of Notes = "+c);//Total number of notes displayed
    }
}//end of class
public class money_denomination
{   //public class declared
    public static void main()
    {   //main method declared
        deno o=new deno();
        o.input();
        o.display();//object created and functions invoked
    }//end of main
}//end of class