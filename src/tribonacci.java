//prints 'n' terms of tribonacci series using recursion
import java.util.*;//all classes of java utility package are imported into the program
class tribo
{   //class declared
    int n;
    tribo()
    {   //default constructor
        n=0;
    }
    void accept()
    {   //accepts value of n
        Scanner sc=new Scanner(System.in);//scanner object created
        System.out.println("Enter Number of Terms");
        n=sc.nextInt();
    }
    void display()
    {   //displays the entire series
        System.out.println("The Series :");
        for(int i=0;i<n;i++)
            System.out.println("Term Number "+(i+1)+" = "+tribonacci(i));
    }
    static int tribonacci(int i)
    {   //recursive function to find value of (i+1)th term of series
        if(i==0)
         return 0;
        if(i==1||i==2)
         return 1;
        return tribonacci(i-1)+tribonacci(i-2)+tribonacci(i-3);
    }
}//end of class
public class tribonacci
{   //public class declared
    public static void main()
    {   //main method declared
        tribo o=new tribo();
        o.accept();
        o.display();
        //object created and functions called
    }//end of main
}//end of class
            