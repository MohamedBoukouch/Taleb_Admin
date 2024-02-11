package BD;

import java.sql.SQLException;

public class ListMessages extends ConnexionDB{

	public ListMessages() {
		lire("SELECT * FROM users");
	}
	
	
	public String users() {
		try {
			return resultat.getString("email");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "Null hhhh";
		}
	}
}
