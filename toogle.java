import java.util.*;
class Toggle{
             static Scanner sc=new Scanner(System.in);
              public static void main(String args[]){
                    String x=sc.nextLine();
                    char a[]=x.toCharArray();

                    for(int i=0;i<a.length;i++){
                     if(Character.isUpperCase(a[i])){
                        a[i]=Character.toLowerCase(a[i]);
                     }
                     else
                       a[i]=Character.toUpperCase(a[i]);
                     }


                 String y=new String(a);

                 System.out.println(y);
               }
}
