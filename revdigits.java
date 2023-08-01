import java.util.*;
class revdigits{
public static void main(String args[])
{ 
int i,n,s=0;
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(n!=0){
i=n%10;
s=s*10+i;
n/=10;
}
System.out.println(s);
}}