import java.util.*;

public class Main{

public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
    
      int i=1;
      int res = 0;
      while(n!=0) {
          res += (i++)*Math.pow(10,n%10-1);
          n/=10;
      }
      System.out.print(res);
 }
}
