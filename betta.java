import java.util.Scanner;
class betta
{
 public static void main(String[] args)
 {
 Scanner s= new Scanner(System.in);
 System.out.print("Enter any Character: ");
 char ch=s.next().charAt(0);
 int l=0,u=0,num=0;
 while (ch!='*')
 {
 if(ch>='A'&&ch<='Z')
 l++;
 if(ch>='a'&&ch<='z')
 u++;
 if(Character.isDigit(ch))
 num++;
 System.out.print("Enter any Character: ");
 ch=s.next().charAt(0);
 }
 System.out.println("Total count of lower case: "+u);
 System.out.println("Total count of upper case: "+l);
 System.out.println("Total count of numbers: "+num);

 }
 }
