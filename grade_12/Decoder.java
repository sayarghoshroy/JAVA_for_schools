//Accepts series of ASCII values, decodes it such that every word begins with a capital letter
import java.util.*;//All classes of java utility package are imported into the program
class coded
{   //class declared
    String code,num,Msg;//'code' stores the code,'num' temporarily stores code snippet,'Msg' stores the decoded message
    coded()
    {  //default constructor of the class
        code ="";
        num="";
        Msg="";
    }
    void input()
    {   //accepts value of the code
        Scanner sc=new Scanner(System.in);//Scanner object created
        System.out.println("Enter Your Code");
        code="32"+sc.nextLine();
    }
    void calc()
    {   //calculates the decoded message
        int i,Num;//variables declared
        for(i=0;i<code.length();i++)
        {//loop to implement decoding
          num=num+code.charAt(i);
          Num=Integer.valueOf(num);//'Num" storing and part of code and comparing it with default ASCII values
          if(Num==32||(Num>64&&Num<92)||(Num>96&&Num<124))
          {//comparing 'Num' with defalt values
          if(Msg.endsWith(" "))
          {//if 'Msg' has ended with a space
           if(Num!=32)
            Msg=Msg+(Character.toString((char)Num)).toUpperCase();
          }//Character converted to uppercase and appended
          else
          {//Appending characters
           if(Num==32)
            Msg=Msg+' ';//Space added
           else
            Msg=Msg+(Character.toString((char)Num)).toLowerCase();//Lowercase character added
          }
          num="";
          Num=0;//values of 'num' and 'Num' changed to default value
         }
        }//for-loop ends
        System.out.println("The Decoded Message :"+Msg);//decoded message displayed
    }
}//end of class
public class Decoder
{   //public class declared
    public static void main()
    {   //main method declared
        coded o=new coded();
        o.input();
        o.calc();//object created and functions invoked
    }//end of main
}//end of class