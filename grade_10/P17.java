public class P17
{
public static void main(String s)
{
if(s.endsWith(".")!=true)
s=s+".";
int i,j;
char c;
String f="",a="";
for(i=0;i<s.length();i++)
{
c=s.charAt(i);
if(c!=' ')
a=a+c;
if(c==' '||i==s.length()-2)
{
for(j=a.length()-1;j>=0;j--)
{
f=f+a.charAt(j);
}
f=f+" ";
a="";
}
}
System.out.println(f+".");
}
}


