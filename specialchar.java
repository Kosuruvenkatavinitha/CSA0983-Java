import java.util.*;
class specialchar{

public static void main(String[] args) {
String a;
 int i, alph, digi, spl;
alph =  0;
d =0;
spl =0;
char ch;
Scanner sc= new Scanner(System.in);
System.out.print("Enter input=  ");
a = sc.nextLine();
for(i = 0; i < a.length(); i++){
  ch = a.charAt(i);
if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
alph++;
 }
else if(ch >= '0' && ch <= '9') {
d++;
}
else {
System.out.println(ch);
spl++;
} }
System.out.println("Number of Special Characters   =  " + spl);
    }
}
