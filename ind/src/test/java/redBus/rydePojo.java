package redBus;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class rydePojo {
	public static WebDriver driver;
	public rydePojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private WebElement moreAboutRydeSection;

	@FindBy(xpath = "//*[@class='ytp-large-play-button ytp-button ytp-large-play-button-red-bg']")
	private WebElement playVideoButton;


	public void scrollToMoreAboutRydeSection() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", moreAboutRydeSection);
	}

	public WebElement playVideoInMoreAboutRydeSection() {
		return playVideoButton;
	}
}
