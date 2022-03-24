import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     
     int temp = n;
     
     //finding number of digits
     int len = 0;
     while(temp!=0) {
         temp /= 10;
         len++;
     }
     
     //if rotate number is greater than number of digits
     k %= len;
     
     //if rotate number is negative
     if(k<0) {
         k += len;
     }
     
     int div = 1;
     int mult = 1;
     for(int i=1;i<=len;i++) {
         if(i<=k) {
             div *= 10;
         }else {
             mult *= 10;
         }
     }
     
     int rem = n % div;
     n = n / div;
     int result = rem * mult + n;
     
     System.out.print(result);
    }
   }
