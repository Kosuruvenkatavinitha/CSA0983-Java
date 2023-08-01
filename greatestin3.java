import java.util.*;
class greatestin3
{
public static void main(String args[])
{
int x,y,z;
Scanner S=new Scanner(System.in);
x=S.nextInt();
y=S.nextInt();
z=S.nextInt();
if(x>y){
if(x>z){
System.out.println("x is greatest");}
else{
System.out.println("z is greatest");}}
else{
if(y>z){
System.out.println("y is greatest");}
else{
System.out.println("z is greatest");}}
}}