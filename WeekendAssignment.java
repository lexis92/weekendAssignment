package org.amalitech.javarecap;

import java.util.Scanner;

public class WeekendAssignment {
	
	public static void main(String [] args){
		
		//Initialize start and end variables
		String code_trigger_starter_str = "start";
		String code_trigger_ender_str = "end";
		
		// receive start input in string kybd_input_str
		Scanner kybd_inpt = new Scanner(System.in);
		String kybd_input_str = kybd_inpt.nextLine();
		
		
		//using do-while loop to run the method continuously
		do {
		re_run_word_input(code_trigger_starter_str,code_trigger_ender_str);
		}
		while (true);
	
			
		}

	//create a new method to receive new words input and output the new word
	private static void re_run_word_input(String code_trigger_starter_str,String code_trigger_ender_str) {

		//Tell user to input a word
		System.out.println("Enter a word");
		Scanner kybd = new Scanner(System.in);
		String kybd_new_word = kybd.nextLine();
		
		//set condition using if and else statements
			
			if(!kybd_new_word.equals(code_trigger_ender_str)) {
	    	System.out.println(kybd_new_word);
	    	}
			else {// if user inputs "end" code has to terminate
				if   (kybd_new_word.equals(code_trigger_ender_str)) {
	    		
	    		System.out.println("Program ended");
	    		System.exit(0);
	    		
	    		
	    		}
				
	    	}
			
			
	    }
}
		
		
		
	
	
		

		
		
	


