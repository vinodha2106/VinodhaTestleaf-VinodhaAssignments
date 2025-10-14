package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Instantiate and launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Radio button page verification
		//Button is enabled
		
		driver.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]"))
				.isDisplayed();
		System.out.println("Chrome browser button is displayed");
		
		//To select chrome using xpath location
		
		WebElement selectChromwRadio = driver.findElement(By.xpath("(//div[@class='ui-radiobutton ui-widget'])[12]"));
		selectChromwRadio.click();
		
		//To check chrome is selected
		
		Boolean check = driver
				.findElement(By.xpath("(//span[@class='ui-radiobutton-icon ui-icon ui-icon-blank ui-c'])[9]"))
				.isSelected();
		if (check = true) {
			System.out.println("Chrome is selected:  " +check);
		}
		Thread.sleep(3000);
		
		//To check chrome is unselected and Edge is selected 
		
		WebElement selectEdgeRadio = driver.findElement(By.xpath("//label[text()='Edge']"));
		selectEdgeRadio.click();
		Boolean edgeBrowser=driver.findElement(By.xpath("//label[text()='Edge']")).isSelected();
		if(edgeBrowser = true) {
			System.out.println("Edge Browser is my favourite: " +edgeBrowser);
		}
				
		Boolean safariBrowser=driver.findElement(By.xpath("(//label[contains(text(), 'Safari')])[2]")).isSelected();
		if(safariBrowser = true) {
			System.out.println("Safari is selected as default radio button: " +safariBrowser);
		}
		
		Boolean defaultAge=driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected();
		if(defaultAge = true) {
			System.out.println("Default age is selected as 21-40: " +defaultAge);
		}
		//Need clarification the syso prints false for isSelected()
		//System.out.println("Default age 21-40 is selected,states false if radio is selected: " +driver.findElement(By.xpath("//label[text()='21-40 Years']")).isSelected());
		
		Thread.sleep(4000);
		driver.close();
	}

}
