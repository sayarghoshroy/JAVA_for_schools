public class PP8
{
public static void main(String a,String b)
{
int c=1,p=0,i,j,A=0,o=0;
String s="";
for(i=0;i<b.length();i++)
{
if(b.charAt(i)==' ')
c++;
}
String m[]=new String[c];
for(i=0;i<b.length();i++)
{
if(b.charAt(i)!=' ')
s=s+b.charAt(i);
if(b.charAt(i)==' '||b.length()-1==i)
{
m[A]=s;
s="";
A++;
}
}
for(i=0;i<a.length();i++)
{
if(a.charAt(i)!=' ')
s=s+a.charAt(i);
if(a.charAt(i)==' '||i==a.length()-1)
{
for(j=0;j<c;j++)
{
if(s.equals(m[j]))
p++;
}
if(p>0)
{
if(o==0)
{
System.out.print(s);
o=1;
}
else if(o==1)
System.out.print(", "+s);
}
s="";
p=0;
}
}
System.out.print(".");
}
}
