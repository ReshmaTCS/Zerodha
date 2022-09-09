package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOM3 {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement verifuUserid;
	public KitePOM3(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public String ID() {
		String actID=verifuUserid.getText();
		return actID;
	}
}
