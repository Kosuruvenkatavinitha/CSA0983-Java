import java.util.*;
class tax{
public static void main(String args[])
{int x;
Scanner S=new Scanner(System.in);
x=S.nextInt();
if(x<=150000){
System.out.println("No Tax for the employee :");
}
else if(x>=150000||x<300000){
System.out.println("The Tax for the employee :"+(x*0.05));
}
else if(x>=300000||x<500000){
System.out.println("The Tax for the employee :"+(x*0.1));
}
else if(x>=500000||x<1500000){
System.out.println("The Tax for the employee :"+(x*0.12));
}
else{
System.out.println("The Tax for the employee :"+(x*0.2));
}}}