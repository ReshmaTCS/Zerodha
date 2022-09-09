package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePOM2 {
@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
@FindBy(xpath = "//button[text()='Continue ']") private WebElement CntBTN;
public KitePOM2(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void enterPin(String PIN) {
	Pin.sendKeys(PIN);
}
public void clickCntBTN() {
	CntBTN.click();
}
}
