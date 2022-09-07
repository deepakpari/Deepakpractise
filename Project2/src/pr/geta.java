package pr;

import java.util.Scanner;



public class geta {
	
	public static void main(String[] args){
		
		float numobtained;
		float total;
		float precentage;
		
		Scanner u = new Scanner(System.in);
		System.out.print("Enter the number obaiibed");
		
		 numobtained= u.nextFloat();
		
		 System.out.print("Enter the total");
		 total =u.nextFloat();
		 
		  precentage= (numobtained/total*100);
		  
		  System.out.print("Final percenatge "  + precentage);
			 
	}

}
