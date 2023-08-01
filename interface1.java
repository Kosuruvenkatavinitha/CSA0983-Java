import java.util.*;
interface A{
public void display();}
interface B{
public void display1();}
class C implements A,B{
public void display(){
System.out.println("super class");}
public void display1(){
System.out.println("Interface");}}
class interface1{
public static void main(String args[]){
C c=new C();
c.display1();
c.display();
}}

