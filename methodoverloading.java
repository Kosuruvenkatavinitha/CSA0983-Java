import java.util.*;
class method{
int area(final int x){
return x+x;}
float area(float y){
return y+y;}
float area(int x,float y){
return x+y;}
int area(int x,int y){
return y+y;}
}
class methodoverloading{
public static void main(String args[]){
method M=new method();
System.out.println(M.area(10));
System.out.println(M.area(4.5f));
System.out.println(M.area(15,7.8f));
System.out.println(M.area(3,27));
}}