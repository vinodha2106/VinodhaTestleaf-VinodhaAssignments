package week3.day3;

public class RemoteWebDriver implements WebDriver{

	//here the class is concrete where we can create a obj and call the interface methods
	
	@Override
	public void findElement() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findElements() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		RemoteWebDriver remote=new RemoteWebDriver();
		remote.findElement();
		remote.findElements();
		remote.submit();
		//remote.click(); didnt work bcoz its static method
	}

}
