package problem04;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		int num = (int) ((Math.random()+0.01)*1000);
		System.out.println(num);
		
		int hun = num/100;
		int ten = num/10 - hun*10;
		int one = num - hun*100 - ten*10;
		
		int[] arr = new int[3];
		arr[0] = hun;
		arr[1] = ten;
		arr[2] = one;
		
		System.out.println(hun);
		System.out.println(ten);
		System.out.println(one);
		
		Scanner sc = new Scanner(System.in);
		int ip = sc.nextInt();
		
		int ipHun = num/100;
		int ipTen = num/10 - hun*10;
		int ipOne = num - hun*100 - ten*10;
		
		int[] arr2 = new int[3];
		arr2[0] = ipHun;
		arr2[1] = ipTen;
		arr2[2] = ipOne;
		
		int N = 0;
		N = N+1;
		
		int S=0, B=0, O=0;
		
		for(int i=0; i<3; i++) {
			if(arr[i] == arr2[i]) {
				S = S+1;
			}
			for(int j=0; j<3; j++) {
				if(arr[i] == arr2[j]) {
					B = B+1;
				}
			}
		}
		
		if(S==3) {
			System.out.println("종료");
		}
		
		System.out.println(N + " - S:");
	}
}