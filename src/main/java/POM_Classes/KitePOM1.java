package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOM1 {
@FindBy(xpath = "//input[@id='userid']") private WebElement Username;
@FindBy(xpath = "//input[@id='password']") private WebElement Password;
@FindBy(xpath = "//button[text()='Login ']") private WebElement Login;
public KitePOM1(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterUsername(String UN) {
	Username.sendKeys(UN);
}
public void enterPassword(String PWD) {
	Password.sendKeys(PWD);
}
public void clicklogin() {
	Login.click();
}
}
