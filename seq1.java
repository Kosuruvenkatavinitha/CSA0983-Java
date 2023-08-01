import java.util.*;
class seq1{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int n=S.nextInt();
float s=0,t=0;
int f=1;
for(int i=1;i<=n;i++){
if(i%2==0){
for(int k=1;k<=n;k++){
f=f*i;
s=s-(i/f);
}}
else{
for(int k=1;k<=n;k++){
f=f*i;
t=t+(i/f);
}
}}
t=t+s;
System.out.println(t);
}}















