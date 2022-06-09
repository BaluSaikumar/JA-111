package com.Question_3;

public class VowelAndConsonant {
	
	void vowelOrConsonant(char alphabet) {
		
		String lower = "abcdefghijklmnopqrstuvwxyz";
		String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String alpha = Character.toString(alphabet);
		
		if(lower.contains(alpha)||upper.contains(alpha)) {
			
			if(alphabet=='a'||alphabet=='A'||alphabet=='e'||alphabet=='E'||alphabet=='i'||alphabet=='I'||alphabet=='o'||alphabet=='O'|| alphabet=='u'||alphabet=='U') {
				
				System.out.println("Vowel");
			}
			
			else {
				System.out.println("Consonant");
			}
			
		}
		
		else {
			System.out.println("Not an Alphabet");
		}
		
	}
	
	public static void main(String[] args) {
		
		VowelAndConsonant voc = new VowelAndConsonant();
		
		voc.vowelOrConsonant('a');
		voc.vowelOrConsonant('s');
		voc.vowelOrConsonant('@');
		
	}

}
