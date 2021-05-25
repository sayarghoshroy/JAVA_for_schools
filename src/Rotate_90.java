//accepts a square matrix and rotates it 90 degrees clockwise
import java.util.*;//all classes of java utility package are imported into the program
class Rotation
{   //class declared
    int matrix[][],n;//variables declared
    void accept()
    {   //accepts value of 'n' and creates the matrix by accepting value of each element
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Rows or columns");
        n=sc.nextInt();
        matrix=new int[n][n];//matrix created
        for(int i=0;i<n;i++)
        {   //accepts values of elements of matrix
           for(int j=0;j<n;j++)
           {
               System.out.println("Enter an element in row "+(i+1)+" column "+(j+1));
               matrix[i][j]=sc.nextInt();
           }
        }
    }     
    void display(int k)
    {   //displays 'matrix' or 'rotated' in proper form according to value of 'i'
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(k==1)//prints original matrix
                 System.out.print(matrix[i][j]+"\t");
                else//prints rotated matrix
                 System.out.print(rotated[i][j]+"\t");
            }
            System.out.println("");
        }
    }
    int rotated[][];//stores the rotated matrix
    void rotate()
    {   //rotates the matrix 90 degrees
        rotated=new int[n][n];
        for(int i=0;i<n;i++)
        {   //loop to rotate the matrix 90 degress
           int x=n-1;
           for(int j=0;j<n;j++)
           {
               rotated[i][j]=matrix[x][i];
               x--;
           }
        }//rotated matrix stored in 'rotate'
    }
}//end of class
public class Rotate_90
{   //public class declared
    public static void main()
    {   //main method declared
        Rotation o=new Rotation();
        o.accept();
        System.out.println("Original Matrix :");
        o.display(1);
        o.rotate();
        System.out.println("Rotated Matrix :");
        o.display(2);//object created and functions invoked
    }//end of main
}//end of class