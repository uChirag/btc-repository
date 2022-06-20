package com.cru.calorietracker;

import java.util.Scanner;

public class CalorieTracker {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Calorie burnt by cycling :");
		int c= scan.nextInt();
		System.out.print("Calorie burnt by running :");
		int r= scan.nextInt();
		System.out.print("Calorie burnt by swimming:");
		int s= scan.nextInt();
		System.out.print("Calorie intake in a day :");
		int i= scan.nextInt();
		float a=((((2*c)+(2*s)+(2*r))*4-(30*i))/1000);
		System.out.println("Weight lost by Anne in a month is :" +a+ " pounds");

	}

}
