import java.util.*;
class p{
int x=10;
public void display(){
System.out.println(+x);}}
class c1 extends p{
int y=5;
public void display1(){
System.out.println(+y);}}
class c2 extends p{
int z=0;
public void display2(){
System.out.println(+z);}}
class c3 extends p{
int zz=345;
public void display3(){
System.out.println(+zz);}}
class hieracalinherite{
public static void main(String args[]){
c3 C=new c3();
C.display3();
C.display();
c2 CC=new c2();
CC.display2();
CC.display();
c1 CCC=new c1();
CCC.display1();
CCC.display();
}} 


