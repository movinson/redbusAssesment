package redBus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ticketPojo {
	public static WebDriver driver;
	public ticketPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div[1]/img[1]")
	private WebElement logoImage;

	public WebElement goToHomePage() {
		return logoImage;
	}

	
}




