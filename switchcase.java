import java.util.*;
class switchcase{
public static void main(String args[])
{
float a,b;
int x;
Scanner S=new Scanner(System.in);
a=S.nextFloat();
b=S.nextFloat();
System.out.println("Enter 1-Addition\n 2-Subtraction\n 3- Multiplication\n 4-Division\n 5- Modulus");
x=S.nextInt();
switch(x)
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
case 5:
System.out.println(a%b);
break;
default:
System.out.println("Invalid input");
}}}