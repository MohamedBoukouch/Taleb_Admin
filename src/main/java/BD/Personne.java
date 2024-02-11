package BD;

import java.sql.SQLException;

public class Personne extends ConnexionDB{

	private String name;
	private String email;
	private String password;
	public Personne(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean enregistrer() throws SQLException {
	    if(instruction == null) {
	        instruction = connexion.createStatement();
	    }
	    MiseAjour("INSERT INTO user(nom,prenom) VALUES (\""+name+"\",\""+email+"\")");
	    return true;
	}
}
