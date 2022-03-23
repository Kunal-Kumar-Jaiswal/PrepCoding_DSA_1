import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i=low;i<=high;i++) {
            int n=2;
            boolean flag = true;
            while(n*n<=i) {
                if(i%n==0) {
                    flag = false;
                    break;
                }
                n++;
            }
            if(flag) {
                System.out.println(i);
            }
        }
    }
}
