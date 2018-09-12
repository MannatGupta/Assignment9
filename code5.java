class mainclass
{
public static void main(String[ ] args)
{
String str="Heart wants what it wants";
int len=str.length();

int s=0,w=0;
for(int i=0;i<len;i++)
{
if(str.charAt(i)==' ')
{
s++;
}
}
w=s+1;
System.out.println("count of words is "+w);
}
}