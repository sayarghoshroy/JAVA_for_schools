 //print 4 digit number in words
 import java.util.*;//imports all classes of java utility package into the program
 class Words
 {   //class declared
     int n;//variables declared
     void input()
     {   //accepts value of 'n'
         Scanner sc=new Scanner(System.in);//Scanner object created
         do
         {
          System.out.println("Enter number < 10000");
          n=sc.nextInt();
         }//validation of input data
         while(n>=10000||n<0);
     }
     void display()
     {   //displaays the number in words
         if(n==0)
         System.out.println("Zero");
         else
         {   //arrays to store necessary words
             String dig[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
             String teen[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
             String oo[]={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
             String s="";//'s' stores the final string
             if(n/1000>0)
             s+=dig[n/1000]+" thousand ";
             n%=1000;
             if(n/100>0)
             s+=dig[n/100]+" hundred ";
             n%=100;
             if(n>=20)
             {
                 s+=oo[n/10-2]+" ";
                 if(n%10!=0)
                 s+=dig[n%10];
             }
             else if(n<=19&&n>=9)
             s+=teen[n-10];
             else if(n<10 && n!=0)
             s+=dig[n];
             //conditions to calculate value of 's'
             System.out.println("The Number in words = "+s.toUpperCase());//result displayed with suitable message
         }
     }
 }//end of class
 public class display_Words
 {   //public class declared
     public static void main()
     {   //main method declared
         Words o=new Words();
         o.input();
         o.display();//object created and functions invoked
     }//end of main
 }//end of class
        