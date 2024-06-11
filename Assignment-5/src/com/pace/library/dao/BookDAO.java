package com.pace.library.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Statement;

import com.pace.library.entity.Book;
import com.pace.library.helper.DbConnector;

public class BookDAO {

//JDBC API classes for data retrival
	private Connection connection = null;
	private PreparedStatement pstatement = null;
	private ResultSet resultSet = null;
	private Statement statement = null;
//Book book=new Book();
	ArrayList<Book> bookList = null;
	private static String bookQry = "select * from book";

	/*************** Get book data ***************************/
	public ArrayList<Book> getBooks() throws ClassNotFoundException, SQLException {
		try {
//open the connection
			connection = DbConnector.createConnection();
//create pstatement
			pstatement = connection.prepareStatement(bookQry);
//get the result
			resultSet = pstatement.executeQuery();
			Book book;
			bookList = new ArrayList<Book>();

			while (resultSet.next()) {
				int bookId;
				String bookName;
				String author;
				float price;
//declare the pojo
				book = new Book();
//get the row details
				bookId = resultSet.getInt(1);
				bookName = resultSet.getString(2);
				author = resultSet.getString(3);
				price = resultSet.getFloat(4);
//Add this data to book bean
//set the pojo(plain old java object) with retrieved values from the row
				book.setBookId(bookId);
				book.setBname(bookName);
				book.setAuthor(author);
				book.setPrice(price);
//add the book to bookList
				bookList.add(book);
				book = null;
			}
		} catch (SQLException sqlex) {

		} finally {
//close connection
//now data is in array list object close the connection
			DbConnector.closeConnection();
		}
		return bookList;
	}

	/****************** Show list of books ************************/
	public void showBookList(ArrayList<Book> bookList2) {
		System.out.println("In DAO layer");
		for (Book book : bookList2) {
			System.out.print(book.getBookId());
			System.out.print("\t" + book.getBname());
			System.out.print("\t" + book.getAuthor());
			System.out.println("\t" + book.getPrice());
		}
	}

	/*********** Inserting book data *******************/
	public void insertBookDetails(Book book) throws ClassNotFoundException, SQLException {
		connection = DbConnector.createConnection();
		String insQry = "insert into book values(?,?,?,?)";
		pstatement = connection.prepareStatement(insQry);
		pstatement.setInt(1, book.getBookId());
		pstatement.setString(2, book.getBname());
		pstatement.setString(3, book.getAuthor());
		pstatement.setFloat(4, book.getPrice());

		int rows = pstatement.executeUpdate();
		System.out.println(rows + "Rows Inserted!");
		DbConnector.closeConnection();
	}

	/***************** Deleting book *******************/
	public boolean deleteBook(int id) throws SQLException, ClassNotFoundException {
		pstatement = null;
//Scanner scnr=new Scanner(Syatem.in);
		connection = DbConnector.createConnection();
		String delQry = "delete from book where id=?";
		pstatement = connection.prepareStatement(delQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isDelete = true;
		if (rows != 0) { // if rows is non-zero,it is deleted
			isDelete = true; // status of deletion
		} else {
			isDelete = false;
		}
		DbConnector.closeConnection();
		return isDelete;
	}

	/*************** Updating book ****************/
	public boolean updateBook(int id) throws SQLException, ClassNotFoundException {
		pstatement = null;
		connection = DbConnector.createConnection();
		String updPriceQry = "update book set price=price+545 where id=?";
		pstatement = connection.prepareStatement(updPriceQry);
		pstatement.setInt(1, id);
		int rows = pstatement.executeUpdate();
		boolean isUpdate = true;
		if (rows != 0) {
			isUpdate = true;
		} else {
			isUpdate = false;
		}
		DbConnector.closeConnection();
		return isUpdate;
	}

	public boolean updateBooksByPriceSlash() throws SQLException, ClassNotFoundException {
		statement = null;
		connection = DbConnector.createConnection();
		statement = connection.createStatement();
		String updateQry = "update book set price = case "
				+ "when name = 'The Alchemist' then price - price *(34.28 / 100)"
				+ "when name = 'Computer Networks' then price - price * (3.2 / 100)" + "else price end "
				+ "where name in('The Alchemist', 'Computer Networks')";
		int rows = statement.executeUpdate(updateQry);
		boolean isUpdate = true;
		if (rows != 0) {
			isUpdate = true;
		} else {
			isUpdate = false;
		}
		DbConnector.closeConnection();
		return isUpdate;

	}
}
