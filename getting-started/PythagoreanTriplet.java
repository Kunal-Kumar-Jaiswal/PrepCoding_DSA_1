import java.util.Scanner;
public class PythagoreanTriplet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		int max = Math.max(a, Math.max(b, c));
		int left = 0;
		if(a == max) {
			left = b*b + c*c;
		}else if(b == max) {
			left = a*a + c*c;
		}else {
			left = a*a + b*b;
		}
		
		if(left == max*max) {
			System.out.println("Triplet");
		}else {
			System.out.println("Not Triplet");
		}
	}

}
