import static java.lang.System.out;
import java.util.*;
class Palindrom{
              static Scanner sc=new Scanner(System.in);
              public static void main(String args[]){
              String x=sc.nextLine(), reverse="";


              for(int i=x.length()-1;i>=0;i--){
                        reverse+=x.charAt(i);
              }
              out.println(reverse);

              if(reverse.equals(x))
              out.println("Palindrome");
               else
               out.println("Not palindrome");
            }
}
