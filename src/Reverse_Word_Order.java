//accepts a sentence, prints its words in reverse order
import java.util.*;//all classes of java utility package are imported into the program
class reverse
{   //class declared
    String s;//'s' stores the sentence
    reverse()
    {   //default constructor
        s="";
    }
    void input()
    {   //accepts the senteence to be converted 
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Sentence");
        s=" "+sc.nextLine()+" ";
    }
    void display()
    {   //displays words of the sentence in reverse order
        System.out.println("Words in Reverse Order : ");
        int f=s.length()-1,l=s.length()-1;//stores the final index of space
        char c;//variables declared
        for(int i=s.length()-2;i>=0;i--)
        {   //loop to print all words in reverse
            c=s.charAt(i);
            if(c==' ')
            {   //if blank space is found
                f=i;
                for(int j=f+1;j<l;j++)
                {  //prints characters of word excluding punctuation  
                   if(Character.isLetter(s.charAt(j)))
                    System.out.print(s.charAt(j));
                }
                System.out.print("   ");//space printed
                l=i;//values of 'f','l' have been modified
            }
        }
    }
}//end of class
public class Reverse_Word_Order
{   //public class declared
    public static void main()
    {   //main method declared
       reverse o=new reverse();
       o.input();
       o.display();//object created and functions invoked
    }//end of main
}//end of class