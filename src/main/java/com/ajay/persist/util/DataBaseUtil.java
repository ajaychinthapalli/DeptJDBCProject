package com.ajay.persist.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import com.ajay.persist.exceptions.PersistException;

public class DataBaseUtil {

	public static Connection getDBConnection() throws PersistException {
		Properties props = new Properties();
		FileInputStream fis = null;
		Connection con = null;
		try {
			fis = new FileInputStream("src/main/resources/db.properties");
			props.load(fis);

			// load the Driver Class
			Class.forName(props.getProperty("DB_DRIVER_CLASS"));

			// create the connection now
			con = DriverManager.getConnection(props.getProperty("DB_URL"),
					props.getProperty("DB_USERNAME"),
					props.getProperty("DB_PASSWORD"));
		} catch (IOException ex) {
			ex.printStackTrace();
			throw new PersistException();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
			throw new PersistException();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistException();
		}
		return con;
	}

	public static void closeConnection(Connection connObj)
			throws PersistException {
		try {
			if (connObj != null) {
				connObj.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistException();
		}
	}

	public static void closeStatement(Statement statementObj)
			throws PersistException {
		try {
			if (statementObj != null) {
				statementObj.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistException();
		}
	}

	public static void closeResultset(ResultSet resSetObj)
			throws PersistException {
		try {
			if (resSetObj != null) {
				resSetObj.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new PersistException();
		}
	}

}
