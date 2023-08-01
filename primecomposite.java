import java.util.*;
class primecomposite{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int size;
System.out.println("Enter size of array: ");
size=S.nextInt();
int[] x=new int[size];
for(int i=0;i<size;i++){
x[i]=S.nextInt();
}
int countp=0,p=0;
int countc=0;
for(int i=0;i<size;i++){
p=0;
for(int j=2;j<x[i];j++){
if(x[i]%j==0){
p+=1;
}
}
if(p==0)
{
countp++;
}
else
{
countc++;
}
}
System.out.println("count of prime numbers:"+countp);
System.out.println("count of composite numbers:"+countc);
}}