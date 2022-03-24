import java.util.*;

public class Main{

public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  
  int i=2;
  while(i*i <= n) {
      if(n % i == 0) {
          System.out.print(i+" ");
          n /= i;
      }else {
          i++;
      }
  }
  
  if(n != 1) {
      System.out.print(n);
  }
 }
}