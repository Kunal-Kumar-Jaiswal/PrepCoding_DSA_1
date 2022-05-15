//     1. You are given a number n, representing the size of array a.
//     2. You are given n numbers, representing elements of array a.
//     3. You are given a number k.
//     4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.


import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    // write your code here
    int len = a.length;
    int[] arr = null;
    if(k > 0) {
        k %= len;
        arr = new int[len-k];
    }else {
        k = -k;
        k %= len;
        arr = new int[k];
    }
    
    int i=0;
    int j=0;
    while(i<arr.length) {
        arr[i] = a[j];
        i++;
        j++;
    }
    i=0;
    while(j<len) {
        a[i] = a[j];
        i++;
        j++;
    }
    
    j=0;
    while(j<arr.length) {
        a[i] = arr[j];
        i++;
        j++;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
