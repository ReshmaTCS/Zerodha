package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Classes.KitePOM1;
import POM_Classes.KitePOM2;
import POM_Classes.KitePOM3;
import io.cucumber.java.en.*;

public class ZerodhaStep {
	WebDriver driver=null;
	KitePOM1 login1;
	KitePOM2 login2;
	KitePOM3 home;
	@Given("Browser is open on chrome")
	public void browser_is_open_on_chrome() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	@And("User is on login page")
	public void user_is_on_login_page() {
	   driver.get("https://kite.zerodha.com/");
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_dpg458_and_amol(String UN, String PWD) {
	  login1=new KitePOM1(driver);
	  login1.enterUsername(UN);
	  login1.enterPassword(PWD);
	}

	@And("Click on login btn")
	public void click_on_login_btn() {
	 login1.clicklogin();   
	}

	@Then("^User navigate to login2 page and enter (.*)$")
	public void user_navigate_to_login2_page_and_enter(int PIN) {
	String Pin=Integer.toString(PIN);  
	login2=new KitePOM2(driver);
	login2.enterPin(Pin);
	}

	@And("Click on continue btn")
	public void click_on_continue_btn() {
	 login2.clickCntBTN(); 
	}

	@Then("^Verify login sucessfully with (.*)$")
	public void verify_login_sucessfully_with_dpg458(String Userid) {
	  String exptID=Userid;  
	  home=new KitePOM3(driver);
	  String actID=home.ID();
	  if(actID.equals(exptID)) {
		  System.out.println("TC is pass");
	  }
	  else {
		  System.out.println("TC is fail");
	  }
	}


}
