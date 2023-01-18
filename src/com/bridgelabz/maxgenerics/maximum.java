package com.bridgelabz.maxgenerics;
import java.util.*;

public class maximum {

	Scanner sc = new Scanner (System.in);
	void max_Int() {
		
		System.out.println(" INT number: ");
		
        System.out.println(" Enter the first number: ");
        int n1 = sc.nextInt();
        
        System.out.println(" Enter the second number: ");
        int n2 = sc.nextInt();
        
        System.out.println(" Enter the third number: ");
        int n3 = sc.nextInt();
        

        if(n1 > n2 && n1 > n3){
        	System.out.println(" ");
            System.out.println( n1 + " is the greatest");
        }
        else if( n2 > n3)
        {
        	System.out.println(" ");
        	System.out.println( n2 + " is the greatest");
        }
        else
        {
        	System.out.println(" ");
        	System.out.println( n3 + " is the greatest");
        }


	}
	
	void max_Flaot() {
		
		System.out.println(" ");
		System.out.println(" Flaot numbers ");
		System.out.println(" ");
		
        System.out.println(" Enter the first number: ");
        float n1 = sc.nextFloat();
        
        System.out.println(" Enter the second number: ");
        float n2 = sc.nextFloat();
        
        System.out.println(" Enter the third number: ");
        float n3 = sc.nextFloat();
        

        if(n1 > n2 && n1 > n3){
        	System.out.println(" ");
            System.out.println( n1 + " is the greatest");
        }
        else if( n2 > n3)
        {
        	System.out.println(" ");
        	System.out.println( n2 + " is the greatest");
        }
        else
        {
        	System.out.println(" ");
        	System.out.println( n3 + " is the greatest");
        }


	}
    
	public static void main(String[] args) {
    	
        maximum max = new maximum();
        
        max.max_Int();
        max.max_Flaot();
    }
}
