public class P13
{
public static void main(String s)
{
int c=1,i,j,A=1,pos;
char z;
for(i=0;i<s.length();i++)
{
if(s.charAt(i)==' ')
c++;
}
char ch[]=new char[c];
String f=""+s.charAt(0);
ch[0]=s.charAt(0);
for(i=0;i<s.length()-1;i++)
{
if(s.charAt(i)==' ')
{
ch[A]=s.charAt(i+1);
f=f+s.charAt(i+1);
A++;
}
}
System.out.println("The New Word = "+f);
for(i=0;i<c;i++)
{
z=ch[i];
pos=i;
for(j=i+1;j<c;j++)
{
if(z>ch[j])
{
z=ch[j];
pos=j;
}
}
ch[pos]=ch[i];
ch[i]=z;
}
System.out.println("Arranged in Alphabetical Order");
for(i=0;i<c;i++)
System.out.print(ch[i]);
}
}
