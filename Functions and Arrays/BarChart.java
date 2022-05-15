import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int[] arr = new int[n];
    int max = -1;
    for(int i=0;i<n;i++) {
        arr[i] = sc.nextInt();
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    
    
    for(int i=max-1;i>=0;i--) {
        for(int j=0;j<n;j++) {
            if(arr[j] > i) {
                System.out.print("*\t");
            }else {
                System.out.print("\t");
            }
        }
        System.out.println();
    }
 }

}
