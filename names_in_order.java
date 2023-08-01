import java.util.*;
class names_in_order{
public static void main(String args[]){
Scanner S=new Scanner(System.in);
int n=S.nextInt();
String names[];
names = new String[n];
for(int k = 0;k<n;k++){
names[k] =S.nextLine();
}
for(int i = 0 ;i<n;i++){
for(int j = i+1 ; j<n;j++){
if(names[i].compareTo(names[j]) > 0){
String temp = names[i];
names[i] = names[j];
names[j] = temp;
}
for(int l= 0;l<n;l++){
System.out.println(names[l]);
}}
}}}