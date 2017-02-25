package cn.itcast.bookstore.book.service;

import java.util.List;

import cn.itcast.bookstore.book.dao.BookDao;
import cn.itcast.bookstore.book.domain.Book;

public class BookService {
	private BookDao bookDao = new BookDao();

	
	public List<Book> findALL(){
		return bookDao.findALL();
	}
	
	public List<Book> findByCategory(String cid){
		return bookDao.findByCategory(cid);
	}
	
	public Book findByBid(String bid){
		return bookDao.findByBid(bid);
	}
	public void delete(String bid){
		bookDao.delete(bid);
	}

	public void mod(Book book) {
		bookDao.mod(book);
		
	}

	public void add(Book book) {
		bookDao.add(book);
		
	}
	
	
}
