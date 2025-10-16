package week3.day3;

public class JavaConnection implements DatabaseConnection {
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("I am connect method");
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("I am disconnect method");

	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("I am execute update method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaConnection con = new JavaConnection();
		con.connect();
		con.disconnect();
		con.executeUpdate();
	}
}
