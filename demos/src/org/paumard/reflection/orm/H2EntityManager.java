package org.paumard.reflection.orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class H2EntityManager<T> extends AbstractEntityManager<T> {
	
	public Connection buildConnection() throws SQLException {
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:h2:C:\\Users\\chinn\\IdeaProjects\\Coding\\demos\\db-files\\PERSON",
						"sa", "");
		return connection;
	}

}
