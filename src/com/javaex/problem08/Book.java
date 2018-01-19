package com.javaex.problem08;

public class Book {
	
	private int bookNo;
	private String title;
	private String author;
	private int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void rent() {
		if(stateCode == 1) {
			this.stateCode = 0;
			System.out.println(title+"이(가) 대여 됐습니다.");
		} else {
			System.out.println(title+"이(가) 이미 대여중입니다.");
		} 		
	}	
	public void print() {
		String IsRent = "";
		if(stateCode == 0) {
			IsRent = "대여중";
		} else if(stateCode == 1) {
			IsRent = "재고있음";
		}	
		System.out.println(bookNo +" 책 제목:"+title+", 작가:"+author+", 대여유무:"+IsRent);
	}       
}       

