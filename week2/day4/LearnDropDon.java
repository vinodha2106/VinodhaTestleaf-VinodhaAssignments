package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnDropDon {
	public static void main(String[] args) throws InterruptedException {
		// ChromeOptions to remove unnecessary notification in chrome

		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("label")).click();
		String title = driver.getTitle();
		System.out.println(title);
		String expTitle = "My Home | opentaps CRM";
		if (title.equals(expTitle)) {
			System.out.println("Login successful");
		}
		// lead create
		driver.findElement(By.linkText("Leads")).click();// lead tab
		driver.findElement(By.linkText("Create Lead")).click();// create lead
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vinoo"); // name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sOption = new Select(source);
		sOption.selectByVisibleText("Employee");

		WebElement market = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select mOption = new Select(market);
		mOption.selectByIndex(2);
		
		WebElement coOper = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select cOption = new Select(coOper);
		cOption.selectByVisibleText("Corporation");

		driver.findElement(By.className("smallSubmit")).click();
		String actPageTitle = driver.getTitle();
		System.out.println("Page title is " + actPageTitle);
		String expPageTitle = "Page title is View Lead | opentaps CRM";
		if (actPageTitle.equals(expPageTitle)) {
			System.out.println("Creation Lead is successful");
		}
		Thread.sleep(5000);
		driver.close(); // TODO Auto-generated method stub

	}

}
