import java.util.*;
class perfnum{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int x=S.nextInt();
int sum=0;
for (int i=1;i<x;i++){
if(x%i==0){
sum+=i;}}
if(x==sum){
System.out.println("Perfect number");
}
else{
System.out.println("Not Perfect number");
}
}}