package redBus;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePojo {
	public static WebDriver driver;
	public HomePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "div[xpath='1']")
	private WebElement fromPlace;

	@FindBy(css = "value[xpath='1']")
	private WebElement toPlace;

	@FindBy(css = "span[xpath='1']")
	private WebElement dateTravel;

	@FindBy(css = "button[id='search_button']")
	private WebElement searchButton;

	@FindBy(linkText = "Contact Us")
	private WebElement contactUsLink;

	@FindBy(xpath = "//img[@alt='redbus_twitter']")
	private WebElement twitterButton;

	/////////////////////////////////

	public WebElement fromPlace() {
		return fromPlace;
	}

	public WebElement toPlace() {
		return toPlace;
	}

	public WebElement dateTravel() {
		return dateTravel;
	}

	public WebElement searchButton() {
		return searchButton;
	}


	public void scrollToEndOfHomePage() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	public WebElement contactUsLink() {
		return contactUsLink;
	}
	public WebElement twitterButton() {
		return twitterButton;
	}
}



