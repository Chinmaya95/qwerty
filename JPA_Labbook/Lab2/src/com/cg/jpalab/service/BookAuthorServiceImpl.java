package com.cg.jpalab.service;

import java.util.List;

import com.cg.jpalab.dao.BookAuthorDAO;
import com.cg.jpalab.dao.BookAuthorDAOImpl;
import com.cg.jpalab.entities.Author;
import com.cg.jpalab.entities.Book;

public class BookAuthorServiceImpl implements BookAuthorService {

	private BookAuthorDAO dao = new BookAuthorDAOImpl();
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return dao.getAllBooks();
	}

	@Override
	public List<Book> getAllBooksByAuthor(Author author) {
		// TODO Auto-generated method stub
		return dao.getAllBooksByAuthor(author);
	}

	@Override
	public List<Book> getAllBooksByPriceRange(double lower, double upper) {
		// TODO Auto-generated method stub
		return dao.getAllBooksByPriceRange(lower, upper);
	}

	@Override
	public String getAuthorNameByBookId(int bookId) {
		// TODO Auto-generated method stub
		return dao.getAuthorNameByBookId(bookId);
	}

}
