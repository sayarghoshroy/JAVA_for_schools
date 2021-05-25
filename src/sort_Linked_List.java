//sorts elements of linked list in ascending order
import java.util.*;//imports all classes of java utility package into the program
class node
{   //class declared
    int data;
    node link;//variables declared
    node()
    {   //default constructor
        data=0;
        link=null;
    }
    void create()
    {   //creates the linked list by accepting values of nodes
        Scanner sc=new Scanner(System.in);//Scanner object created
        int n;
        System.out.println("Enter the First Data");
        this.data=sc.nextInt();
        System.out.println("Enter number of Nodes to be created");
        n=sc.nextInt();
        node temp;
        node ptr=this;//variables declared
        for(int i=1;i<n;i++)
        {   //loop to create 'n' nodes
            temp=new node();
            System.out.println("Enter Next Data");
            temp.data=sc.nextInt();
            temp.link=null;
            ptr.link=temp;
            temp=null;
            ptr=ptr.link;//data and links assigned
        }
    }
    void display()
    {   //displays the linked list
        node ptr=this;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link;
        }
    }
    void sort()
    {   //sorts the linked list in ascending order
        node ptr,ptr1;
        int temp;//variables declared
        for(ptr=this;ptr!=null;ptr=ptr.link)
        {   
            for(ptr1=ptr.link;ptr1!=null;ptr1=ptr1.link)
            {   //loops sort the data in the nodes of the linked list in ascending order
                if(ptr1.data<ptr.data)
                {
                    temp=ptr1.data;
                    ptr1.data=ptr.data;
                    ptr.data=temp;
                }
            }
        }
    }
}
public class sort_Linked_List
{   //public class declared
    public static void main()
    {   //main method declared
        node first=new node();
        first.create();
        System.out.println("Data in The Linked List Before Sorting :");
        first.display();//linked list created and displayed
        first.sort();//linked list sorted
        System.out.println("Data in The Linked List After Sorting :");
        first.display();//linked list displayed afteer sorting
    }//end of main
}//end of class