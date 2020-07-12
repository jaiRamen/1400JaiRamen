package ex11OneToN;

import java.util.Scanner;

public class JaiBreischEx11OneToN {

	public static void main(String[] args) {
		/********************************************************
		 *
		 *  Project :  Exercise 11: Output 1 to n 
		 *  File    :  JaiBreischEx11OneToN.java
		 *  Name    : JaiRam Breisch aka "Jai"
		 *  Date    :  3.12.20
		 *
		 *  Description :
		 *
		 *    1) The purpose of this program is to ask the use for an input 
		 *   	 from a user that is a positive integer, and have the program output
		 *   	 a list of all integers from 1 to their number (n).
		 *
		 *    2) This program is a great example of the "While Loop," 
		 *   	 and how you can generate lists easily using loops.
		 *
		 *    3) The main tools used are the java Scanner (in/out) 
		 *   	 as well as the System.out.print function.
		 *
		 *    4) The methods implemented here are a good way to output all the numbers between 
		 *    	1 and n in the most simple way possible.
		 *    
		 *  	  Note: 	 Using A loop here is critical! 
		 *  			There ARE...other ways to complete this program...
		 *  			SEE FOOTER FOR AN EXAMPLE OF A WRONG APPROACH
		 ********************************************************/
		
	//Remember to import the java.util.Scanner; utility between "package xyz" and "Public class xyz"
		
Scanner input = new Scanner(System.in);
			
		
		System.out.println("Please Enter a Positive Integer");
		int n, total;
		n  = input.nextInt();
		total = 0;

		while (total < n) {
			total = total + 1;
			//Now output a number to the list each time you run the loop. A total of n times//	
			System.out.println(total);;
		} 
		
		//At the end, (not required...you could flex your Sysout skills and do this//
		
		System.out.println("Those are all the numbers between 1 and " + n + "!");


		
			}
			


	}
	/* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 *		Ex: A Non Loop Version = A Bad Idea
	 *    // In this case the user entered their birthday 00.00.0000 == 12,312,019 is the max #.//
	 *  		
	 *  	int n, nlist;
	 *  
	 *  	n= 12312019;
	 *  	nlist=0;
	 *  
	 *  	nlist=(n-n)+1;
	 *  
	 *      System.out.println(nlist);     //PRINTS 1//
	 *      
	 *  	nlist=(n-n)+2;
	 *  
	 *   	System.out.println(nlist);    //PRINTS 2//
	 *   
	 *   	nlist=(n-n)+3;
	 *  	 System.out.println(nlist);   //PRINTS 3 AND ...
	 *                        "THERE MUST BE A BETTER WAY AHHHHH" + headExplodes"
	 *       
	 *    			SO, WITHOUT A LOOP,
	 *    the programmer would need to input two lines of code...around 40 keystrokes 
	 *    			for e v e r y  n u m b e r, up to 12+million!
	 *    or to a minimum of 1 million times if they were the oldest person alive (117yr).
	 *    OR even worse...they could choose a quantifiable infinite amount of numbers! 
	 *  BUT...With a loop, my Mac ran the code above, and printed 1-12,312,019 IN 20 SECONDS! 
	 *  			Over 2 million lines of code A SECOND if done *WITH* a loop.
	 *  			How Long wpuld it take you to write 25 million lines of code?
	 *  			I hope you never have to find that out
	 *  * * * * * * * * * * * * ** * * * * * * * * * * * ** * * * * * * * * * * * ** * * * * * * *  */     

