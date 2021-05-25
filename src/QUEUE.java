//implements a Queue
class QUEUE
{   //class declared
    int Q[],size,front,rear;//variables declared
    QUEUE(int cap)//constructor to initialize 'front','rear' and queue size
    {
        size=cap;
        Q=new int[size];
        front=0;
        rear=0;
    }
    void insert(int v)
    {   //inserts element into the queue
        if(rear==size)//checks for overflow
            System.out.println("OVERFLOW");
        else
            Q[rear++]=v;//inserts element into queue, modifies rear
    }
    void delete()
    {   //deletes element from queue
        if(front==0&&rear==0)//checks for underflow
            System.out.println("UNDERFLOW");
        else
        {
            int val=Q[front++];//stores the value of element which will be deleted
            if(front==rear)//checks if queue is empty
            {
                front=0;
                rear=0;
            }
            System.out.println("Deleted Element : "+val);//displayes deleted element
        }
    }
    void display()
    {   //displays elements of queue
        if(front==0&&rear==0)//checks for undeflow
            System.out.println("Queue Underflow");
        else
        {
            System.out.println("The elements in the queue are : ");
            for(int i=front;i<rear;i++)//loop to display queue elements
                System.out.println(Q[i]);
        }
    }
}//end of class