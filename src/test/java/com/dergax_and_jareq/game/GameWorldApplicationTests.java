package com.dergax_and_jareq.game;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import javax.xml.crypto.Data;
import java.sql.*;


@SpringBootTest
class GameWorldApplicationTests {

	@Test
	void contextLoads() {
	}
//
//	private Connection connection;
//	private static Statement statement;
//	private static ResultSet rs;
//
//	@BeforeClass
//	public void setUp() {
//		String databaseURL = "jdbc:mysql://localhost:3306/game";
//		String user = "dergax";
//		String password = "Test";
//		connection = null;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			System.out.println("Connecting to Database...");
//			connection = DriverManager.getConnection(databaseURL, user, password);
//			if (connection != null) {
//				System.out.println("Connected to the Database...");
//			}
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//		catch (ClassNotFoundException ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	@Test
//	public void getEmployeesFromDataBase() {
//		try {
//			String query = "SELECT * FROM game.users;";
//			statement = connection.createStatement();
//			rs = statement.executeQuery(query);
//
//			while(rs.next()){
//				int EmpId= rs.getInt("EmpId");
//				String EmpName= rs.getString("EmpName");
//				Date EmpAddress=rs.getDate(3);
//				String EmpDept=rs.getString("EmpDept");
//				Double EmpSal= rs.getDouble(5);
//				System.out.println(EmpId+"\t"+EmpName+"\t"+EmpAddress+"\t"+EmpSal+"\t"+EmpDept);
//			}
//		} catch (SQLException ex) {
//			ex.printStackTrace();
//		}
//	}
//
//	@AfterClass
//	public void tearDown() {
//		if (connection != null) {
//			try {
//				System.out.println("Closing Database Connection...");
//				connection.close();
//			} catch (SQLException ex) {
//				ex.printStackTrace();
//			}
//		}
//	}

}
