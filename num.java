import java.util.*;
class num{
public static void main(String args[]){
int a = 1000;
Scanner S=new Scanner(System.in);
int i=0;
int[] a= new int[];
for(i=0;i<100;i++){
a[i]=S.nextInt();
if(a[i]==-1){
break;}
}
int p=0;
int n=0;
for(int j=0;j<=100;j++){
if(a[j]>0){
p=p+a[j];}
else{
n=n+a[j];}}
System.out.println("positive sum:"+p);
System.out.println("negative sum:"+n);
}}

