//accepts first term, orientation clockwise or anticlockwise, number of rows or columns and shows the spiral matrix
import java.util.*;//all classes of java utility package are imported into the program
class circular
{ //class declared
  void Create()
   {//creates the spiral matrix
    Scanner sc=new Scanner(System.in);//Scanner object created
    double n;
    System.out.println("Enter Number of rows and columns");
    n=sc.nextDouble();//number of rowns stored
    int a,t=1,i,x=0,y=-1;//control variables declared    
    System.out.println("Enter initial Number");
    a=sc.nextInt();//initial number stored in 'a'
    int b=a;//'b' stores copy of 'a'                                                                                                 
    double e=n*n;//'e' holds number of elements
    int s[][]=new int[(int)n][(int)n];//square matrix created
    while(true)
    {//loop to fill elements in square matrix
     for(i=1;i<=((int)(Math.round(n-0.5)));i++)
     {//for-loop executes based on integer value of 'n-0.5'
      if(t%4==1)
       y++;
      else if(t%4==2)
       x++;
      else if(t%4==3)
       y--;
      else
       x--;
       //values of control variables modified based on value of 't'
      s[x][y]=a;//cell filled
      a++;//value of element incremented
     }
     t++;//value of 't' modified
     n=n-0.5;//value of 'n' decreased by 0.5
     if(a>=e+b)
      break;//when all elements have been filled loop breaks
    }
    int z;//'z' determines orientation
    do
    {//validation of orientation
     System.out.println("Enter Orientation - '1' For Clockwise, '2' for AntiClockwise");
     z=sc.nextInt();//orientation accepted
    }while(z<1||z>2);
    
    for(x=0;x<(int)(Math.sqrt(e));x++)
    { //loop to print matrix in proper fashion
     for(y=0;y<(int)(Math.sqrt(e));y++)
     {
      if(z==1)//Clockwise Orientation
       System.out.print(s[x][y]+"\t");
      else if(z==2)//Anticlockwise Orientattion
       System.out.print(s[y][x]+"\t");
     }
     System.out.println();//Takes cursor to new line
    }
  }
}//end of class
public class Spiral_Matrix
{   //public class declared
    public static void main()
    {   //main method declared
       circular o=new circular();
       o.Create();//object created and function invoked
    }//end of main
}//end of class