import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
    }
    
    int powSet = (int)Math.pow(2,n);
    
    for(int i=0;i<powSet;i++) {
        for(int j=n-1;j>=0;j--) {
            if((i&(1<<j)) != 0) {
                System.out.print(arr[n-j-1]+"\t");
            }else {
                System.out.print("-\t");
            }
        }
        System.out.println();
    }
 }

}
