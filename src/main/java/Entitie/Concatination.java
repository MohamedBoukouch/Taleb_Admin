package Entitie;

public class Concatination {
	
	private String username;
	private String email;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Concatination(String username, String email, String password) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
	}

	public Concatination() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String Tostring() {
		return email+"---"+username+"---"+password;
	}
	

}
