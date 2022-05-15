import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<arr.length;i++) {
        arr[i] = sc.nextInt();
    }
    int ele = sc.nextInt();
    
    int i =0;
    int j=n-1;
    boolean flag = true;
    while(i<=j) {
        int mid = (i+j)/2;
        if(arr[mid] == ele) {
            System.out.println(arr[mid]);
            flag = false;
            break;
        }else if(arr[mid] > ele) {
            j = mid-1;
        }else {
            i = mid+1;
        }
    }
    if(flag)
        System.out.print(arr[i]+"\n"+arr[j]);
 }

}
