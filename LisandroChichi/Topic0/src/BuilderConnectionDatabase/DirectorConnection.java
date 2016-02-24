package BuilderConnectionDatabase;

public class DirectorConnection {

	private BuilderConnection builder = null;
	
	public DirectorConnection(BuilderConnection builder) {
			this.builder = builder;
		
		// TODO Auto-generated constructor stub
	}
	
	public Connection getConnection(){
		return builder.getConnection();
	}
	
	public void constructConnection(){
		
		builder.createDriver();
		builder.createUrl();
		builder.createUser();
		builder.createPass();
	}
	
}
