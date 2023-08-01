import java.util.*;
class atm{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int a=S.nextInt();
int a1=S.nextInt();
int b=S.nextInt();
int b1=S.nextInt();
int c=S.nextInt();
int c1=S.nextInt();
int d=S.nextInt();
int d1=S.nextInt();
if(a==100||a==200||a==500||a==2000&&b==100||b==200||b==500||b==2000&&c==100||c==200||c==500||c==2000&&d==100||d==200||d==500||d==2000)
{
    int balance=a*a1+b*b1+c*c1+d*d1;
    System.out.println(balance);
}
else
{
      System.out.println("Enter the valid Denomination"); 
}
}}