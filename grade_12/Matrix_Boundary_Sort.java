//sort boundary elements of matrix in anti clockwise fashion (in ascending order)
import java.util.*;//imports all classes of java utility package into the program
class sort
{   //class declared
    int a[][],n;//variables declared
    void accept()
    {   //accepts number of rows/ columns, creates array and accepts its elements
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Rows or Columns of Square Matrix");
        n=sc.nextInt();
        a=new int[n][n];//array created
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter Term  in row "+(i+1)+" column "+(j+1));
                a[i][j]=sc.nextInt();
            }
        }//array elements accepted
    }
    void Sort()
    {   //sorts boundary elements of array
        int t=4*n-4,c=0,i,j,k,o;//'t' stores number of boundary elements; 'i','j','k',o' are control variables
        int b[]=new int[t];//variables declared and array 'b' created
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==0||j==0||i==n-1||j==n-1)
                    b[c++]=a[i][j];
            }
        }//stores all boundary elements in array 'b'
        int pos,min,s;//variables needed for sorting
        for(i=0;i<t-1;i++)
        {   //sorts array 'b' in ascending order
            pos=i;
            min=b[i];
            for(j=i+1;j<t;j++)
            {   //loop to find minimum value
                if(b[j]<min)
                {
                    pos=j;
                    min=b[j];
                }
            }
            s=min;
            b[pos]=b[i];
            b[i]=s;//swaps values of 2 variables
        }
        i=j=o=0;//control variables initialized
        for(k=0;k<t;k++)
        {   //loop to fill in boundary elements in anti-clockwise fashion
            a[i][j]=b[k];
            if(o==0&&i==n-1)
            o=1;
            else if(o==1&&j==n-1)
            o=2;
            else if(o==2&&i==0)
            o=3;//'o' controls way of filling
            if(o==0)
            i++;
            else if(o==1)
            j++;
            else if(o==2)
            i--;
            else if(o==3)
            j--;//values of variables altered
        }//boundary elements refilled
    }
    void display()
    {   //displays the square matrix in proper fashion
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)//loops to display the array elements
            System.out.print(a[i][j]+"\t");
            System.out.println("");
        }
    }
}//end of class
public class Matrix_Boundary_Sort
{   //public class declared
    public static void main()
    {   //main method declared
        sort o=new sort();
        o.accept();//object created and matrix accepted
        System.out.println("Array Before Sorting :");
        o.display();
        o.Sort();//matrix boundary sorted
        System.out.println("Array After Sorting :");
        o.display();//matrix displayed
    }//end of main
}//end of class