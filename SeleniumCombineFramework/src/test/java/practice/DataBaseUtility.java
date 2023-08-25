package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;

import generics.IAutoConstants;

public class DataBaseUtility implements IAutoConstants {
	public Connection connection;
	public void establishingTheConnecton()  {
		try {
			connection= DriverManager.getConnection(JDBC_URL,JDBC_UN)
		} catch(SQLException e)  {
			e.printStackTrace();
		}
	}
	public ArrayList<String>readingData1(String query,String columnName){
		Statement statement=null;
		ResultSet value=null;
		try  {
			statement=connection.createStatement();
			}catch(SQLException e) {
				e.printStackTrace();
				}
		try  {
			value=statement.executeQuery(query);
		}catch(SQLException e)  {
			e.printStackTrace();
		}
		ArrayList<String> data=new 	ArrayList<String>();
		try {
			while(value.next()) {
				data.add(value.getString(columnName));
			}
		}catch(SQLException e) {
			e.printStackTrace();
				
			}
		return data;
	}
}
		
