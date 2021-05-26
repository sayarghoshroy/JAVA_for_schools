import java.io.*;
public class FrequencyOrderArrange
{
public static void main()throws IOException
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("Enter Number of Terms");
int n=Integer.parseInt(in.readLine());
int a[]=new int[n];
int i,j,min,pos,swap,c=0,flag=0;
for(i=0;i<n;i++)
{
System.out.println("Enter a Number");
a[i]=Integer.parseInt(in.readLine());
for(j=0;j<i;j++)
{
if(a[i]==a[j])
{
flag=1;
break;
}
}
if(flag==0)
c++;
flag=0;
}

int F[]=new int[c];
int E[]=new int[c];
int e,k=0;
for(i=0;i<n;i++)
{
e=a[i];
for(j=0;j<i;j++)
{
if(e==a[j])
{
flag=1;
break;
}
}
if(flag==0)
{
E[k]=e;
for(j=0;j<n;j++)
{
if(a[j]==e)
F[k]++;
}
k++;
}
flag=0;
}
// sorting
for(i=0;i<c;i++)
{
min=F[i];
pos=i;
for(j=i+1;j<c;j++)
{
if(F[j]<min)
{
pos=j;
min=F[j];
}
}
swap=F[i];
F[i]=min;
F[pos]=swap;
swap=E[i];
E[i]=E[pos];
E[pos]=swap;
}
System.out.println("Final List");
for(i=c-1;i>-1;i--)
System.out.println("Element : "+E[i]+" Frequency : "+F[i]);
}
}
