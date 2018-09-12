class mainclass
{
public static void main(String[ ] args)
{
String str="Mannat Gupta";
int len=str.length();
char[ ] ctr=str.toCharArray();
int i=0;
System.out.println("substrings are ");
while(i<len)
{
System.out.println(str.charAt(i));
i++;
}
for(i=0;i<len;i++)
{
for(int j=0;j<len;j++)
{
System.out.print(str.charAt(i));
System.out.println(str.charAt(i));
}
}
System.out.println(str.substring(0,len));

}
}
