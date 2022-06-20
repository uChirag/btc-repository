package com.cru.residentrepo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ResidentService {
	public static void main(String[] args) {
		Resident res1 = new Resident("srinivas", 100, "Male");
		Resident res2 = new Resident("bunny", 200, "Female");
		Resident res3 = new Resident("sunny", 400, "Female");
		Resident res4 = new Resident("chinny", 300, "Male");

		List<Resident> listResidents = new ArrayList<>();
		listResidents.add(res1);
		listResidents.add(res2);
		listResidents.add(res3);
		listResidents.add(res4);

		System.out.println("Residents details are here....");
		System.out.println(listResidents);

		System.out.println("\nResidents details ordered by ssn number....");

		Collections.sort(listResidents);
		System.out.println(listResidents);

		System.out.println("\nResidents details are here according to name....");

		listResidents.sort(Comparator.comparing(Resident::getFullName));
		System.out.println(listResidents);

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("\nSearch by ssn number");
			System.out.print("Enter a ssn number: ");

			while (!sc.hasNextInt()) {

				sc.nextLine();
				System.out.println("Enter a valid ssn number!");
				System.out.print("Enter a ssn number: ");
			}
			int ssn = sc.nextInt();
			Residents residentResult = listResidents.stream().filter(r -> r.getSsn() == ssn).findFirst().orElse(null);
			System.out.println("\nPrinting the result via stream research");
			if (residentResult != null) {
				System.out.printf("Resident with %d ssn number is: %s%n", ssn, residentResult.getFullName());
			} else {
				System.out.printf("There is no resident with %d ssn number...%n", ssn);
			}

			Collections.sort(listResidents);
			int index = Collections.binarySearch(listResidents, new Residents("", ssn, ""));

			System.out.println("\nPrinting the result via binary search");
			if (index >= 0) {
				System.out.printf("Resident with %d ssn number is: %s%n", ssn, listResidents.get(index).getFullName());
			} else {
				System.out.printf("There is no resident with %d ssn number...%n", ssn);
			}
		}
	}
}
