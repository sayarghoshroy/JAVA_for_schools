public class merge
{
public static void main(String args[])
{
int a[]={10,30,50,70,90};
int b[]={20,40,60,80,100};
int c[]=new int[(a.length+b.length)];
int i;
for(i=0;i<a.length;i++)
c[i]=a[i];
for(i=a.length;i<c.length;i++)
c[i]=b[i-a.length];
for(i=0;i<c.length;i++)
System.out.println(c[i]);
}
}
