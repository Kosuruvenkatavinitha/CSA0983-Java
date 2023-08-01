import java.util.*;
class sumoddloop{
public static void main(String args[])
{ 
int i=1,n,s=0;
Scanner S=new Scanner(System.in);
n=S.nextInt();
do{
if(i%2!=0){
s+=i;}
i++;
}while(i<=n);
System.out.println(s);
}} 