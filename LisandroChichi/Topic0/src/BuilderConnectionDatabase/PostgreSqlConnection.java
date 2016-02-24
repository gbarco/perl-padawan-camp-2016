package BuilderConnectionDatabase;

public class PostgreSqlConnection implements BuilderConnection{

Connection conn;
	
	
	public PostgreSqlConnection() {
		// TODO Auto-generated constructor stub
	conn = new Connection();
	
	}
	
	@Override
	public void createDriver() {
		// TODO Auto-generated method stub
		conn.setDriver("org.postgresql.Driver");
	}

	@Override
	public void createUrl() {
		// TODO Auto-generated method stub
		conn.setUrl("jdbc:postgresql://localhost:5432/testdb");
		
	}

	@Override
	public void createUser() {
		// TODO Auto-generated method stub
		conn.setUser("postgres");
	}

	@Override
	public void createPass() {
		// TODO Auto-generated method stub
		conn.setPass("123");
	}

	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
