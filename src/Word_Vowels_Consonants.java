//Accepts and sentence, Prints Number of Vowels, Consonants in each word... String tokenizer
import java.util.*;//all classes of java utility package are imported into the program
class words
{   //class declared
    static int countVowel(String s)
    {   //counts and returns number of vowels in a word
        s=s.toUpperCase();
        int count=0;
        char ch;//variables declared
        for(int i=0;i<s.length();i++)
        {
            ch=s.charAt(i);
            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')//checks whether character is a vowel
                count++;
        }
        return count;//'count' represents number of variables
    }
      
    static String convert(String s)
    {   //converts 1st character to uppercase
        char ch=s.charAt(0);//extracting the first character
        ch=Character.toUpperCase(ch);//converting that character to UpperCase
        String f=ch+s.substring(1);//appending it to the rest of the string
        return f;
    }
     
    static String addSpace(String s,int max)
    {   //adds extra space to make words equal in length
        int x=max-s.length();
        for(int i=1;i<=x;i++)
            s=s+" ";//spaces added
        return s;
    }
      
    void display()
    {   //displays number of vowels and consonants in each word
        Scanner sc=new Scanner(System.in); //Scanner object created
        System.out.println("Enter a sentence (Ending with '.' or '?')");
        String s=sc.nextLine();
        int l=s.length();
        char last=s.charAt(l-1);//extracting the last character           
        //Checking whether the sentence ends with '.' or '?'
        if(last!='.'&&last!='?')
            System.out.println("Invalid Input. End a sentence with either '.' or '?'");
        else
        {   //only if input is valid
            StringTokenizer str=new StringTokenizer(s," .?");//StringTokenizer object created
            int x=str.countTokens();
            String ans="";
            String word[]=new String[x];//array 'word' stores each word
            int vow,con,max=0;//variables declared
            for(int i=0;i<x;i++)
            {   //loop to extract words and store them in array after conversion to proper standards
                word[i]=str.nextToken();//extracting words and saving them in an array
                ans=ans+" "+convert(word[i]);
                if(word[i].length()>max)
                    max=word[i].length();
            }
            System.out.println("Sentence = "+ans.trim());
            String y=addSpace("Word",max);//required number of spaces added
            System.out.println(y+"\tVowels\tConsonant");//heading displayed
            for(int i=0;i<x;i++)
            {   //loop to print number of vowels, consonants
                vow=countVowel(word[i]);
                con=word[i].length()-vow;
                y=addSpace(word[i],max);
                System.out.println(y+"\t"+vow+"\t"+con);//values displayed with spaces
            }
        }
    }
}//end of class
public class Word_Vowels_Consonants
{   //public class declared
    public static void main()
    {   //main method declared
        words o=new words();
        o.display();//object created and function invoked
    }//end of main
}//end of class