import java.io.*;
public class coded
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Your Code");
String code="32"+in.readLine();
String num="",Msg="";
int i,Num;
for(i=0;i<code.length();i++)
{
num=num+code.charAt(i);
Num=Integer.valueOf(num);
if(Num==32||(Num>64&&Num<92)||(Num>96&&Num<124))
{
if(Msg.endsWith(" ")==true)
{
if(Num!=32)
Msg=Msg+(Character.toString((char)Num)).toUpperCase();
}
else
{
if(Num==32)
Msg=Msg+' ';
else
Msg=Msg+(Character.toString((char)Num)).toLowerCase();
}
num="";
Num=0;
}
}
System.out.println("The Decoded Message :"+Msg);
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          