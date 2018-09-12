class mainclass
{
public static void main(String[ ] args)
{
String str="Vidur and Mannat";
int len=str.length();
char[ ]ctr=new char[len];
ctr=str.toCharArray();
for(int i=0;i<len;i++)
{
if(ctr[i]=='a'||ctr[i]=='e'||ctr[i]=='i'||ctr[i]=='o'||ctr[i]=='u')
{
ctr[i]=' ';
}
}
System.out.println("result  is");
for(int i=0;i<len;i++)
{
System.out.print(ctr[i]);
}
}
}