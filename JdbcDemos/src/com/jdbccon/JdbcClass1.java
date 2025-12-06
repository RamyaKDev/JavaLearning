package com.jdbccon;

import java.sql.*;

public class JdbcClass1 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/training";
		String username="root";
		String password="abcd";
		Connection con=null;
		Statement st=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url,username,password);
			st=con.createStatement();
			boolean b=st.execute("create table custome5(cust_id integer primary key, cust_name varchar(20),city varchar(25));"
					);
			System.out.println(b);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			if(con!=null)
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(st!=null)
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
