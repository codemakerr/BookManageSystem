package com.wmbt.bmsdemo.service;

import java.util.List;

import com.wmbt.bmsdemo.model.BookState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wmbt.bmsdemo.mapper.BookMapper;
import com.wmbt.bmsdemo.model.Book;

@Service
@CrossOrigin(origins = "http://localhost:4200")
public class BookService {

	@Autowired
	BookMapper mapper;
	
	public List<Book> getAllBook(){
		return mapper.getAllBook();
	}

	public void deleteById(String id) {
	    mapper.deleteById1(id);
	    mapper.deleteById2(id);
    }

    public void newBook(Book book) {

	    int temp;
	    if (book.getState().equals(BookState.在库.toString())) temp = 0;
	    else temp = 1;

	    mapper.newBook1(book.getId(), book.getName(), book.getAuthor(), book.getPublish(), book.getShelf(),
                book.getAddress(), temp, book.getPic_path(), book.getBorrow_time(), book.getPrice());

	    mapper.newBook2(book.getId(), book.getType());
    }

    public void updateById(Book book) {
		int temp;
		if (book.getState().equals(BookState.在库.toString())) temp = 0;
		else temp = 1;
		mapper.updateById1(book.getId(), book.getName(), book.getAuthor(), book.getPublish(), book.getShelf(), book.getAddress(), temp, book.getPic_path(), book.getBorrow_time(), book.getPrice());

		mapper.updateById2(book.getId(), book.getType());
	}

	public List<Book> getBookByName(String name) {
		return mapper.getBookByName(name);
	}


}
