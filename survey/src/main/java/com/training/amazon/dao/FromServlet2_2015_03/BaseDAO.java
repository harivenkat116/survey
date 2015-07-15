package com.training.amazon.dao.FromServlet2_2015_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDAO {

	protected Connection getConnection() throws SQLException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return DriverManager.getConnection(
				// "jdbc:oracle:thin:@localhost:1521:orcl11b", "javatraining", "javatraining");
		        // "jdbc:oracle:thin:@localhost:1521:orcl11b", "java2015", "java2015");
				"jdbc:oracle:thin:@localhost:1521:orcl11b", "SURVEY2015", "SURVEY2015");
	}

	protected void closeResources(ResultSet rs, Statement statement,
			Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (statement != null) {
				statement.close();
			}

			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			// Nothing to be done, ignore it.
		}
	}

}
