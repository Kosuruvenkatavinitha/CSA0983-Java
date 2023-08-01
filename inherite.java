import java.util.*;
class p{
int x=10;
public void display(){
System.out.println(+x);}}
class c extends p{
int y=5;
public void display1(){
System.out.println(+y);}}
class inherite{
public static void main(String args[]){
c C=new c();
C.display1();
C.display();
}} 


