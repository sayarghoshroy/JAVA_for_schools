public class P16
{
public static void main(String s)
{
s=s.toUpperCase()+" ";
char c;
int i,j,P=0;
String t="",f="";
for(i=0;i<s.length();i++)
{
if(s.charAt(i)!=' ')
t=t+s.charAt(i);
else if(s.charAt(i)==' ')
{
for(j=0;j<t.length();j++)
{
c=t.charAt(j);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
{
P=1;
break;
}
}
if(P==1)
f=f+t.substring(j)+t.substring(0,j)+"AY ";
else
f=f+t+"AY ";
P=0;
t="";
}
}
System.out.println(f);
}
}