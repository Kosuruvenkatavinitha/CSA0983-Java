import java.util.*;
class empsal{
public static void main(String args[]){
float bonus;
Scanner S=new Scanner(System.in);
System.out.println("Enter ur grade");
char g=S.next().charAt(0);
System.out.println("Enter ur salary");
int s=S.nextInt();
switch(g){
case 'A':
bonus=s*(5/100);
break;
case 'B':
bonus=s*(10/100);
break;
default:
System.out.println("Enter valid input");
break;
}
if (s<10000){
System.out.println("bonus:"+(bonus+s*(2/100)));}
else{
System.out.println("bonus:"+bonus);}}}






