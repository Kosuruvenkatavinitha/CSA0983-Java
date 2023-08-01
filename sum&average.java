import java.util.*;
class sumandaverage
{
public static void main(String args[])
{
int a,b=0,c;
Scanner S = new Scanner(System.in);
System.out.println("Enter five numbers");
for(i=0;i<5;i++){
a=S.nextInt();
b+=a;
}
c=b/5;
System.out.println(b);
System.out.println(c);
}}