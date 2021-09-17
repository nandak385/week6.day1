//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.But;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginValidation extends ParentClass {
//
//	@Given("Enter the username as {string}")
//	public void enterUserName(String username) {
//		driver.findElement(By.id("username")).sendKeys(username);
//
//	}
//
//	@Given("Enter the password as {string}")
//	public void enterPassword(String password) {
//		driver.findElement(By.id("password")).sendKeys(password);
//
//	}
//
//	@When("Click on login button")
//	public void clickLogin() {
//		driver.findElement(By.className("decorativeSubmit")).click();
//
//	}
//	@Then("Homepage should be displayed")
//	public void verifyHomepage() {
//
//		boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
//		Assert.assertTrue(displayed);
//	}
//	@When("Click on CRMSFA")
//	public void clickCRM() {
//		driver.findElement(By.linkText("CRM/SFA")).click();
//
//	}
//	@When("Click on Leads link")
//	public void LeadsClick() {
//		driver.findElement(By.linkText("Leads")).click();
//
//	}
//
//
//	@But("Error message should be Invalid username or password")
//	public void verifyErrorMessage() {
//
//		System.out.println("Invalid username or password.Can you check your credentials");
//
//	}
//
//}
