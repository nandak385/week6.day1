package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteLead extends ParentClass {
	@Given("ClickOn {string}")
	public void clickOn(String linkName){
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@Given("Click on Phone number tab and enter the {string}")
	public void enterPhoneNumber(String PhoneNumber){
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
	}
	
	@Given("Click Find Leads button")
	public void findLead() throws InterruptedException{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
	}
	
	@Given("Select the first row and store the Lead ID")
	public void getLeadID(){
		leadIDDelete = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}
	
	@When("Enter Lead ID and Click Find Leads")
	public void enterIDClickFindLeads() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDDelete);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@Then("Verify whether the Lead ID is available")
	public void leadIDVerification() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	

}
