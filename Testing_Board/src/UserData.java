
public class UserData {

	String username;
	String password;
	String role;
	
	public UserData getAdmin() {
        
        username = "TestAdmin"; 
        password = "xxx";
        role = "Admin";
        return this;
    }
     
    public UserData getNormal() {
         
        username = "M18865"; 
        password = "Lotti0099";
        role = "Normal";
        return this;
    }
}
