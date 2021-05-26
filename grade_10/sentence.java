public class sentence
{
public static void main(String s)
{
String p="";
s=" "+s+" ";
char ch=' ',chv=' ';
for(int i=0;i<s.length()-1;i++)
{
ch=s.charAt(i);
chv=s.charAt(i+1);
if(ch!=' ')
p=p+ch;
else if(ch==' ')
{
if(chv=='a'||chv=='e'||chv=='i'||chv=='o'||chv=='u')
{
p=p+" an ";
}
else
p=p+" ";
}

}
System.out.println(p);
}
}