import java.util.*;
class binandoctal
{
 public static void main(String[] args)
 {
 int num;
 
 Scanner S= new Scanner(System.in);
 System.out.println("Decimal Number: ");
 num = Integer.parseInt(S.nextLine());
 
 
String binary =Integer.toBinaryString(num);
 System.out.println("Binary Number = " + binary);
 
 String octal =Integer.toOctalString(num);
 System.out.println("Octal = " + octal);
 }
}