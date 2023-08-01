import java.util.*;
class sortusingobj {
public static void main(String args[]){
int[] a= new int[] {21,1,23,43,56,890};
int index = -1;
for(int i=0 ;i < a.length ; i++)
{
index =i;
for(int j=i; j <= a.length-1;j++)
{
 if(a[j] < a[index])
{
index = j;
}
}
int temp = a[i];
a[i] = a[index];
a[index] = temp;
}
for(int i =0 ; i< a.length ; i++)
{
System.out.print(a[i]+" ,");
}
System.out.print("\nshortest number : "+a[0]);
}
}