import java.util.*;
class bank_{
double balance;
public bank_(double initial){
balance=initial;}
public void add(double amount) {
balance += amount;}
public void withdraw(double amount) {
balance -= amount;}
public void curbalance(double amount) {
return balance;}
}
class bank{
public static void main(String args[]){
bank_ n1=new bank_(1000);
  