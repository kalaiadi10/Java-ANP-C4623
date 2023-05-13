package com.labsessionproject.Dao;

import java.util.List;

import com.labsessionproject.model.Book;


public interface IBookDao {
	
		void saveBook(Book book);

		void updateBook(Book book);

		Book getBookById(long id);

		List<Book> getAllBooks();

		void deleteBook(long id);
	


}
