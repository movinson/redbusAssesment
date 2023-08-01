package redBus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class contactUsPojo {
	public static WebDriver driver;
	public contactUsPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@id='rYde']")
	private WebElement rydeButton;


	public WebElement rydeButton() {
		return rydeButton;
	}
}







