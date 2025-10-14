package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeadusingxpathaxes {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("guest");

		// Instantiate and Launch browser
		ChromeDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);

		// Login to portal
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		// crmsfa click
		driver.findElement(By.id("label")).click();

		// lead find
		driver.findElement(By.linkText("Leads")).click();// lead tab
		driver.findElement(By.linkText("Find Leads")).click();// find lead
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("984366414");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// to select 1st result of list
		Thread.sleep(4000);
		WebElement firleadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String liId = firleadId.getText();
		System.out.println("First ID of Lead is " + liId);
		firleadId.click();

		// To delete the lead
		Thread.sleep(4000);
		System.out.println("Id going to be deleted");
		driver.findElement(By.linkText("Delete")).click();

		// Enter captured lead id
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.name("id")).sendKeys(liId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);

		// Verify deletion message
		WebElement capMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
		String conMessage = capMessage.getText();
		System.out.println("Confirmation message:" + conMessage);
		String expMessage = "No records to display";
		if (conMessage.equals(expMessage)) {
			System.out.println("Successful deletion");
		} else {
			System.out.println("Error in deletion");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
