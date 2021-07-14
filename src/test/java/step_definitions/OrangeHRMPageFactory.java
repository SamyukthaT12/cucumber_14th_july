package step_definitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRMPageFactory {
public WebDriver driver;
@FindBy(id="txtUsername") WebElement username;
@FindBy(id="txtPassword") WebElement password;
@FindBy(id="btnLogin") WebElement loginbuttn;
@FindBy(id="welcome") WebElement text;
@FindBy(id="menu_pim_viewPimModule") WebElement PIM;
@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[2]/td[3]/a") WebElement empname;
@FindBy(id="btnSave") WebElement edit;
@FindBy(id="personal_txtEmpFirstName") WebElement fname;
@FindBy(id="personal_optGender_2") WebElement gender;
@FindBy(id="personal_cmbMarital") WebElement Mstatus;
@FindBy(id="btnSave") WebElement save;
@FindBy(id="menu_pim_viewEmployeeList") WebElement emplist;
@FindBy(name="empsearch[employee_name][empName]") WebElement employeename;
@FindBy(id="searchBtn") WebElement search;
@FindBy(id="welcome") WebElement welmsg;
@FindBy(xpath="//*[@id=\"welcome-menu\"]/ul/li[3]/a") WebElement logout;
public OrangeHRMPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	public void setPfusername(String uname) {
		username.sendKeys(uname);
	}
	
	public void setPfpassword(String passwd) {
		password.sendKeys(passwd);
	}
	
	public void setPfloginbutton() {
		loginbuttn.click();
	}
	
	public void setPftext() {
		text.getText();
	}
	
	public void setPfPIM() {
		PIM.click();
	}
	
	public void setPfempname() {
		empname.click();
	}
	
	public void setPfeditbutton() {
		edit.click();
	}
	
	public void setPffname(String strfname) {
		fname.clear();
		fname.sendKeys(strfname);
	}
	
	public void setPfgender() {
		gender.click();
	}
	
	public void setPfMstatus(String strMstatus) {
		Select status = new Select(Mstatus);
		status.selectByVisibleText(strMstatus);		
	}
	
	public void setPfsavebutton() {
		save.click();
	}
	
	public void setPfemplist() {
		emplist.click();
	}
	
	public void setPfemployeename(String stremployeename) {
		employeename.sendKeys(stremployeename);
	}
	
	public void setPfsearchbutton() {
		search.click();
	}
	
	public void setPfwelcomemsg() {
		welmsg.click();
	}
	
	public void setPflogout() {
		logout.click();
	}
	
	
	//#getters
	
	public WebElement getPfusername() {
		return username;
	}
	
	public WebElement getPfpassword() {
		return password;
	}
	
	public WebElement getPfloginbutton() {
		return loginbuttn;
	}
	
	public WebElement getPftext() {
		return text;
	}
	

}
