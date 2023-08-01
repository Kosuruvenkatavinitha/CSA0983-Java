import java.util.*;
class pattern9 
{
public static void main(String args[]){
int i,j,n=0;
for (i = 1; i <= 4; i++) {
n=n*10+9;
for (j = 1; j <= i; j++) {
System.out.print( n+ " ");
}
System.out.println();
}}}