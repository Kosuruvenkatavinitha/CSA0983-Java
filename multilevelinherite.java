import java.util.*;
class a{
int x=10;
public void display(){
System.out.println(+x);}}
class b extends a{
int y=5;
public void display1(){
System.out.println(+y);}}
class c extends b{
int z=0;
public void display2(){
System.out.println(+z);}}
class multilevelinherite{
public static void main(String args[]){
c C=new c();
C.display2();
C.display1();
C.display();
}} 


