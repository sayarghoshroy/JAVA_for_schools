//merge sort 2 sorted array objects
import java.util.*;//imports all classes of java utility package into the program
class array
{   //class declared
    int arr[];//integer array declared
    void accept()
    {   //accepts value of number of terms of array and array elements
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Terms");
        int n=sc.nextInt();
        arr=new int[n];//array created
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Terms of Sorted Array");
            arr[i]=sc.nextInt();
        }//array initialized
    }
}//end of class
class Merger
{   //class declared
    int c[];//integer array declared
    void merge(array a,array b)
    {   //merges 2 'array' objects using berge sort technique
        int n=a.arr.length+b.arr.length,i,x=0,y=0;
        c=new int[n];//variables declared
        for(i=0;i<n;i++)
        {   //loop to implement merge sort
            if(x<a.arr.length&&y<b.arr.length)
            {
                if(a.arr[x]<=b.arr[y])
                c[i]=a.arr[x++];
                else
                c[i]=b.arr[y++];
            }
            else if(x<a.arr.length)
            c[i]=a.arr[x++];
            else
            c[i]=b.arr[y++];
        }//integer array 'c' stores the combined sorted array
    }
    void display()
    {   //Displays array 'c' after Merge Sort
        System.out.println("Array After Sorting --->");
        for(int i=0;i<c.length;i++)
         System.out.print(c[i]+"\t");
    }
}//end of class
public class Merge_Sort
{   //public class declared
    public static void main()
    {   //main method declared
        array a=new array();
        a.accept();
        array b=new array();
        b.accept();//2 'array' objects created and initialized
        Merger o=new Merger();//'Merger' object created
        o.merge(a,b);
        o.display();//merges 2 array objects and displays value
    }//end of main
}//end of class
