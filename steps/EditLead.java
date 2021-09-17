package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLead extends ParentClass {

	@Given("Click on the {string} link")
	public void clickOnFindLead(String findAndEditLead) {
		driver.findElement(By.linkText(findAndEditLead)).click();
	}
	
	@Given("Click on Phone tab")
	public void clickOnButton( ) {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
	}
	
	@Given("Enter the Phone Number as {string}")
	public void clickOnTab(String phoneNumber) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNumber);
	}
	
	@Given("Click on Find lead button")
	public void clickOnFindLead() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}

	@Given("Click on First Lead link")
	public void clickOnFirstDisplayedLink()	{
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@Given("Enter the Company Name as {string}")
	public void enterCompanyName(String companyName) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(companyName);
	}
	
	@When("Click on Submit button")
	public void clickOnSubmit() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("Verify the Portlet name")
	public void verifyPortletName() {
		 String actPotrletName = driver.findElement(By.xpath("//div[@id='sectionHeaderTitle_leads']")).getText();
		 String expPortletName = "View Lead";
		 Assert.assertEquals(actPotrletName, expPortletName);
		 }
	
}

