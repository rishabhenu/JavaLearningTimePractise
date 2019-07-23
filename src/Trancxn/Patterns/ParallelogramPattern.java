package Trancxn.Patterns;

/**
 * 
 * @author Rishabh Sharma
 * 
 * @desc print a pattern like this
 * 					@
 * 				@		@
 * 			@		@		@
 * 				@		@
 * 					@
 *
 */

public class ParallelogramPattern {

	public static void main(String... strings) {
		int n = 4;
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k <= n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=n-i;j>0;j--) {
				System.out.print("@ ");
			}
			System.out.println();
		}

	}

}
