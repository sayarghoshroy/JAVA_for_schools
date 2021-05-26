import java.io.*;//Imports Input-Output Stream
public class dates//Class Declared
{
public static void main()throws IOException//Main Method declared
{
DataInputStream in=new DataInputStream(System.in);//Input Stream Created
String f="",l="";//Variables 'f' and 'l' will store the First and Last Dates respectively
System.out.println("Enter the Dates in the Following Format : <Date>/<Month>/<Year>");
//Input Must be Given in the order > Day followed by Month followed by Year Using '/' as delimiter
System.out.println("Enter the Preceding Date");
f=in.readLine();//First Date Accepted
System.out.println("Enter the Later Date");
l=in.readLine();//Later Date Accepted
int days[]={31,28,31,30,31,30,31,31,30,31,30,31};//Array to store the number of days in different months
int d=0,m=0,y=0;//stores the day, month, year of the preceding or first date
int c=0;//counter variable to store Number of Days
int leap=0;//Variable to store number of Days in Months After checking whether the Year is a leap year
d=Integer.parseInt(f.substring(0,(f.indexOf('/'))));//Extracts the Day of the Month from First Date
m=Integer.parseInt(f.substring(f.indexOf('/')+1,f.lastIndexOf('/')));//Extracts the Month of the Year from First Date
y=Integer.parseInt(f.substring(f.lastIndexOf('/')+1));////Extracts the Year from the first Date
//Stores the Date, Month, Year by converting them to integer data type
exit: while(true)//loop to keep track of year
{//outer loop has been labelled as "exit"
for(int i=m-1;i<12;i++)//loop to keep track of month
{
if(i==1&&((y%4==0)&&(y%100!=0||y%400==0)))//if it is the month of February and the year is a leap year
leap=29;// Makes Number of Days in the month of february -> 29
else
leap=days[i];//Else the number of days, Remains As it is
for(int j=d;j<=leap;j++)//loop to keep track of days
{
if(j==Integer.parseInt(l.substring(0,l.indexOf('/')))&&i==(Integer.parseInt(l.substring(l.indexOf('/')+1,l.lastIndexOf('/'))))-1&&y==Integer.parseInt(l.substring(l.lastIndexOf('/')+1)))
break exit;//If Value of the First Date reaches the value of the Later Date after incrementing Each Day, then Break the Outer loop labelled as "exit"
else 
c++;//number of days incremented
}//for-loop with control variable 'j' ends
d=1;//day number restored to 1 for finding number of days in the following month
}//for-loop with control variable 'i' ends
m=1;//number of months restored to 1 to find number of months in the following year
y++;// number of years incremented to keep track of current year
}//outer while loop labelled "exit" ends
System.out.println("Required number of Days = "+(c));//Variable 'c' stores the number of DAY(s) between the 2 entered dates
}
}
