package steps;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MergeLead extends ParentClass {
	@Given("Click_on {string} link")
	public void click_On(String link) {
		driver.findElement(By.linkText(link)).click();
	}

	@Given("Click on the Lookup icon {string} child window opens")
	public void clickOnLookUps(String number) {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])["+number+"]")).click();
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}

	@Given("Enter first name as {string} and click on Find Leads button")
	public void enterNameAndSearch(String firstName) throws InterruptedException {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstName);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
	}

	@Given("Select the first row and save the lead id")
	public void gettingLeadID() {
		leadIDMerge = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}

	@Given("Select the first row")
	public void selectFirstLink() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
	}

	@Given("Click on Merge button and click ok on the popup")
	public void clickMerge() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		driver.switchTo().alert().accept();
	}

	@When("Enter lead id and click Find leads")
	public void findLeadID() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadIDMerge);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}

	@Then("Verify whether the Lead ID is still available")
	public void verifyLeadID() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}



}
