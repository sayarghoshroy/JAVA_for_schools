//implements a Circular Queue
class CQUEUE
{   //class decalred
    int a[],f,r,l;//variables declared
    CQUEUE(int l)
    {   //constructor to initialize queue elements
        this.l=l;//'l' is the queue length
        a=new int[l];//array created to store queue elements
        for(int i=0;i<l;i++)
            a[i]=0;
        f=-1;
        r=-1;
    }//front and rear are denoted by f, r
    void insert(int i)
    {   //inserts an element in the circular queue
        if(f==0&& r==l-1||f==r+1)
        System.out.println("Queue Overflows");
        else
        {   //if there is space in the circular queue
            if(f==-1&&r==-1)
            {   //if front and rear are at null
                f=0;
                r=0;
            }
            else if(r==l-1)
            r=0;
            else
            r++;
            a[r]=i;//element inserted in the circular queue and value of rear modified
        }
    }
    void delete()
    {   //deletes an element from the circular queue
        if(f==-1&&r==-1)
        System.out.println("Queue Underflows");
        else
        {   //if elements are present in the circular queue
            System.out.println("Deleted Element = "+a[f]);//deleted element displayed
            if(f==l-1)
            f=0;
            else if(f==r)
            {   //if front and rear ar at same point
                f=-1;
                r=-1;
            }
            else
            f++;
        }//value of front modified
    }
    void display()
    {   //displays elements of circular queue in order
        if(f==-1&&r==-1)
        System.out.println("Queue Underflow");
        else
        {   //if circular queue has elements
            System.out.println("Queue Elements :");
            for(int i=0;i<l;i++)
            {   //loop to diplay elements
                if((f<=r)&&(i>=f&&i<=r))
                System.out.print(a[i]+"\t");
                else if((f>r)&&(i>=f||i<=r))
                System.out.print(a[i]+"\t");
                else
                System.out.println("\t");
            }
            System.out.println("");
        }//elements have been displayed
    }
}//end of class