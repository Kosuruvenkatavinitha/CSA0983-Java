import java.util.*;
class elebill
{
public static void main(String args[]){
Scanner S= new Scanner(System.in);
System.out.print("C.Name:");
String name=S.nextLine();
System.out.print("C.No. :");
int No_=S.nextInt();
System.out.print("Enter CMR:");
int cmr=S.nextInt();
System.out.print("Enter LMR:");
int lmr=S.nextInt();
int units=cmr-lmr;
System.out.print("Industry/Domestic(I/D):");
char x=S.next().charAt(0);
switch(x){
case 'I':
if (units<=100){
System.out.print("Rs 0");
}
else if(units>100 && units<=200){
System.out.print("Rs 1.25");
}
else if(units>200 && units<=300){
System.out.print("Rs 1.25");
}
else if(units>300 && units<=500){
System.out.print("Rs 1.25");
}
else{
System.out.print("Rs 5.40");
}
break;
case 'D':
if (units<=100){
System.out.print("Rs 0");
}
else if(units>100 && units<=200){
System.out.print("Rs 1");
}
else if(units>200 && units<=300){
System.out.print("Rs 2");
}
else if(units>300 && units<=500){
System.out.print("Rs 3.50");
}
else{
System.out.print("Rs 5");
}
break;
default:
System.out.print("");
break;
}}}




