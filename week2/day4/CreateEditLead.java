package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateEditLead {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate and Launch browser
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		
		//Login
		
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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf"); //name
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vino");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Yuge");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("VY");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Selenium student");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Student");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("abcd@gmail.com");
		
		WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select nState= new Select(state);
		nState.selectByVisibleText("New York");
		//Creation of lead
		driver.findElement(By.className("smallSubmit")).click();
		Thread.sleep(2000);
		
		//Edit Lead
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description cleared");
		driver.findElement(By.className("smallSubmit")).click();		
		
		//Title of update page
		String updatPageTitle=driver.getTitle();
		System.out.println("Page title is " +updatPageTitle);
		
		Thread.sleep(3000);
		driver.close();
		//
        ///TL (12063)-lead delete
	}

}
