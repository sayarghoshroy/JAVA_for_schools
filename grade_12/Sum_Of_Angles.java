//sum of two angle objects... store and return the new angle object (Integer Variables : degree, minute)
import java.util.*;//imports all classes of java utility package into the program
class angle
{   //class declared
    int degree,minute;//variables declared
    angle()
    {  //default constructor
        degree=0;
        minute=0;
    }
    void accept()
    {   //accepts 'degree','minute'
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Values of Degrees and Minutes");
        degree=sc.nextInt();
        minute=sc.nextInt();
    }
    void display_Angle()
    {   //Displays the value of Angle
        System.out.println("The angle = "+degree+" Degrees and "+minute+" Minutes");
    }
    angle Sum(angle a,angle b)
    {   //finds sum of 2 angles and returns angle object
        this.degree=a.degree+b.degree+(a.minute+b.minute)/60;
        this.minute=(a.minute+b.minute)%60;
        return this;
    }
}//end of class
public class Sum_Of_Angles
{   //public class declared
    public static void main()
    {   //main method declared
        angle a=new angle();
        a.accept();
        a.display_Angle();//1st angle accepted and displayed
        angle b=new angle();
        b.accept();
        b.display_Angle();//2nd angle accepted and displayed
        angle sum=new angle();//object 'sum' stores sum of 2 angles
        sum=sum.Sum(a,b);//'sum' initialized
        System.out.println("Value of Sum :");
        sum.display_Angle();//result displayed with suitable message
    }//end of main
}//end of class