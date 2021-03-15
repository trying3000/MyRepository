package semes5;
import java.util.*;
public class Excercises {

	public static void main(String[] args) {
		int max = 0;
		int count=0;
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter numbers: ");
		do{
			num = input.nextInt();
			if(num>max) {
				max = num;
				count = 0;
			}
			if (num==max) {
				count++;
			}
		}while(num!=0);
			System.out.println("Largest number is: "+ max);
			System.out.print("Occurance: "+ count);
		
	}
}
		
