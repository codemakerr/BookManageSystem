package com.wmbt.bmsdemo.model;

import lombok.*;

@ToString
public class Book {
	
	private String id;
	private String name;
	private String type;
	private String author;
	private String publish;
	private int shelf;
	private char address;
	private BookState state;
	private int borrow_time;
	private String pic_path;
	private double price;


	public Book() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublish() {
		return publish;
	}

	public void setPublish(String publish) {
		this.publish = publish;
	}

	public int getShelf() {
		return shelf;
	}

	public void setShelf(int shelf) {
		this.shelf = shelf;
	}

	public char getAddress() {
		return address;
	}

	public void setAddress(char address) {
		this.address = address;
	}

	public String getState() {
		return state.toString();
	}

	public int getBorrow_time() {
		return borrow_time;
	}

	public void setBorrow_time(int borrow_time) {
		this.borrow_time = borrow_time;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setState(int state) {
		if (state == 0) 
			this.state = BookState.在库;
		else
			this.state = BookState.已借出;
	}

	public String getPic_path() {
		return pic_path;
	}

	public void setPic_path(String pic_path) {
		this.pic_path = pic_path;
	}


}
