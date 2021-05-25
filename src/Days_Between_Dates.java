//Accepts 2 dates, prints number of dates between them
import java.util.*;//imports all classes of java utility package into the program
class dates
{   //class declared
    void run()
    {   //Accepts 2 dates and finds number of days between them
        Scanner sc=new Scanner(System.in);//Scanner object created
        String f="",l="";
        System.out.println("Enter the Dates in the Following Format : <Date>/<Month>/<Year>");
        System.out.println("Enter the Preceding Date");
        f=sc.nextLine();
        System.out.println("Enter the Later Date");
        l=sc.nextLine();//variables declared and initialized
        int days[]={31,28,31,30,31,30,31,31,30,31,30,31};//array to store the number of days in different months
        int d=0,m=0,y=0;//stores day, month, year of the preceding date
        int c=0;//counter variable
        d=Integer.parseInt(f.substring(0,(f.indexOf('/'))));
        m=Integer.parseInt(f.substring(f.indexOf('/')+1,f.lastIndexOf('/')));
        y=Integer.parseInt(f.substring(f.lastIndexOf('/')+1));
        //stores the date, month, year by converting them to integer using string functions
        exit: 
        while(true)//loop to keep track of year labelled as 'exit'
        {
            if(isLeapYear(y))//if leap year, days in february = 29
             days[1]=29;
            else
             days[1]=28;
            for(int i=m-1;i<12;i++)//loop to keep track of month
            {
             for(int j=d;j<=days[i];j++)//loop to keeep track of days
             {
               if(j==Integer.parseInt(l.substring(0,l.indexOf('/')))&&i==(Integer.parseInt(l.substring(l.indexOf('/')+1,l.lastIndexOf('/'))))-1&&y==Integer.parseInt(l.substring(l.lastIndexOf('/')+1)))
                break exit;//if the preceding and later date  match, the outer loop breaks
               else 
                c++;//number of days incremented
             }
             d=1;//day number returned to 1 for finding number of days in the following month
            }
            m=1;//number of months restored to 1 to find number of months in thee next year
            y++;// number of years incremented to keep track of current year
        }//variable 'c' which stores number of days between the 2 dates remains unchanged
        System.out.println("Required number of Days = "+(c));//Result Displayed
    }
    boolean isLeapYear(int year) 
    {   //checks whether year is a leap year
        if  ((year%4==0)&&(year%100!=0))
         return true;
        if  (year%400==0)
         return true;
        return false;
    }
}//class ends

public class Days_Between_Dates
{   //public class declared
    public static void main()
    {   //main method declared
        dates o=new dates();
        o.run();//object created funcction invoked
    }//end of main
}//end of class