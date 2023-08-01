import java.util.*;
class st_report
{
public static void main(String args[]){
Scanner S= new Scanner(System.in);
System.out.print("Name:");
String name=S.nextLine();
System.out.print("Reg.No. :");
int reg=S.nextInt();
float[] a=new float[5];
System.out.println("Enter 5 sub marks");
for(int i=0;i<5;i++){
a[i]=S.nextFloat();
}
int b=0;
float s=0,avg;
for(int i=0;i<5;i++){
if(a[i]>50){
b+=1;
}}
if(b==5){
for(int i=0;i<5;i++){
s=(float)(s+a[i]);
}
avg=s/5;
System.out.println("Average:"+avg);}
else{
System.out.println("Failed");}

}}