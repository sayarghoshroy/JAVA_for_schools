//accepts a time in 12 hour format and prints it in digits and words
import java.util.*;//all classes of java utility package are imported into the program
class time
{   //class declared
    int hour,min;//variables declared
    void input()
    {   //accepts value of 'hour' and 'min'
        Scanner sc=new Scanner(System.in);//Scanner object created
        do
        {//validates and accepts 'hour'
         System.out.println("Enter The Hour of The Day (in 12 hours Format)");
         hour=sc.nextInt();
        }
        while(hour<0||hour>12);
        do
        {//validates and accepts 'min'
         System.out.println("Enter the Number of Minutes Passed");
         min=sc.nextInt();
        }
        while(min<0||min>59);
    }
        
    void show()
    {   //displayes the time in words
        String words[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Quarter","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
        //array 'words' stores necessary word codes
        if(min/10==0)
         System.out.println("The Time Entered - "+hour+":0"+min);
        else
         System.out.println("The Time Entered - "+hour+":"+min);
         //Time displayed in Numeric Fashion
        int a=0;//'a' is flag variable
        if(min>30)
        {
          a=2;
          min=60-min;
          hour++;
          if(hour==13)
           hour=1;
        }
        else if(min>0&&min<=30)
         a=1;
        //values of variables modified to find time in words
        String s="";
        if(min!=0)
        {
          if(min<21)
           s=words[min];
          else if(min>20&&min<30)
           s=words[20]+" "+words[min-20];
           else
           s="Half";
        }//necessary codes appended
        else if(a==0)
         s=words[hour]+" o'clock";
        if(a==1)
         s=s+" past "+words[hour];
        else if(a==2)
         s=s+" to "+words[hour];
         //necessary codes appended along with necessary words
        System.out.println("The Time in Words (in 12 Hour Format) is [ "+s+" ]");
        //time in words displayed
    }
}//end of class
public class Time_in_Words
{   //public class declared
    public static void main()
    {   //main method declared
        time o=new time();
        o.input();
        o.show();//object created and function invoked
    }//end of main
}//end of class