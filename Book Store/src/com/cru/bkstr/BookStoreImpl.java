package com.cru.bkstr;

public class BookStoreImpl {

	public static void main(String[] args) {
		Book b=new Book();
		b.setIsbnNo(1644);
		b.setBookName("An orphans war");
		b.setAuthor("Molly Green");
		b.setGenre("fiction");
		b.setPrice(760);
		System.out.println("BOOK DETAILS BEFORE DISCOUNT \n"+b+"\n");
		Book[] bo=new Book[1];
		bo[0]=b;
		BookStore b1=new BookStore();
		b1.setBookStoreName("Book Palace");
		b1.setBookStoreId("ID-bookstore");
		b1.setBooks(bo);
		b1.calculateDiscount(b, 25);
		System.out.println("---------------------------------------------------------------------------------");
		Book b3=new Book();
		b3.setIsbnNo(2843);
		b3.setBookName("To worlds above");
		b3.setAuthor("Jason Hamilton");
		b3.setGenre("adventure");
		b3.setPrice(190);
		System.out.println("BOOK DETAILS \n"+b3);
		Book[] bo1=new Book[1];
		bo1[0]=b3;	
		BookStore b4=new BookStore();
		b4.setBookStoreName("Palace book");
		b4.setBookStoreId("88-bookstore");
		b4.setBooks(bo1);
		b4.calculateDiscount(b3, 25);


	}

}
