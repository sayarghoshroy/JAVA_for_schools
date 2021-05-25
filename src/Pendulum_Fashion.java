//inputs a set of integers in an Array and arranges them in Pendulum Fashion
import java.util.*;//imports all classes of java utility package into the program
class pendulum
{   //class declared
    void pattern()
    {   //creates the pendulum sort pattern
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter number of elements: "); //accepting the number of elements
        int n=sc.nextInt();
        int A[]=new int[n]; //original array
        int B[]=new int[n]; //array for storing the result         
        for(int i=0;i<n;i++)
        {   //accepts array elements
            System.out.println("Enter Element "+(i+1));
            A[i]=sc.nextInt();
        }
        int t=0;//stores value of data temporarily
        for(int i=0;i<n-1;i++)
        {   //sorts the array in ascending order
            for(int j=i+1;j<n;j++)
            {
                if(A[i]>A[j])
                {
                    t=A[i];
                    A[i]=A[j];
                    A[j]=t;
                }
            }
        }
        //Printing the Sorted Array
        System.out.println("The Sorted Array Is");
        for(int i=0; i<n; i++)
            System.out.print(A[i]+"\t");         
        System.out.println("");
        int mid=(n-1)/2; //finding index of middle cell
        int x=1,lim = n-1-mid;
        //'x' acceses elements of array A[], 'lim' keeps track of number of times we have to make this to-and-fro movement        
         //Pendulum Arrangement Starts Here
        B[mid]=A[0]; //putting the minimum element in the middle cell 
        for(int i=1;i<=lim;i++)
        {   //loop to implement pendulum sort
            if((mid+i)<n) //going to the right side
               B[mid+i]=A[x++];
            if((mid-i)>=0) //going to the left side
               B[mid-i]=A[x++];
        }          
        //Printing the Result
        System.out.println("The Result of Pendulum Fashion Sorting is :");
        for(int i=0; i<n; i++)
           System.out.print(B[i]+"\t");
    }
}//end of class
public class Pendulum_Fashion
{   //class declared
    public static void main()
    {   //main method declared
        pendulum o=new pendulum();
        o.pattern();//object created and method invoked
    }//end of main
}//end of class