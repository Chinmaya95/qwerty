package com.cg.jpalab.dao;

import java.util.List;

import com.cg.jpalab.entities.Author;
import com.cg.jpalab.entities.Book;
import com.cg.jpalab.util.JPAUtil;

public class BookAuthorDAOImpl implements BookAuthorDAO {
	
	@Override
	public List<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return JPAUtil.getEntityManager().;
	}

	@Override
	public List<Book> getAllBooksByAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getAllBooksByPriceRange(double lower, double upper) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAuthorNameByBookId(int bookId) {
		// TODO Auto-generated method stub
		return null;
	}

}
