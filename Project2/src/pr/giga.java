package pr;

import java.util.Scanner;


public class giga {
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
		
		int n=s.nextInt();
		
		if(n%2==0){
			
			System.out.print("Number is even");
			
			}
		else {
			
			System.out.print("Number is odd");
			
		}
		

		Scanner g = new Scanner(System.in);
		System.out.print("Enter the number you want to check:");
		int h=g.nextInt();
		
		if(h>=80){
			
			System.out.print("Got A grade");
		}
		else if(h>80 && h>=60) {
			
			System.out.print("Got B grade");
			}
		
		else if(h>60 && h>=40) {
			
			System.out.print("Got C grade");
		}
		else {
			
			System.out.print("Got D grade");
		}
}

}