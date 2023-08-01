import java.util.*;
 class nthmax 
{
 public static void main(String[] args) 
{
 Scanner input = new Scanner(System.in);
 System.out.print("enter the size of the array:- ");
 int size = input.nextInt();
 int[] arr = new int[size];
 System.out.println("enter the values in the array:- ");
 for(int i=0;i<size;i++){
 arr[i] = input.nextInt();
 }
int temp=0;
 for(int i=0;i<size;i++){
for(int j=i+1;j<size;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}}}
 System.out.print("enter the Mth largest number:- ");
 int m = input.nextInt();
 
 if(m<=0)
 System.out.println("please enter the valid input");
 else{
 max = arr[arr.length-m];
 System.out.println("the largest number is "+max);
}
 }
