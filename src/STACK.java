//implements a Stack
class STACK
{   //class declared
    int a[];
    int l,top;//variables declared
    STACK(int l)
    {   //constructor to initialize elements and create array to hold stack
        this.l=l;
        a=new int[l];
        for(int i=0;i<l;i++)
            a[i]=0;
        top=-1;//array elements and 'top' initialized
    }
    void push(int item)
    {   //inserts and element into the stack
        if(top==l-1)//checks for overflow
        System.out.println("Stack Overflow");
        else
        a[++top]=item;//inserts element and modifies 'top'
    }
    void pop()
    {   //deletes element from the stack
        if(top==-1)//checks for underflow
        System.out.println("Stack Underflow");
        else
        System.out.println("Popped Element : "+a[top--]);//displayed deleted element and modifies 'top'
    }
    void display()
    {   //displays elements of stack
        if(top==-1)//checks for underflow
        System.out.println("Stack Underflow");
        else
        {   //displays stack in proper order
            System.out.println("Stack Elements : ");
            for(int i=0;i<=top;i++)
            System.out.println(a[i]);
        }
    }
}//end of class