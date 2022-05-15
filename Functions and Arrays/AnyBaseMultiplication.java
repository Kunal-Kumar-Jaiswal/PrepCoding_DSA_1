import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     if(n2 > n1) {
         int temp = n1;
         n1 = n2;
         n2 = temp;
     }
     int result=0;
     int i=0;
     int p =1;
     while(n2 != 0) {
         int temp = product(b,n1, n2%10);
         //System.out.println(temp*p+" "+result);
         result = getSum(b,temp*p,result);
         p *= 10;
         n2 /= 10;
     }
     return result;
 }
 
 public static int product(int b,int n1,int n2) {
     int carry = 0;
       int result = 0;
       int i=0;
       while(n1 != 0 || carry !=0) {
           int temp = (n1%10*n2)+carry;
           result += (temp%b)*(int)Math.pow(10,i);
           carry = temp/b;
           n1 /= 10;
           i++;
       }
       
       return result;
 }
 
 public static int getSum(int b, int n1, int n2){
       // write ur code here
       int carry = 0;
       int result = 0;
       int i=0;
       while(n1 != 0 || n2 != 0 || carry !=0) {
           int temp = n1%10+n2%10+carry;
           result = (temp%b)*(int)Math.pow(10,i)+result;
           carry = temp/b;
           n1 /= 10;
           n2 /= 10;
           i++;
       }
       
       return result;
   }

}
