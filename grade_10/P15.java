public class P15
{
public static void main(String s)
{
int i;
char c;
for(i=0;i<s.length();i++)
{
c=s.charAt(i);
if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
s=s.substring(0,i)+"*"+s.substring(i+1);
}
System.out.println(s);
}
}
