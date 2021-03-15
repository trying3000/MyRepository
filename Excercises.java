package semes5;
import java.util.*;
public class Excercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter First integer: ");
		int n1 = input.nextInt();
		
		System.out.print("Enter Second integer: ");
		int n2 = input.nextInt();
		
		//minimum of the two integers
		
		if(n2<n1) {
			int temp = n2;
			n2 = n1;
			n1 = temp;
		}
		//finding GCD
		for (int d = n1; true; d--) {
			if(n1%d==0 && n2%d==0) {
				System.out.print("GCD is: "+ d);
				break;
			}
			
		}
	}
}
