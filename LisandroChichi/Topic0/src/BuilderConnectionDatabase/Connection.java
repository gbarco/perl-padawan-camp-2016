package BuilderConnectionDatabase;

public class Connection {
	Connection conn;
	String driver;
	String url;
	String user;
	String pass;
	


	public void setDriver(String driver) {
		this.driver = driver;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}
	
	@Override
	public String toString() {
		return "Driver"+ driver;
	}
}
