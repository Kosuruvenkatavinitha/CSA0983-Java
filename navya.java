import java.util.*;
class sum1
{
int x,y;
void add()
{
Scanner s=new Scanner(System.in);
x=s.nextInt();
y=s.nextInt();
System.out.println("Sum:"+(x+y));
};
}
class navya
{
public static void main(String args[])
{
sum1 x=new sum1();
x.add();
}
}