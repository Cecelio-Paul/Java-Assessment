package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") ==> "TTThhheee"
	// multChar("AAbb") ==> "AAAAAAbbbbbb"
	// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		String word = "";
		for (int i = 0; i< input.length(); i++) {
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
			word += input.substring(i, i+1);
		}
		return word;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") ==> "evilc"
	// getBert("xxbertfridgebertyy") ==> "egdirf"
	// getBert("xxBertfridgebERtyy") ==> "egdirf"
	// getBert("xxbertyy") ==> ""
	// getBert("xxbeRTyy") ==> ""

	public String getBert(String input) {
		String reversed = "";
		
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i+1).equals("bert")) {
				return 
			}
		}
		
		
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) ==> true
	// evenlySpaced(4, 6, 2) ==> true
	// evenlySpaced(4, 6, 3) ==> false
	// evenlySpaced(4, 60, 9) ==> false

	public boolean evenlySpaced(int a, int b, int c) {
		
		int maxNumber;
		int middleNumber;
		int smallNumber;
		
		if (a>b && a>c) {
			maxNumber = a;
			
		} else {
			
		if (b>a && b>c) {
			
			maxNumber = b;
			
		} else {
			
		if (c>a && c>b) {
			
			maxNumber = c;
			
		} else {
			
		if (a<b && a>c ) {
			
			middleNumber = a;
			
		} else {
			
		if (b<a && b>c) {
			
			middleNumber = b;
			
		} else {
			
		if (c<a && c>b) {
			
			middleNumber = c;
			
		} else {
			
		if (a<b && a<c) {
			
			smallNumber = a;
			
		} else {
			
		if (b<a && b<c) {
			
			smallNumber = b;
			
		} else {
			
		if (c<a && c<b) {
			
			smallNumber = c;
			
		}
			
		}
		
		}
			
		}
			
		}
		}
			
		}
		
		}
			
		}

		
		return true;
		
		
		
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) ==> "Ho"
	// nMid("Chocolate", 3) ==> "Choate"
	// nMid("Chocolate", 1) ==> "Choclate"

	public String nMid(String input, int a) {
		
		String output = "";
		
		for (int i = 0; i < input.length() + input.length()/2 - (a/2); i++) {
			output = output + input.substring(i, i+1);
		}
		
		
		
		
		return "";
	}


	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") ==> 2
	// superBlock("abbCCCddDDDeeEEE") ==> 3
	// superBlock("") ==> 0

	public int superBlock(String input) {
		
		String characters = "";
		int blockLength;
	
		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i+1).equals())
			
		}
		
		return -1;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") ==> 1
	//amISearch("I am in Amsterdam am I?") ==> 2
	//amISearch("I have been in Amsterdam") ==> 0

	public int amISearch(String arg1) {
		
		int numberOfAms = 0;
		
		for (int i = 0; i < arg1.length(); i++) {
			if (arg1.substring(i, i+1).contains("am")) {
				
				
			}
			
		}
		
		
		
		return -1;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) ==> "fizz"
	//fizzBuzz(10) ==> "buzz"
	//fizzBuzz(15) ==> "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		int fizz = 3;
		int buzz = 5;
		
		
		
		
		
		
		return fizzBuzz(100);
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") ==> 14
	//largest("15 72 80 164") ==> 11
	//largest("555 72 86 45 10") ==> 15
	
	public int largest(String arg1) {
		return -1;
	}
}
