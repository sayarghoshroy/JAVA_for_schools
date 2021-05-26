//'n' number of friends give certain dates in a month when they can meet, finds and prints the dates when they all are available
import java.util.*;//imports all classes of java utility package into the program
class date
{   //class declared
    int a[][],n,i=0,j=0;//variables declared
    void accept()
    {   //accepts values of 'n' and dates on which someone is avaiable
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Friends");
        n=sc.nextInt();
        a=new int[n][31];//'n' represents number of friends who are supposed to gather
        for(i=0;i<n;i++)
        {
            for(j=0;j<31;j++)
            a[i][j]=0;
        }
        //double dimension array initialized
        int e;//temporarily stores date
        for(i=0;i<n;i++)
        {   //loop to keep track of number of friends
            e=1;
            System.out.println("Enter Dates on which "+(i+1)+" is available. Enter 0 to conclude");
            while(e!=0)
            {   //accepts dates on which (i+1)th friend is available
                e=sc.nextInt();//stores the accepted value of date
                if(e>0&&e<32)//if date is valid
                a[i][e-1]=1;//marks the date on the array corresponding to the particular friend
            }
        }//all dates have been accepted
    }
    void show()
    {   //finds and displays dates when all are available
        System.out.println("Dates on which Everyone is Available :");
        outer:
        for(i=0;i<31;i++)
        {   //loop to keep track of days
            for(j=0;j<n;j++)
            {   //loop to keep track of friends
                if(a[j][i]==0)//if friend is not available on the date
                continue outer;
            }
            System.out.print(i+1+"\t");//if everyone is available on the date
        }
    }
}//end of class
public class Available_dates
{   //public class declared
    public static void main()
    {   //main method declared
        date o=new date();
        o.accept();
        o.show();//object created and functions invoked
    }//end of main
}//end of class