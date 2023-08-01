import java.util.*;
class sumevenloop{
public static void main(String args[])
{
int i=1,n,s=0;
Scanner S=new Scanner(System.in);
n=S.nextInt();
while(i<=n){
if(i%2==0){
s+=i;}
i++;
}
System.out.println(s);
}}