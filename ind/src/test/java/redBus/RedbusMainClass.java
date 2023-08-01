package redBus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedbusMainClass {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");

		HomePojo hp = new HomePojo();
		ticketPojo tp = new ticketPojo();
		contactUsPojo cp = new contactUsPojo();
		rydePojo rp = new rydePojo();

		hp.fromPlace().sendKeys("Indore");
		hp.toPlace().sendKeys("Pune");
		hp.dateTravel().sendKeys("01-12-2023");
		hp.searchButton().click();

		tp.goToHomePage();

		hp.scrollToEndOfHomePage();
		hp.contactUsLink().click();

		cp.rydeButton().click();

		rp.scrollToMoreAboutRydeSection();
		rp.playVideoInMoreAboutRydeSection();
		driver.navigate().back();

		hp.scrollToEndOfHomePage();
		hp.twitterButton().click();

		driver.quit();
	}

}
