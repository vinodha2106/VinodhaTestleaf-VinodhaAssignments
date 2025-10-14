package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LGButtonInteractionUsingSelenium {

	public static void main(String[] args) throws InterruptedException {
		// Instantiate and launch browser
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String dashTitle = driver.getTitle();
		System.out.println("Landed Page is :" + dashTitle);

		Thread.sleep(3000);

		// Navigate back to https://leafground.com/button.xhtml screen

		driver.navigate().back();

		// ‘Confirm if the button is disabled
		Boolean button = driver.findElement(By.xpath("//h5[text()='Confirm if the button is disabled.']")).isEnabled();
		if (button = true) {
			System.out.println("Confirm if the button is disabled : " + button);
		}

		// Submit button location
		WebElement submitButton = driver.findElement(By.xpath("//span[text()='Submit']"));
		Point sButton = submitButton.getLocation();

		System.out.println("Submit *Find the position of the Submit button* X location: " + sButton.getX());
		System.out.println("Submit *Find the position of the Submit button* X location: " + sButton.getY());

		// Save button -print the color

		WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
		String color = saveButton.getCssValue("Save");
		System.out.println("The background color of the button SAVE is : " + color);

		// Find the height and width of this button
		WebElement submit1Button = driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
		Dimension subButton = submit1Button.getSize();

		System.out.println("Height of button is : " + subButton.getHeight() + "pixel");
		System.out.println("Height of button is : " + subButton.getWidth() + "pixel");

		Thread.sleep(4000);
		driver.close();

	}

}
