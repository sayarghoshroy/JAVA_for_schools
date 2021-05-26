public class P14
{
public static void main(String s)
{
String f=""+s.charAt(0);
int i;
for(i=0;i<s.length()-1;i++)
{
if(s.charAt(i)==' ')
f=f+s.charAt(i+1);
}
System.out.println("The New Word = "+f);
char ch;
int j;
i=0;
String z=f;
while(i<f.length())
{
ch=f.charAt(i);
while(z.lastIndexOf(ch)!=i)
{
z=z.substring(0,z.lastIndexOf(ch))+z.substring(z.lastIndexOf(ch)+1);
}
f=z;
i++;
}
System.out.println("Final Word = "+f);
}
}


