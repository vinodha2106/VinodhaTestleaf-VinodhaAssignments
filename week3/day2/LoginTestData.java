package week3.day2;

//subclass extends from TestData base class
public class LoginTestData extends TestData { 
	
	//Method creation
	   public String username(String username) {
		   System.out.println("Username: " +username);
		   return username;
	   }
	   
	   public String password(String password) {
		   System.out.println("Password: "+password);
		   return password;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginTestData login=new LoginTestData();
		login.enterCredentials();
		login.username("Vino");
		login.password("abcd");
		login.navigateToHomePage();
		

	}

}
