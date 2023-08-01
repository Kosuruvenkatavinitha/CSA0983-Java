import java.util.*;
class staff{
public void display(){
System.out.print("code");
System.out.println("Name");}}
class teacher extends staff{
public void display1(){
System.out.print("subject");
System.out.println("publication");}}
class typist extends staff{
public void display2(){
System.out.println("Speed");}}
class officer extends staff{
public void display3(){
System.out.println("grade");}}
class regular extends typist{
public void display4(){
System.out.println("Salary");}}
class casual extends typist{
public void display5(){
System.out.println("daily wages");}}
class Stafff{
public static void main(String args[]){
regular R=new regular();
R.display4();
R.display2();
}}

 