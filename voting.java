import java.util.*;
class voting
{
public static void main(String args[])
{
int x,y;
Scanner S=new Scanner(System.in);
x=S.nextInt();
if(x>=18){
System.out.println("Eligible for voting");
}
else{
y=18-x;
System.out.println("Not Eligible for voting");
System.out.println("After"+y+"years you can vote");
}}}