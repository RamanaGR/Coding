package org.paumard.reflection.provider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.paumard.reflection.annotation.Provides;

public class H2ConnectionProvider {

	@Provides
	public Connection buildConnection() throws SQLException {
		Connection connection = 
				DriverManager.getConnection(
						"jdbc:h2:C:\\Users\\chinn\\IdeaProjects\\Coding\\demos\\Injection\\db-files",
						"sa", "");

		return connection;
	}
}
