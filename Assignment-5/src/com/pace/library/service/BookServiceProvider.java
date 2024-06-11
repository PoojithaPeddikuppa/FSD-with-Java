package com.pace.library.service;
import java.sql.SQLException;
import java.util.ArrayList;

import com.pace.library.dao.BookDAO;
import com.pace.library.entity.Book;

public class BookServiceProvider {
	ArrayList<Book>bookList = new ArrayList<Book>();
	BookDAO bookDAO = new BookDAO();
	public ArrayList<Book>getBookService() throws ClassNotFoundException,SQLException{
		bookList = bookDAO.getBooks();
		return bookList;
	}
//showing book data service
	public void showBooksService(ArrayList<Book>bookList)throws ClassNotFoundException,SQLException{
		System.out.println("In service layer");
		bookList = bookDAO.getBooks();
		bookDAO.showBookList(bookList);
	}
//Inserting book data service
	public void insertBookService(Book book)throws ClassNotFoundException,SQLException{
		 bookDAO.insertBookDetails(book);
	}
	
	//deleting book data service
	public void deleteBookService(int id)throws ClassNotFoundException,SQLException{
		boolean isBookDeleted = bookDAO.deleteBook(id);
		if(isBookDeleted == true) {
			System.out.println("Book with id" + id + "was deleted");
		}
		else {
			System.out.println("Book with id" + id + "is unavailable");

			
		}
		
	}
	public void updateBookService(int id)throws ClassNotFoundException,SQLException{
		boolean isBookUpdated = bookDAO.updateBook(id);
		if(isBookUpdated == true) {
			System.out.println("Book with id" + id + "was deleted");
		}
		else {
			System.out.println("Book with id" + id + "is unavailable");
}
		}
 public void updateBooksByPriceSlashService()throws ClassNotFoundException,SQLException {
                boolean isBookUpdated = bookDAO.updateBooksByPriceSlash();
                if(isBookUpdated == true) {
        			System.out.println("Book prices updated successfully!");
        		}
        		else {
        			System.out.println("Update failed: ");

        		}
        		}
}
	         