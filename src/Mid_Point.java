//2 points in 3D space; find, store and display their mid point in a point object
import java.util.*;//all classes of java utility package are imported into the program
class point
{   // class declared
    double x,y,z;//variables declared
    point()
    {   //default constructor
        x=0;
        y=0;
        z=0;
    }
    void read_Point()
    {   //accepts x, y, z coordinates of point from user
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter x, y and z coordinates of the point");
        x=sc.nextDouble();
        y=sc.nextDouble();
        z=sc.nextDouble();
    }
    void display_Point()
    {   //displays coordinates of point
        System.out.println("Coordinates of Point : ("+x+","+y+","+z+")");
    }
    point midpoint(point a,point b)
    {   //finds mid point of point a and point b and returns the mid point
        this.x=(a.x+b.x)/2;
        this.y=(a.y+b.y)/2;
        this.z=(a.z+b.z)/2;
        return this;
    }
}//end of class
public class Mid_Point
{   //public class declared
    public static void main()
    {   //main method declared
        point a=new point();
        a.read_Point();
        System.out.println("Coordinates of Point 'a' - ");
        a.display_Point();//first point created and displayed
        point b=new point();
        b.read_Point();
        System.out.println("Coordinates of Point 'b' - ");
        b.display_Point();//second point created and displayed
        point mid=new point();//point object to store midpoint created
        mid=mid.midpoint(a,b);//value of midpoint stored in object mid
        System.out.println("Coordinates of Mid Point - ");
        mid.display_Point();//result is displayed
    }//end of main
}//end of class