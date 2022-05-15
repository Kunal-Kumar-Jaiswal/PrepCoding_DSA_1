import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int min=Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            int temp = sc.nextInt();
            if(temp > max) {
                max = temp;
            }
            if(temp < min) {
                min =temp;
            }
        }
    
    System.out.print(max - min);
 }

}
