1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	
  
import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     int n = scn.nextInt();
     
     for(int i=1;i<=n;i++) {
        //  int val = 1;
         for(int j=1;j<=i;j++) {
             System.out.print(j+"\t");
         }
         
         for(int j=1;j<=2*(n-i)-1;j++) {
             System.out.print("\t");
         }
         
         if(i==n) {
             for(int j=i-1;j>=1;j--) {
             System.out.print(j+"\t");
            } 
         }else {
             for(int j=i;j>=1;j--) {
                 System.out.print(j+"\t");
             } 
         }
         System.out.println();
     }

 }
}
