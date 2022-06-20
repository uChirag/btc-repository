package com.cru.fencingbarn;

import java.util.Scanner;

public class FencingBarn {
	public static void square(double s)
	{
	    System.out.println("Area of square fence for chickens is " + s*s);
	}
	public static void circular(double radius)
	{
	    System.out.println("Area of circular area for the ducks is " + 3.142*radius*radius);
	}
	public static void rectangular(double len, double w)
	{
	    System.out.println("Area of rectangular area for the cows is " + len*w);
	}
	public static void main(String[] args)
	{
	    Scanner scan=new Scanner(System.in);
	    System.out.println("press 1 for Square area of chicken\npress 2 for circular area for ducks\npress 3 for Rectangular area for cows\n ");
	    System.out.println("Enter your choice: ");
	    int ch=scan.nextInt();
	    switch(ch)
	    {
	        case 1: 
	            System.out.println("Enter side of square :");
	            double sides=scan.nextInt();
	            square(sides);
	            break;
	        case 2:
	            System.out.println("Enter radius of circle :");
	            int radius=scan.nextInt();
	            circular(radius);
	            break;
	        case 3:
	            System.out.println("Enter length of rectangle :");
	            int len=scan.nextInt();
	            System.out.println("Enter width of rectangle :");
	            int w=scan.nextInt();
	            rectangular(len,w);
	            break;
	        default:
	            System.out.println("invalid value");
	    } 
	}

}
