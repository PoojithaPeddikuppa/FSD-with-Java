package com.pace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadData {
    Connection conn;
    Statement stmt;
    ResultSet rset;
    PreparedStatement pstmt;
    Scanner scnr = new Scanner(System.in);

    public void registerDriver() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
    }

    public void getDetails() throws Exception {
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "Poojitha@14");
        stmt=conn.createStatement();
        // int row = stmt.executeUpdate("insert into book values(2222,'MyBook','Myself',563.24)");

        int id;
        String name, author;
        float price;
        System.out.println("Enter book id");
        id = scnr.nextInt();
        System.out.println("Enter book name");
        name = scnr.next();
        System.out.println("Enter book author");
        author = scnr.next();
        System.out.println("Enter book price");
        price = scnr.nextFloat();

        // stmt=conn.createStatement();
        // insert into book values(111,'Mybook2','Myself',563.24s)
        pstmt = conn.prepareStatement("insert into book values(?,?,?,?)");
        pstmt.setInt(1, id);
        pstmt.setString(2, name);
        pstmt.setString(3, author);
        pstmt.setFloat(4, price);
        pstmt.executeUpdate();

        rset = stmt.executeQuery("select * from book");
        while (rset.next()) {
            System.out.println(rset.getInt(1));
            System.out.println("\t" + rset.getString(2));
            System.out.println("\t" + rset.getString(3));
            System.out.println("\t" + rset.getFloat(4));
        }

        rset.close();
        stmt.close();
        conn.close();
    }

    public static void main(String[] args) {
        ReadData reader = new ReadData();
        try {
            reader.registerDriver();
            reader.getDetails();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
