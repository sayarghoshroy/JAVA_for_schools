//input a number, form another by interchanging highest, lowest digits without string or array
import java.util.*;//all classes of java utility package are imported into the program
class Interchange
{   //class declared
    int n,change;//variables declared
    void generate(int n)
    {   //generates the changed number
        int min=9,max=0,minpos=0,maxpos=0,i=0,d,num=n;//variables declared
        while(num!=0)
        {   //loop to find position and value of greatest and smallest digit
            d=num%10;
            num/=10;
            if(d<min)
            {   //checks for minimum
                min=d;
                minpos=i;
            }
            if(d>max)
            {   //checks for maximum
                max=d;
                maxpos=i;
            }
            ++i;//increments 'i' which denotes position
        }
        change=n+(int)Math.pow(10,minpos)*(max-min)+(int)Math.pow(10,maxpos)*(min-max);//the changed number is stored in 'change'
    }
    void accept()
    {   //accepts value of number from the user
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter the Number");
        n=sc.nextInt();
    }
    void run()
    {   //calls function to generate changed number
        generate(n);
    }
    void display()
    {   //Displays original and changed number
        System.out.println("The replaced Version of "+n+" = "+change);
    }
}
public class Change_Digits
{   //public class declared
    public static void main()
    {   //main method declared
        Interchange o=new Interchange();
        o.accept();
        o.run();
        o.display();//object created and functions invoked
    }//end of main
}//end of class
    