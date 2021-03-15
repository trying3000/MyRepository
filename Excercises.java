package semes5;
import java.util.*;
public class Excercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer from 1-15: ");
		int n = input.nextInt();
		
		for(int i = 1; i<=n ; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+ "  ");
			}
			System.out.println();
		}
	}
}
		
