//accepts 2 matrices and prints their multiplication result
import java.util.*;//all classes of java utility package are imported into the program
class Matrix
{   //class declared
    int matrix[][],r,c;//variables declared
    void accept()
    {   //accepts values of r, c and creates the matrix by accepting value of each element
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Rows");
        r=sc.nextInt();
        System.out.println("Enter Number of Columns");
        c=sc.nextInt();
        matrix=new int[r][c];//matrix created
        for(int i=0;i<r;i++)
        {   //accepts values of elements of matrix
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter an element in row "+(i+1)+" column "+(j+1));
                matrix[i][j]=sc.nextInt();
            }
        }
    }     
    void display()
    {   //displays the matrix in proper form
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(matrix[i][j]+"\t");
            System.out.println("");
        }
    }
    Matrix Multiply(Matrix a,Matrix b)
    {   //finds result of multiplication of 2 matrices
        if(a.c!=b.r)
        {//checks if matrices are suitable for multiplication
         System.out.println("Matrix Multiplication is Not Possible");
         return null;
        }
        else
        {   //finds the multiplication result of 2 matrices suitable for multiplication
            this.r=a.r;
            this.c=b.c;
            this.matrix=new int[r][c];
            //this refers to the currently calling object which stores the result
            int sum=0;//all variables have been initialized
            for(int i=0;i<a.r;i++)
            {   //loop to find multiplication result of each element
                for(int j=0;j<b.c;j++)
                {
                    for(int k=0;k<a.c;k++)//a.c=b.r
                        sum=sum+a.matrix[i][k]*b.matrix[k][j];
                    this.matrix[i][j]=sum;
                    sum=0;
                }
            }
            return this;//returns the currently calling object after modifying it
        }
    }
}
public class Matrix_Multiply
{   //public class declared
    public static void main()
    {   //main method declared
        Matrix a=new Matrix();
        a.accept();
        System.out.println("The Matrix 'a' :");
        a.display();//first matrix created and displayed
        Matrix b=new Matrix();
        b.accept();
        System.out.println("The Matrix 'b' :");
        b.display();//second matrix created and displayed
        Matrix product=new Matrix();
        product=product.Multiply(a,b);//matrix object to store product created and assigned a value dynamically
        if(product!=null)
        {//prints multiplication result if matrices were suitable for multiplication
          System.out.println("The Multiplication result a X b =");
          product.display();
        }
    }//end of main
}//end of class