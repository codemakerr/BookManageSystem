package com.wmbt.bmsdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wmbt.bmsdemo.model.Book;
import com.wmbt.bmsdemo.service.BookService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class BookController {

	@Autowired
	BookService service;
	
	@GetMapping("/GetAllBook")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Book> getAllBook(){
		service.getAllBook().forEach(System.out::println);
		return service.getAllBook();
	}

	@GetMapping("/DeleteById")
    public String deleteById(String id){
        System.out.println(id);
        service.deleteById(id);
        return id;
    }

    @GetMapping("/NewBook")
    public String newBook(String id, String name, String author, String publish, int shelf, char address,
                          int state, String pic_path, int borrow_time, double price, String type) {
	    Book book = new Book();
	    book.setId(id);
	    book.setName(name);
	    book.setAuthor(author);
	    book.setPublish(publish);
	    book.setShelf(shelf);
	    book.setAddress(address);
	    book.setState(state);
	    book.setPic_path(pic_path);
	    book.setBorrow_time(borrow_time);
	    book.setPrice(price);
	    book.setType(type);
	    service.newBook(book);
	    return book.toString();
    }

    @GetMapping("/Update")
    public String updateById(String id, String name, String author, String publish, int shelf, char address, int state, String pic_path, int borrow_time, double price, String type) {
		Book book = new Book();
		book.setId(id);
		book.setName(name);
		book.setAuthor(author);
		book.setPublish(publish);
		book.setShelf(shelf);
		book.setAddress(address);
		book.setState(state);
		book.setPic_path(pic_path);
		book.setBorrow_time(borrow_time);
		book.setPrice(price);
		book.setType(type);
		service.updateById(book);
		return book.toString();
	}

	@GetMapping("/GetBookByName")
	public List<Book> getBookByName(String name) {
		return service.getBookByName(name);
	}

}
