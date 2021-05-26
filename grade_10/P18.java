public class P18
{
public static void main(String s)
{
int i,j,pos;
char ch;
char c[]=new char[s.length()];
s=s.toUpperCase();
for(i=0;i<c.length;i++)
{
c[i]=s.charAt(i);
}

for(i=0;i<c.length;i++)
{
ch=c[i];
pos=i;
for(j=i+1;j<c.length;j++)
{
if(c[j]<ch)
{
pos=j;
ch=c[j];
}
}
c[pos]=c[i];
c[i]=ch;
}

System.out.println("The Letters Alphabetically are : ");
for(i=0;i<c.length;i++)
System.out.print(c[i]);
System.out.println("");
int f=0;
char k=c[0];
System.out.print("Letters not present to make an alphabetical order : ");

while(k!=c[c.length-1])
{
for(j=0;j<c.length;j++)
{
if(c[j]==k)
{
f=1;
break;
}
}
if(f==0)
System.out.print(k);
k++;
f=0;
}
}
}




