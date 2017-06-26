package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Connect {
    public static void main(String args []) {
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://rm-uf6h80zw21bs4b6u8o.mysql.rds.aliyuncs.com:3306/test_one";
			String user = "root";
			String password = "Lyy@4878212";
			Connection conn = DriverManager.getConnection(url, user, password);
			
			Statement statement = conn.createStatement();
			String sql = "select * from persons";
			ResultSet resultSet = statement.executeQuery(sql);
			int id;
			String 	lastName,firstName,address,city;
			
	        System.out.println("id\t lastName\t firstName\t address\t city\t");
	        
	        while(resultSet.next()) {
	        	id = resultSet.getInt(1);
	        	lastName = resultSet.getString(2);
	        	firstName = resultSet.getString(3);
	        	address = resultSet.getString(4);
	        	city = resultSet.getString(5);
	        	System.out.println(id+"\t"+lastName+"\t"+firstName+"\t"+address+"\t"+city+"\t");
	        }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
