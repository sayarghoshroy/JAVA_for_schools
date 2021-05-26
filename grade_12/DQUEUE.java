//implements a Double Ended Queue
class DQUEUE
{   //class declared
    int a[],f,r,l;//variables declared
    DQUEUE(int l)
    {   //constructor to initialize queue elements
        this.l=l;//'l'represents length of queue
        a=new int[l];//array to hold queue created 
        for(int i=0;i<l;i++)
            a[i]=0;
        f=-1;
        r=-1;//'f','r' represent front and rear respectively
    }
    void InsertFront(int i)
    {   //inserts element at front pointer
        if(f==-1&&r==-1)
        {
            f=0;
            r=0;
            a[f]=i;
        }//checks if elements are present
        else if(f==0)
        System.out.println("Overflow at Front End");
        else
         a[--f]=i;
            return;//element inserted, value of front modified
    }
    void InsertRear(int i)
    {   //inserts element at rear pointer
        if(f==-1&&r==-1)
        {
            f=0;
            r=0;
            a[r]=i;
        }//checks if elements are present
        else if(r==l-1)
        System.out.println("Overflow at Rear End");
        else
        a[++r]=i;
        return;//element inserted, value of rear modified
    }
    void deleteFront()
    {   //deletes element at front pointer
        if(f==-1&&r==-1)//checks for underflow
        System.out.println("Queue Underflow");
        else
        {
         System.out.println("Deleted Element = "+a[f]);//deleted element displayed
        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else
        f++;
        }//values of front and rear modified
        return;
    }
    void deleteRear()
    {   //deletes element at rear pointer
        if(f==-1&&r==-1)//checks for underflow
        System.out.println("Queue Underflow");
        else
        {
            System.out.println("Deleted Element = "+a[r]);//deleted element displayed
            if(f==r)
            {
                f=-1;
                r=-1;
            }
            else
             r--;
        }//values of front and rear modified
        return;
    }
    void display()
    {   //displays elements of queue 
        if(f==-1&&r==-1)//checks for underflow
        System.out.println("Queue Underflow");
        else
        { //displays elements in order
          System.out.println("Displaying Queue from Front to Rear");
          for(int i=f;i<=r;i++)
            System.out.print(a[i]+"\t");
          System.out.println("");
        }
    }
}//end of class