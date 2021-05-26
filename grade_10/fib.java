import java.io.*;
class fib
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter number of lines");
int n=Integer.parseInt(in.readLine());
int c=1,t=1;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=t;j++)
{
System.out.print(fibo(c)+"\t");
c++;
}
t++;
System.out.println("");
}
}
static int fibo(int n)
{
if(n==1)
return 0;
else if(n==2)
return 1;
else
return fibo(n-1)+fibo(n-2);
}
}

