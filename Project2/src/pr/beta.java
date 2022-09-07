package pr;

import java.util.Scanner;

public class beta {
	
	
	
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        int n = s.nextInt();
       
        
        if(n % 2 == 0) {
			
			System.out.println("no is even");
			
			
		}
		
		else {
			
			System.out.println("no is not odd");
		}
		
        
        Scanner y = new Scanner(System.in); 
        System.out.print("Enter the number you want to check:");
        int avg=y.nextInt();
        
        if(avg>= 80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }

        
        
	}

