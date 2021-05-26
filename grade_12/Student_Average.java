//super class student stores student details, sub class marks stores marks in 3 subjects, display all information of the student and her/his average marks
import java.util.*;//all classes of java utility package are imported into the program
class Student
{   //super class declared
    String name,DOB;
    int standard,roll;//variables declared
    Student(String n,String d,int s,int r)
    {   //parameterised constructor to store necessary information of student
        name=n;
        DOB=d;
        standard=s;
        roll=r;
    }
    void show()
    {   //displays details of the student
        System.out.println("Name : "+name+"\nDate Of Birth : "+DOB+"\nClass : "+standard+"\nRoll : "+roll);
    }
}//end of super class
class Marks extends Student
{   //sub-class declared
    int m1,m2,m3,avg;//variables declared to store marks and average of student
    Marks(String n,String d,int s,int r,int a,int b,int c)
    {   //parameterised constructor to initialize all details of the student
        super(n,d,s,r);//calls the constructor of super class
        m1=a;
        m2=b;
        m3=c;
    }
    void calc()
    {//calculates and stores average in 'avg'
     avg=(m1+m2+m3)/3;
    }
    void display()
    {   //displays details and marks of the student
        show();
        System.out.println("Average Marks : "+avg);
    }
}//end of subclass
public class Student_Average
{   //public class declared
    public static void main()
    {   //main method declared
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Name, Date of Birth, Class, Roll, Marks in 3 subjects");
        String n=sc.nextLine();
        String d=sc.nextLine();
        int s=sc.nextInt();
        int r=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //Details of students accepted
        Marks o=new Marks(n,d,s,r,a,b,c);//object of base class created with necessary information
        o.calc();
        o.display();//functions invoked
    }//end of main
}//end of class
        