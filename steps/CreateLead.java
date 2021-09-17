package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends ParentClass{
	
	@Given("Click on {string} link")
	public void ClickCreateLeadMenu(String link) {
		driver.findElement(By.linkText(link)).click();
	}
	
	@Given("Enter the Company name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
	}
	
	@Given("Enter the First name as {string}")
	public void enterFirstName(String firstName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
	}
	
	@Given("Enter the Last name as {string}")
	public void enterLastName(String lastName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
	}
	
	@Given("Enter the Phone number as {string}")
	public void enterPhoneNumber(String phoneNumber) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNumber);
	}
	
	@When("Click on {string} button")
	public void clickCreateLeadButton(String button) {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the {string} Name is displayed")
	public void verifyPortletName(String portletName) {
		String actualPortletName = "View Lead";
		String expectedPortletName = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		Assert.assertEquals(actualPortletName, expectedPortletName);
	}
	
	@But("Should display error message")
	public void errorMessage() {
		String title2 = driver.getTitle();
		 if(title2.contains("TestLeaf Automation Platform"))
			 System.out.println("Home Page");
		 else
			 System.out.println("Not in home page");
	}
	
}