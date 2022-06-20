package com.cru.phvalue;

import java.util.Scanner;

public class pHValue {
	public static void main(String []args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements : ");
		int num = scan.nextInt();
		if(num<7){
			System.out.println("pH value is low, partial water change required.");
		}
		else if(num>=7 && num<=8){
			System.out.println("pH value is fine.");
		}
		else if(num>8){
			System.out.println("pH value is high, partial water change required.");
		}
		
	}
}
