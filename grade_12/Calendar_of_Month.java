//accepts a year and month and prints it calendar
import java.util.*;//all classes of java utility package are imported into the program
class calendar
{   //class declared
    static int day(int M,int D,int Y) 
    {   //returns the day on a particular date
        int y=Y-(14-M)/12;
        int x=y+y/4-y/100+y/400;
        int m =M+12*((14-M)/12)-2;
        int d=(D+x+(31*m)/12)%7;
        return d;
    }
    static boolean isLeapYear(int year) 
    {   //returns true if the given year is a leap year
        if((year%4==0)&&(year%100!=0))
         return true;
        if(year%400==0)
         return true;
        return false;
    }
    void run() 
    {   //prints the calendar of the required month in the required year
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Month( 1 for January, 2 for February... )");
        int M=sc.nextInt();//month accepted
        System.out.println("Enter Year");
        int Y=sc.nextInt();//year accepted
        String months[]={"","January","February","March","April","May","June","July","August","September","October","November","December"};
        //array 'months' stores names of months
        int days[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        //array 'days' stores number of days in each month
        if (M==2&&isLeapYear(Y)) 
         days[M]=29;//in a leap year, days in february is 29
        System.out.println("\t-------------------" + months[M] + " " + Y+"--------------------");
        System.out.println("\tS\tM\tT\tW\tTh\tF\tS");//calendar header printed
        int d = day(M,1,Y);//'d' stores day number of the first day of the month
        for (int i=0;i<d;i++)//printing blank spaces
            System.out.print("\t");
        for (int i=1;i<=days[M];i++)
        {   //prints the calendar
            System.out.print("\t"+i);
            if (((i+d)%7==0)||(i==days[M]))
            System.out.println();
        }
    }
}//end of class
public class Calendar_of_Month
{   //public class declared
    public static void main()
    {   //main method declared
        calendar o=new calendar();
        o.run();//object created and function invoked
    }//end of main
}//end of class