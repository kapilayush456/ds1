import java.util.*;
import java.lang.*;
class highest{

               static Scanner sc=new Scanner(System.in);


               public static void main(String args[]){

                       String x=sc.nextLine();
                       char y[]=x.toCharArray();
                        int c[]=new int[y.length],max=-1,pos=0;


                        for(int i=0;i<y.length;i++){
                        for(int j=i+1;j<y.length;j++){
                                if(y[i]==y[j])
                                      c[i]+=1;
                                     }
                                     if(max<c[i]){
                                         max=c[i];
                                         pos=i;
                                       }
                        }


                      SYstem.out.println("Hightest occuring element is "+y[pos]);
         }
}
