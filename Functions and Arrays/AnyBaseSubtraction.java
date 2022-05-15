import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getDifference(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getDifference(int b, int n1, int n2){
       // write your code here
       if(n2 > n1) {
           int temp = n1;
           n1 = n2;
           n2 = temp;
       }
       int carry = 0;
       int result = 0;
       int p=1;
       while(n1 != 0 || n2 !=0 ) {
           int temp = n1%10 - n2%10 - carry;
           if(temp < 0) {
               carry = 1;
               temp += b;
           }else {
               carry = 0;
           }
           result += temp*p;
           p *= 10;
           
           n1 /=10;
           n2 /=10;
       }
       return result;
   }
  
  }
