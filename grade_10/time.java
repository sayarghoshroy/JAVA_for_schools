import java.io.*;
public class time
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int hour,min;
do
{
System.out.println("Enter The Hour of The Day (in 12 hours Format)");
hour=Integer.parseInt(in.readLine());
}
while(hour<0||hour>12);
do
{
System.out.println("Enter the Number of Minutes Passed");
min=Integer.parseInt(in.readLine());
}
while(min<0||min>59);
String words[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Quarter","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
if(min/10==0)
System.out.println("The Time Entered - "+hour+":0"+min);
else
System.out.println("The Time Entered - "+hour+":"+min);
int a=0;
if(min>30)
{
a=2;
min=60-min;
hour++;
if(hour==13)
hour=1;
}
else if(min>0&&min<=30)
a=1;

String s="";
if(min!=0)
{
if(min<21)
s=words[min];
else if(min>20)
s=words[20]+" "+words[min-20];
}
else if(a==0)
s=words[hour]+" o'clock";

if(a==1)
s=s+" past "+words[hour];
else if(a==2)
s=s+" to "+words[hour];

System.out.println("The Time in Words (in 12 Hour Format) is [ "+s+" ]");
}
}



