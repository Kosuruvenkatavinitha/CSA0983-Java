import java.util.*;
class SI{
public static void main(String args[])
{float p,n,r;
char a;

Scanner S=new Scanner(System.in);
p=S.nextFloat();
n=S.nextFloat();
System.out.println("Senior CItizen(y/n):");
a=S.next().charAt(0);
if(a=='y'){
System.out.println(p*n*0.1/100);
}
else{
System.out.println(p*n*0.12/100);
}

}}