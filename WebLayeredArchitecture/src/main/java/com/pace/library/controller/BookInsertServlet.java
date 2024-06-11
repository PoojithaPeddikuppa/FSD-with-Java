package com.pace.library.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pace.library.dao.BookDAO;
import com.pace.library.bean.Book;

/**
 * Servlet implementation class BookInsertServlet
 */
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BookInsertServlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		BookDAO bookDao = new BookDAO();
		Book book = new Book();
		int rows = 0;
		int id;
		String name, author;
		float price;
		id = Integer.parseInt(request.getParameter("id"));
		name = request.getParameter("name");
		author = request.getParameter("author");
		price = Float.parseFloat(request.getParameter("price"));

		// make the pojo ready with data
		book.setBookId(id);
		book.setBname(name);
		book.setAuthor(author);
		book.setPrice(price);
		// pojo is ready with data
		System.out.println(book.getBname());
		try {
			rows = bookDao.insertBookDetails(book);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Book data could not inserted!");
		}
		if (rows == 1) {
			System.out.println("Book data successfully inserted");
						RequestDispatcher dis = 
					request.getRequestDispatcher("insertSuccess.html");
			dis.forward(request, response); 
		} else {
			System.out.println("Book data could not insert");

		}
	}

}
