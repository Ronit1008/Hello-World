package Pattern_Printing;

import java.util.Scanner;

public class Rombus_of_star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" "+" ");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
	}

}
