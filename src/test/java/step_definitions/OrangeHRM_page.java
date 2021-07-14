package step_definitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_page {
WebDriver driver;
private OrangeHRMPageFactory orgpg;

@Before
public void open_Browser() {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium_jarfiles\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	orgpg = new OrangeHRMPageFactory(driver);
	orgpg = PageFactory.initElements(driver, OrangeHRMPageFactory.class);
}
	@Given("User navigate to the OrangeHRM Demo site")
	public void user_navigate_to_the_OrangeHRM_Demo_site() {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("User enters {string} and {string} and clicks on login button")
	public void user_enters_and_and_clicks_on_login_button(String uname, String passwd) throws Throwable {
	    orgpg.setPfusername(uname);
	    orgpg.setPfpassword(passwd);
	    orgpg.setPfloginbutton();
	    Thread.sleep(1000);
	}

	@Then("User successfully loggedin and OrangeHRM Demo site dashboard displayed")
	public void user_successfully_loggedin_and_OrangeHRM_Demo_site_dashboard_displayed() throws Throwable {
		orgpg.setPftext();
		Thread.sleep(1000);
		//System.out.println();
	   String title = driver.getTitle();
	   System.out.println(title);
	   Thread.sleep(1000);
	   //driver.close();
	}
	
	@Then("User clicks PIM option")
	public void user_clicks_PIM_option() {
	    orgpg.setPfPIM();
	}

	@Then("User navigates to PIM page")
	public void user_navigates_to_PIM_page() {
	    driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
	    
	}
	
	@Then("User clicks on employee name")
	public void user_clicks_on_employee_name() {
	    orgpg.setPfempname();
	}

	@Then("User navigates to personal details page and clicks on edit button")
	public void user_navigates_to_personal_details_page_and_clicks_on_edit_button() {
	    orgpg.setPfeditbutton();
	}

	@Then("User enters all the required details and click on save button")
	public void user_enters_all_the_required_details_and_click_on_save_button() throws Throwable {
	    orgpg.setPffname("Samyuktha");
	    Thread.sleep(1000);
	    orgpg.setPfgender();
	    Thread.sleep(1000);
	    orgpg.setPfMstatus("Single");
	    Thread.sleep(1000);
	    orgpg.setPfsavebutton();
	    Thread.sleep(1000);
	}

	@Then("User navigates to PIM page and enter employee name")
	public void user_navigates_to_PIM_page_and_enter_employee_name() throws Throwable {
	    orgpg.setPfemplist();
	    Thread.sleep(1000);
	    orgpg.setPfemployeename("Samyuktha");
	    Thread.sleep(1000);
	    
	}

	@Then("User clicks on search button")
	public void user_clicks_on_search_button() {
	    orgpg.setPfsearchbutton();
	}
	
	@Then("User navigates to searched employee page and clicks on welcome message")
	public void user_navigates_to_searched_employee_page_and_clicks_welcome_msg() {
		orgpg.setPfwelcomemsg();
	}
	
	@Then("User clicks on logout option")
	public void user_clicks_on_logout() {
		orgpg.setPflogout();
		driver.close();
	}

}
