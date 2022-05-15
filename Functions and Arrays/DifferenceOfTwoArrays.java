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
    int barrow = 0;
    int[] diff = new int[n1.length];
    int k=n1.length-1;
    
    while(k>=0) {
        int temp = n1[i] - barrow;
        if(j>=0) {
            temp -= n2[j];
        }
        
        if(temp < 0) {
            temp += 10;
            barrow = 1;
        }else {
            barrow = 0;
        }
        
        diff[k] = temp;
        i--;
        j--;
        k--;
    }
    i=0;
    while(i<diff.length) {
        if(diff[i] == 0)
           i++;
        else 
            break;
    }
    
    while(i<diff.length) {
         System.out.println(diff[i]);
         i++;
    }
 }

}
