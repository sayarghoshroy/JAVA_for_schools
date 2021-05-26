import java.io.*;
public class circulars
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
double n;
System.out.println("Enter Number of rows and columns");
n=Double.parseDouble(in.readLine());
int a,t=1,i,x=0,y=-1;       
System.out.println("Enter initial Number");
a=Integer.parseInt(in.readLine());
int b=a;                                                                                                                                           
double e=n*n;
int s[][]=new int[(int)n][(int)n];
while(true)
{
for(i=1;i<=((int)(Math.round(n-0.5)));i++)
{
if(t%4==1)
y++;
else if(t%4==2)
x++;
else if(t%4==3)
y--;
else
x--;
s[x][y]=a;
a++; 
}
t++;
n=n-0.5;
if(a>=e+b)
break;
}
System.out.println("Enter Orientation - '1' For Clockwise, '2' for AntiClockwise");
int z=Integer.parseInt(in.readLine());
outer:
for(x=0;x<(int)(Math.sqrt(e));x++)
{
for(y=0;y<(int)(Math.sqrt(e));y++)
{
if(z==1)
System.out.print(+s[x][y]+"\t");
else if(z==2)
System.out.print(+s[y][x]+"\t");
else
{
System.out.print("Invalid Choice");
break outer;
}
}
System.out.println();
}
}
}
