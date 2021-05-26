import java.io.*;
public class smith
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
int n;
System.out.println("Enter a Number");
n=Integer.parseInt(in.readLine());
int sum1=0,sum2=0,c=0,t,copy=n,i;
while(copy>0)
{
sum1=copy%10+sum1;
copy/=10;
}
copy=n;
while(copy>1&&(isPrime(copy)==false))
{
for(i=2;i<copy;i++)
{
if(copy%i==0&&(isPrime(i)==true))
{
t=i;
while(t>0)
{
sum2=sum2+t%10;
t/=10;
}
t=0;
copy/=i;
break;
}
}
}
if(isPrime(copy)==true)
{
while(copy>0)
{
sum2=sum2+copy%10;
copy/=10;
}
}

if(sum1==sum2)
System.out.println("The Number is a Smith Number");
else
System.out.println("The Number is Not a Smith Number");
}
static boolean isPrime(int a)
{
int i,s=0;
for(i=1;i<=a;i++)
{
if(a%i==0)
s++;
}
if(s==2)
return true;
else 
return false;
}
}



