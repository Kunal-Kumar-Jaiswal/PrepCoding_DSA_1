import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      
      //finding GCD
      int temp1 = n1;
      int temp2 = n2;
      
      while(temp1 % temp2 != 0) {
          int temp = temp1 % temp2;
          temp1 = temp2;
          temp2 = temp;
      }
      
      System.out.println(temp2);
      
      //LCM
      int lcm = (n1 * n2)/temp2;    //beacuse temp2 is my gcd
      System.out.println(lcm);
     }
    }
