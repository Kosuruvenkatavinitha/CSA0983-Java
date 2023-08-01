import java.util.*;
class octal
{
 public static void main(String[] args)
 {
 int num;
 
 Scanner S= new Scanner(System.in);
 System.out.println("Decimal Number: ");
num=S.nextInt();
int rem=0;
int div=0;
rem=num%8;
div=num/8;
 System.out.println("octal");

 System.out.println(div+""+rem);

int r=0;
int d=0;
r=num%2;
d=num/2;
 System.out.println("binary");

 System.out.println(d+""+r);
}}