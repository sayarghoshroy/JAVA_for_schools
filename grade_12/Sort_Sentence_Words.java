//accepts a sequence of sentences ending with '.','?'or'!' and a space, prints each sentence by arraging their words in ascending order
import java.util.*;
class sorter
{   //class declared
    String s;//'s' will hold the string
    void input()
    {   //accepts the sequence of sentences
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Sentences ( A blank space must be left after a punctuation )");
        s=" "+sc.nextLine();
    }
    void run()
    {   //prints each sentence by arranging words in ascending order
        int start=0,end=0,i,j,k,c=0;//'start,'end' denote start and end of each sentence,'c' is a counter,'i','j','k' are loop control variables
        for(i=0;i<s.length();i++)
        {   //loop runs along length of the string
            if(s.charAt(i)=='.'||s.charAt(i)=='?'||s.charAt(i)=='!')
            {   //if end of a sentence is encountered
                end=i;//'end' is marked
                for(j=start;j<end;j++)
                {   //number of words in a sentence is counted
                    if(s.charAt(j)==' ')
                     c++;
                }
                String w[]=new String[c];//array to hold all words is created
                for(j=0;j<c;j++)
                 w[j]="";//strings constituting the array initialised
                c=0;//value of counter initialised to zero
                for(j=start;j<=end;j++)
                {   //runs from begining to end of each sentence
                    if(s.charAt(j)==' ')
                    {   //begining of word is encountered
                        for(k=j+1;;k++)
                        {   //loop to extract the word
                            if(s.charAt(k)==' '||k==end)
                             break;//when end of word is encountered
                            else
                            w[c]+=Character.toString(s.charAt(k));//word being stored
                        }
                        w[c]=w[c].toUpperCase();//word converted to uppercase
                        c++;//counter incremented
                    }
                }
                System.out.print("The New Sequence :");
                sort(w);//array 'w' sorted and printed
                System.out.print(s.charAt(end));//punctuation mark printed
                start=end+1;//start points to the blank space after the sentence
                System.out.println("");
            }
        }
    }
    static void sort(String w[])
    {   //sorts the string array and prints its words
        String min;//stores first word in a pass (lexicographically)
        int i,j;//loop control variables
        for(i=0;i<w.length-1;i++)
        {   //bubble sorts the array in ascending order
            min=w[i];
            for(j=i+1;j<w.length;j++)
            {
                if(min.compareTo(w[j])>0)
                {   //compares 2 strings lexicographically
                    min=w[j];
                    w[j]=w[i];
                    w[i]=min;
                }
            }
        }
        for(i=0;i<w.length;i++)//sorted array being printed
        System.out.print(" "+w[i]);
    }
}
public class Sort_Sentence_Words
{   //public class declared
    public static void main()
    {  //main method declared
       sorter o=new sorter();
       o.input();
       o.run();//object created and functions invoked
    }//end of main
}//end of class