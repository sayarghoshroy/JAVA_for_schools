import java.io.*;
public class mad
{
public static void main(String args[])throws IOException
{
int ch;
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Your Choice");
System.out.println("1.Find All 3 digit Special Numbers");
System.out.println("2.Check an Automorphic Number");
System.out.println("3.Calulate Sum of Factors of a Number");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
for(int i=100;i<=999;i++)
{
int p=i,a=0;
for(int j=1;j<=3;j++)
{
int m=p%10;
int c=1;
for(int k=1;k<=m;k++)
c=c*k;
a=a+c;
p=p/10;
}
if(a==i)
System.out.println(i +" is a Special Number ");
}
break;
case 2:
System.out.println("Enter a Number");
int d=Integer.parseInt(in.readLine());
d=d*d;
int g=d;
int e=1;
int f=0;
while(d/10!=0)
{
f=f+(d%10)*Math.pow(10,e);
e=e+1;
d=d/10;
}
if(f==g)
System.out.println("The Number is Automorphic");
break;
case 3:
System.out.println("Enter a Number");
int z=Integer.parseInt(in.readLine());
int y=0;
for(int x=1;x<=z;x++)
{
if(z%x==0)
y=y+x;
}
System.out.println("Required Sum = "=y);
break;
}
}
}



