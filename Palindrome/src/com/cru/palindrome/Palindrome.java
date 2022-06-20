package com.cru.palindrome;

public class Palindrome {

	public static void main(String[] args) {
		String words []= {"Hannah", "Texas", "Renner", "Eleele" };
		int count=0;
		for(int j=0;j<words.length;j++)
		{
		String length=words[j];
		String rev="";
		
		 for ( int i = words[j].length() - 1; i >= 0; i-- )
	         rev = rev + words[j].charAt(i);
		 
	     if (length.equalsIgnoreCase(rev))
		 {
			  System.out.println(length +" is a palindrome");
			count++;
		 }
		}
		System.out.println("Total number of Palindromes: " + count);
	}

}
