public class helloworld
{
public static void main(String args[])
{
int a[]={2,1,9,5,8,3,7,4};
int i,j,min,pos,s;
for(i=0;i<8;i++)
{
pos=i;
min=a[i];
for(j=i;j<8;j++)
{
if(min>a[j])
{
pos=j;
min=a[pos];
}
}
s=a[i];
a[i]=a[pos];
a[pos]=s;
}
for(i=0;i<8;i++)
System.out.println(a[i]);
}
}