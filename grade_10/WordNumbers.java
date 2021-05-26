import java.io.*;
public class WordNumbers
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter a Sentence");
String s=in.readLine();
s=s.toLowerCase();
if(s.endsWith(".")!=true)
s=s+".";
int Nwords=1,i;
for(i=0;i<s.length()-1;i++)
{
if(s.charAt(i)==' ')
Nwords++;
}
int Wnum[]=new int[Nwords];
int choice;
for(i=0;i<Nwords;i++)
{
do
{
System.out.println("Do You Wish to Alter the word in place "+(i+1)+"? Enter '1' for Yes,'0' for no");
choice=Integer.parseInt(in.readLine());
}
while(choice!=0&&choice!=1);
if(choice==1)
Wnum[i]=1;
else
Wnum[i]=0;
}//Inputs User's Choice For the Words he/she Wishes to Alter

int w=0;
String f="";
for(i=0;i<s.length()-1;i++)
{
if(s.charAt(i)==' ')
{
w++;
f=f+" ";
}
else if(Wnum[w]==1)
{
if(s.charAt(i)=='z')
f=f+"a";
else
f=f+(char)(s.charAt(i)+1);
}
else if(Wnum[w]==0)
f=f+s.charAt(i);
}

System.out.println(f);
}
}