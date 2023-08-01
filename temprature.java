import java.util.*;
class temprature
{
public static void main(String args[])
{
double F,C;
Scanner S = new Scanner(System.in);
System.out.println("Enter temprature in F");
F=S.nextDouble();
C=((F-32)*5/9);
System.out.println(C);
}}
