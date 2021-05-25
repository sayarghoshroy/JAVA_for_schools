//searches for an Admission number using Binary Search (recursion)
//Number of Admission numbers=10
import java.util.*;//all classes of java utility package are imported into the program
class Admission
{   //class declared
    int Adno[]=new int[10];//integer array declared
    Admission() // Default constructor
    {   // Default constructor
        for(int i=0; i<10; i++)
            Adno[i]=0;
    }
    void fillArray()
    {   // Function to accept elements of the array
        Scanner sc = new Scanner(System.in);//Scanner object created
        for(int i=0;i<10;i++)
        {   //loop to accept elements of array
            System.out.println("Enter Admission number of student "+(i+1));
            Adno[i] = sc.nextInt();
        }         
        //Sorting the array in ascending order
        int temp=0;
        for(int i=0; i<9; i++)
        {   //loop to bubble sort 10 elemeents
            for(int j=i+1; j<10; j++)
            {
                if(Adno[i]>Adno[j])
                {
                    temp = Adno[i];
                    Adno[i] = Adno[j];
                    Adno[j] = temp;
                }
            }
        }            
    }
    int binSearch(int l,int u,int v)
    {   // Recursive function implementing binary search
        int mid = (l + u)/2;
        if(u < l)//condition if the search is unsuccessful
            return -1;
        if(v==Adno[mid])//condition if the search is successful
            return mid;
        else if(v>Adno[mid])//search continues in upper half
            return binSearch(mid+1,u,v);
        else //search continues in lower half
            return binSearch(l,mid-1,v);
    }
}//end of class
public class Binary_Search
{   //public class declared
    public static void main()
    {   //main method declared
        Scanner sc = new Scanner(System.in);//Scanner object created
        Admission ob = new Admission();
        System.out.println("Enter Admission numbers");
        ob.fillArray();//object created and initialized
        System.out.print("Enter an Admission number to search : ");
        int v = sc.nextInt();//search term stored in v
        int p=ob.binSearch(0,9,v);//p stores the result of binary search
        if(p!=-1)//if result of search is positive
            System.out.println("Admission Number found at position "+(p+1)+" of sorted array.");
        else
            System.out.println("Admission Number Not found");
    }//end of main
}//end of class