import java.util.*;
class A{
public void display(){
System.out.println("Super class A");}}
class B extends A{
public void display1(){
System.out.println("class B");}}
interface D{
public void display2();}
class C extends B implements D{
public void display2(){
System.out.println("Interface D");}}
class ABCDinterface{
public static void main(String args[]){
C c=new C();
c.display1();
c.display2();
B cc=new B();
cc.display1();
cc.display();
}}

 