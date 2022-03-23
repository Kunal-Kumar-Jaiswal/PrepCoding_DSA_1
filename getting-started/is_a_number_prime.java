import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
       int t = sc.nextInt();
       while(t!=0) {
           int n = sc.nextInt();
           int i = 2;
           boolean flag = true;
           while(i<=n/2) {
               if(n%i==0) {
                   flag = false;
                   System.out.println("not prime");
                   break;
               }
               i++;
           }
           if(flag) {
               System.out.println("prime");
           }
           t--;
       }
  
   }
  }
