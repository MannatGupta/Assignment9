import java.util.Scanner;
class mainclass
{
public static void main(String[ ] args)
{
Scanner s=new Scanner(System.in);
String str=s.next();
int n=str.length();
char[] ctr=str.toCharArray();
for(int i=0;i<n/2;i++)
{
char temp;
temp=ctr[i];
ctr[i]=ctr[n-i-1];
ctr[n-i-1]=temp;
}
System.out.print("Reverse of string is:");
for(int i=0;i<n;i++)
{
System.out.print(ctr[i]);
}
}

}