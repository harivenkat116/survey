package com.survey2015.dao;

import java.sql.SQLException;

public class DAOException extends RuntimeException {
	
	public DAOException(String errorMessage, Throwable ex)
	{
		super(errorMessage, ex);
	}
	
	public DAOException(SQLException ex, String string) {
		// TODO Auto-generated constructor stub
		super(ex);
	}

	public DAOException(String ex) {
		// TODO Auto-generated constructor stub
		super(ex);
	}
}
