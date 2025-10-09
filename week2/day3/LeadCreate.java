package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeadCreate {

	public static void main(String[] args) throws InterruptedException {
			//ChromeOptions to remove unnecessary notification in chrome
			
			ChromeOptions option=new ChromeOptions();
			option.addArguments("guest");
			
			ChromeDriver driver=new ChromeDriver(option);
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main");
			Thread.sleep(2000);
			driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
		
			Thread.sleep(2000);
			String title=driver.getTitle();
			System.out.println(title);
			String expTitle="Leaftaps - TestLeaf Automation Platform";
			if(title.equals(expTitle)) {
				System.out.println("Login successful");
			}
			//crmsfa click
			driver.findElement(By.id("label")).click();
			
			//lead create
			driver.findElement(By.linkText("Leads")).click();//lead tab
			driver.findElement(By.linkText("Create Lead")).click();//create lead 
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinodha"); //name
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jaganathan");
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
			driver.findElement(By.name("generalProfTitle")).sendKeys("Student");
			driver.findElement(By.className("smallSubmit")).click();
			String actPageTitle=driver.getTitle();
			System.out.println("Page title is " +actPageTitle);
			String expPageTitle="Lead Details | opentaps CRM";
			if(actPageTitle.equals(expPageTitle)) {
				System.out.println("Create Lead Page landed successfully");
			}
			Thread.sleep(5000);
			driver.close();		// TODO Auto-generated method stub

			
	}

}
