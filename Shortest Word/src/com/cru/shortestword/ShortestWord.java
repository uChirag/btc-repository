package com.cru.shortestword;

import java.util.Scanner;

public class ShortestWord {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] words = {"Atrocity", "Pensive", "Imperceptible", "Discordant", "Haha"};
		String shortest = words[0];
		for (int i=0; i<words.length; i++){
    		if (words[i].length() <= shortest.length()){
        	shortest = words[i];

   	 	}
		}
	  System.out.println(shortest);

	}

}
