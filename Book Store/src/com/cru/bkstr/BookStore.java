package com.cru.bkstr;

public class BookStore {
	private String bookStoreName;
	private String bookStoreId;
	private Book[] books;
	public String getBookStoreName() {
		return bookStoreName;
	}
	public void setBookStoreName(String bookStoreName) {
		this.bookStoreName = bookStoreName;
	}
	public String getBookStoreId() {
		return bookStoreId;
	}
	public void setBookStoreId(String bookStoreId) {
		this.bookStoreId = bookStoreId;
	}
	public Book[] getBooks() {
		return books;
	}
	public void setBooks(Book[] books) {
		this.books = books;
	}
	public void calculateDiscount(Book book,double discountPercentage)
	{
		String gen=book.getGenre();
		if(gen.equals("fiction"))
		{
			double discount=book.getPrice()-(book.getPrice()*(discountPercentage/100));
			book.setPrice(discount);
	        System.out.println("BOOK DETAILS AFTER DISCOUNT  \n" +book+"\n");
		} 
	}

}
