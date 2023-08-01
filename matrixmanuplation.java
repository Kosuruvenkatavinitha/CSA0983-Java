import java.util.*;
class matrixmanuplation
{
public static void main(String args[]){
Scanner S= new Scanner(System.in);
int[][] a=new int[3][3];
int[][] b=new int[3][3];
int[][] c=new int[3][3];
System.out.print("Enter values for matrix A: ");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
a[i][j]=S.nextInt();
}}
System.out.print("Enter values for matrix B: ");
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
b[i][j]=S.nextInt();
}}
System.out.print("Enter\n 1-Addition\n 2-Subtraction\n 3-Multiplication\n 4-Transpose\n 5-Sum of diagonal elements: ");
int n=S.nextInt();
switch(n){
case 1:
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]+b[i][j]+" ");}}
break;
case 2:
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[i][j]-b[i][j]+" ");}}
break;
case 3:
int sum=0;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
for(int k=0;k<3;k++){
sum=sum+a[i][k]*b[k][j];}
c[i][j]=sum;
sum=0;}}
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(c[i][j]);}}
break;
case 4:
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
System.out.print(a[j][i]+" ");}}
break;
case 5:
int s=0;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
if (i==j){
s=s+a[i][j];}}}
System.out.print(s);
break;
default:
System.out.print("Enter valid input");
break;}
}}








