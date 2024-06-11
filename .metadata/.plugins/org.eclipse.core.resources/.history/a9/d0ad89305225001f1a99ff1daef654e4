package com.pace.library.dao;

// persistence layer
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.pace.library.bean.Book;
import com.pace.library.helper.DbConnector;

public class BookDAO {

	// JDBC API classes for data retrieval
	private Connection connection = null;
	private PreparedStatement pstatement = null;
	private ResultSet resultSet = null;
	// Book book = new Book();
	ArrayList<Book> bookList = null;
	private static String bookQry = "select * from book";

	/****************** Get books data *******************************/
	public ArrayList<Book> getBooks() throws ClassNotFoundException, SQLException {
		// Process to get books from table into bookList : 
		//1. Get the book data from table. 
		//2. Add each book to BookList. 
		//3. Return BookList
		try {
			// open the connection
			connection = DbConnector.createConnection();
			// create pstatement
			pstatement = connection.prepareStatement(bookQry);
			// get the result
			resultSet = pstatement.executeQuery();
			Book book;
			bookList = new ArrayList<Book>();
			while (resultSet.next()) {
				int bookId;
				String bookName;
				String author;
				float price;
				// declare the pojo
				book = new Book();
				// get the row details
				bookId = resultSet.getInt(1);
				bookName = resultSet.getString(2);
				author = resultSet.getString(3);
				price = resultSet.getFloat(4);
				// Add this data to book bean
				// set the pojo with retrieved values from the row
				book.setBookId(bookId);
				book.setBname(bookName);
				book.setAuthor(author);
				book.setPrice(price);
				// add the book to booklist
				bookList.add(book);
				book = null;
			} // end of while loop

		} catch (SQLException sqlex) {

		} finally {
			// close connection
			// now data is in array list object, close the connection
			DbConnector.closeConnection();
		}

		return bookList;
	}

	/******************** Show list of books ************************************/
	public void showBookList(ArrayList<Book> bookList2) {
		System.out.println("In DAO layer ");
		for (Book book : bookList2) {
			System.out.print(book.getBookId());
			System.out.print("\t" + book.getBname());
			System.out.print("\t" + book.getAuthor());
			System.out.println("\t" + book.getPrice());
		}
	}

	/**************** Inserting book data 
	 * @return *********************************/

	public int insertBookDetails(Book book) throws ClassNotFoundException, SQLException {
		connection = DbConnector.createConnection();

		String insQry = "insert into book values(?,?,?,?)";
		pstatement = connection.prepareStatement(insQry);
		pstatement.setInt(1, book.getBookId());
		pstatement.setString(2, book.getBname());
		pstatement.setString(3, book.getAuthor());
		pstatement.setFloat(4, book.getPrice());

		int rows = pstatement.executeUpdate();
		System.out.println(rows + " Rows Inserted!");
		DbConnector.closeConnection();
		return rows;
	}

	/**************** Deleting book *********************************/

	public boolean deleteBook(int id) throws SQLException, ClassNotFoundException {
		pstatement = null;
		//Scanner scnr = new Scanner(System.in);
		connection = DbConnector.createConnection();
		String delQry = "delete from book where id=?";
		pstatement = connection.prepareStatement(delQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isDelete = true;
		if (rows != 0) { // if rows is non-zero, it is deleted
			isDelete = true; // status of deletion
		} else {
			isDelete = false; // status of deletion
		}
		DbConnector.closeConnection();
		return isDelete;
	}
	/******************* Updating book **************************/
	public boolean updateBook(int id) throws SQLException, ClassNotFoundException {
		pstatement = null;
		
		connection = DbConnector.createConnection();
		String updPriceQry = 
			"update book set price = price + price * 0.10 where id=?" ;
		pstatement = null;
		pstatement = connection.prepareStatement(updPriceQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isUpdate = true;
		if (rows != 0) { // if row available, it is deleted
			isUpdate = true; // status of updation
		} else {
			isUpdate = false; // status of updation
		}
		DbConnector.closeConnection();
		return isUpdate;
	}

}// end of dao class