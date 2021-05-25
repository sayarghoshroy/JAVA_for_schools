//accept n numbers into sda and sort them in order of Their Frequencies of occurenece ... display frequecies with element... high to low
import java.util.*;//imports all classes of java utility package into the program
class arrange
{   //class declared
    int a[],n;//variables declared
    void run()
    {   //Arranges number in order of their frequencies of occurence
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Number of Terms");
        n=sc.nextInt();
        a=new int[n];//Array to hold all elements created
        int i,j,min,pos,swap,c=0,flag=0;//variables declared
        for(i=0;i<n;i++)
        {   //loop to accept array elements
            System.out.println("Enter Number into Array");          
            a[i]=sc.nextInt();
            for(j=0;j<i;j++)
            {   //if number has not occured before number of unique terms will increase
                if(a[i]==a[j])
                {
                    flag=1;
                    break;
                }
            }
            if(flag==0)//flag=0 represents unique term
            c++;//c stores number of unique terms
            flag=0;//flag reset to 0
        }
        int F[]=new int[c];//F stores frequency of each unique term
        int E[]=new int[c];//E stores unique elements
        int e,k=0;// e stores elemeents, k is a counter
        for(i=0;i<n;i++)
        {   //loop to fill in unique elements and their frequencies
            e=a[i];
            for(j=0;j<i;j++)
            {   //loop to check if the element has occured before
                if(e==a[j])
                {
                    flag=1;//flag is raised
                    break;
                }
            }
            if(flag==0)
            {   //if element has occured for the very 1st time
                E[k]=e;//stores element
                for(j=0;j<n;j++)
                {   //loop to find frequency of the element
                    if(a[j]==e)
                     F[k]++;//frequency of element is increased
                }
                k++;//k is increased
            }
            flag=0;//flag is reset
        }
        for(i=0;i<c;i++)
        {
            //sorts E[],F[] in ascending order using selection sort technique
            min=F[i];
            pos=i;
            for(j=i+1;j<c;j++)
            {   //loop to find minimum element
                if(F[j]<min)
                {
                    pos=j;
                    min=F[j];
                }
            }
            swap=F[i];
            F[i]=min;
            F[pos]=swap;//Values of Frequency Swapped
            swap=E[i];
            E[i]=E[pos];
            E[pos]=swap;//Values of Element Swapped
        }
        System.out.println("Elements Arranged in descending order of their frequency of Occurrence");
        for(i=c-1;i>-1;i--)//loop to display elements and corresponding frequencies
        System.out.println("Element : "+E[i]+" Frequency : "+F[i]);
    }
}//end of class
public class Frequency_Arrange
{   //public class declared
    public static void main()
    {   //main method declared
        arrange o=new arrange();
        o.run();//object created and method invoked
    }//end of main
}//end of class      