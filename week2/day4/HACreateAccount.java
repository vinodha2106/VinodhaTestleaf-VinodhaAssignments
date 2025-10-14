package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class HACreateAccount {

	public static void main(String[] args) throws InterruptedException {

		// Instantiate and Launch Browser
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");

		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Login to portal
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();

		System.out.println("Login to Testleaf Successful");
		System.out.println("Going to Account Creation Page");
		// Create Account
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Yyugendar");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		WebElement ind = driver.findElement(By.name("industryEnumId"));
		Select sIndustry = new Select(ind);
		sIndustry.selectByIndex(4);

		WebElement sCorp = driver.findElement(By.name("ownershipEnumId"));
		Select sCorps = new Select(sCorp);
		sCorps.selectByVisibleText("S-Corporation");

		// dataSourceId
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select sOption = new Select(source);
		sOption.selectByValue("LEAD_EMPLOYEE");

		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select mIC = new Select(market);
		mIC.selectByIndex(6);

		WebElement texas = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select texasState = new Select(texas);
		texasState.selectByValue("TX");

		driver.findElement(By.className("smallSubmit")).click();
		String actPageTitle = driver.getTitle();
		System.out.println("Page title is " + actPageTitle);

		WebElement accountName = driver.findElement(By.xpath("(//span[@class='tabletext'])[3]"));
		String aName = accountName.getText();
		System.out.println("Confirmation message:" + aName);
		Thread.sleep(5000);
		driver.close();
	}

}
