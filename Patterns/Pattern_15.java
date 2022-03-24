		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	
      
      
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int space = n/2;
        int num = 1;
        int k=1;
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=space;j++) {
                System.out.print("\t");
            }
            
            int val = k;
            for(int j=1;j<=num;j++) {
                System.out.print(val+"\t");
                if(j<=num/2) {
                    val++;
                }else {
                    val--;
                }
                
            }
            
            if(i <= n/2) {
                space--;
                num += 2;
                k++;
            }else {
                space++;
                num -= 2;
                k--;
            }
            System.out.println();
        }

    }
}
