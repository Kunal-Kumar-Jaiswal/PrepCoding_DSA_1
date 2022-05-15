import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc= new Scanner(System.in);
    int a1 = sc.nextInt();
    int[] n1 = new int[a1];
    for(int i=0;i<a1;i++) {
        n1[i] = sc.nextInt();
    }
    
    int a2 = sc.nextInt();
    int[] n2= new int[a2];
    for(int i=0;i<a2;i++) {
        n2[i] = sc.nextInt();
    }
    
    if(a2 > a1) {
        int[] temp = n1;
        n1 = n2;
        n2 = temp;
    }
    
    int i=n1.length-1;
    int j= n2.length-1;
    int carry = 0;
    int[] sum = new int[n1.length];
    int k=n1.length-1;
    while(i>=0 && j>=0) {
        int temp = n1[i--] + n2[j--] + carry;
        carry = temp/10;
        temp = temp%10;
        sum[k--] = temp;
    }
    
    while(i>=0) {
        int temp = n1[i--] + carry;
        carry = temp/10;
        temp = temp%10;
        sum[k--] = temp;
    }
    
    if(carry != 0) {
        System.out.println(carry);
    }
    
    for(i=0;i<sum.length;i++) {
        System.out.println(sum[i]);
    }
 }

}
