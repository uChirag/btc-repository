package com.cru.employeewage;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        wageCalculator employee = new wageCalculator();

        System.out.print( "Enter name of the employee: " );
        String name = input.nextLine();
        employee.setEmployeeName( name );

        System.out.print( "Enter number of hours worked by the employee: " );
        int hours = input.nextInt();
        
        System.out.print( "Enter base pay of the employee: " );
        double rate = input.nextDouble();

        employee.calculatePay( hours, rate );
        employee.displayEmployee();

        System.out.println();


	}
}
