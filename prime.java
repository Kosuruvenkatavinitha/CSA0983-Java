import java.util.*;
class prime{
public static void main(String args[])
{
int i,j=0;
for(i=100;i<=900;i++){
if(i%1==0 && i%i==0){
System.out.print(i+" ");
j++;}}
System.out.println("\ncount"+j);
}}