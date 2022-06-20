package com.cru.inheritance;

public class InheritanceMain {
	public static void main(String[] args) {
		WrittenItem b=new Books(26, "400 Days", 190, "Chetan Bhagat");
		System.out.println(b);
		b.showauthordetails();
		b.additem();
		b.checkin();
		b.checkout();
		b.print();
		WrittenItem w=new JournalPaper(5, "Acoustics", 265,"Suraj", "2012-SEP-27");
		System.out.println("-------------------------------------------------------------------------------------------");
		System.out.println(w);
		w.showauthordetails();
		w.additem();
		w.checkin();
		w.checkout();
		w.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m=new Video(77, "Sky Fall", 750, 2687, "Bond", "SPY", "Nov-2006");
		System.out.println(m);
		m.show_details_media();
		m.additem();
		m.checkin();
		m.checkout();
		m.print();
		System.out.println("-------------------------------------------------------------------------------------------");
		MediaItem m1=new Cd(77, "Neymar", 50, 658, "cru", "Football");
		System.out.println(m1);
		m1.show_details_media();
		m1.additem();
		m1.checkin();
		m1.checkout();
		m1.print();
		
	}


}
