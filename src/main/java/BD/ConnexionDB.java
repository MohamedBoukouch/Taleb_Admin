package BD;

import java.sql.*;

public class ConnexionDB {
	
	protected Connection connexion;
	protected Statement instruction;
	protected ResultSet resultat;
	
	public ConnexionDB() {
	    try {
	        // Load the MySQL JDBC driver
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        
	        // Establish the database connection
	        connexion = DriverManager.getConnection("jdbc:mysql://localhost/taleb", "root", "");
	        
	        // Create a statement object
	        instruction = connexion.createStatement();
	        
	        // Log a message indicating successful connection
	        System.out.println("Connected to the database successfully!");
	    } catch (ClassNotFoundException e) {
	        // Log an error message if the JDBC driver class is not found
	        //e.printStackTrace();
	        System.out.println("wa ohoya");
	    } catch (SQLException ex) {
	        // Log an error message if there's an SQL exception
	        //ex.printStackTrace();
	        System.out.println("wa ohoya 22");
	    }
	}

	
	public void lire(String requeste) {
		try {
			resultat=instruction.executeQuery(requeste);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void MiseAjour(String requeste) {
		try {
			instruction.executeUpdate(requeste);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public boolean suivant() {
		try {
			return resultat.next();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public void arret() {
		try {
			connexion.close();
		}catch(SQLException e){
			e.printStackTrace(); 
		}
	}

}
