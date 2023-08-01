import java.util.*;
class A{
public void display(){
System.out.println("super class");}}
interface B{
public void display1();}
class C extends A implements B{
public void display1(){
System.out.println("Interface");}}
class mp{
public static void main(String args[]){
C c=new C();
c.display1();
c.display();
}}

