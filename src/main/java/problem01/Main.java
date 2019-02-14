package problem01;

public class Main {

	public static void main(String[] args) {
		for( int i = 1; i <= 100; i++ ) {
			int count = countClap(i);

			if( count == 0 ) {
				continue;
			}
			
			System.out.print( i + " " );
			
			for( int j = 0; j < count; j++ ) {
				System.out.print( "짝" );
			}
			
			System.out.println( "" );			
		}
	}
	
	public static int countClap(int number) {
		
		if(number<10) {
			if(number%3==0) {
				System.out.println(number + " 짝");
			}
		} else {
			int ten = number/10; //십의 자리
			int one = number%10; //일의 자리
			
			if(ten%3==0 && one%3==0 && one!=0) {
				System.out.println(number + " 짝짝");
			} else {
				if(ten%3==0 || one%3==0 && one!=0) {
					System.out.println(number + " 짝");
				}
			}
		}
		
		return 0;
	}
}