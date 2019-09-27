package Casestudy.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepFour {
	WebDriver driver;
	WebDriverWait wait;
	String expectedTitle = "View Cart";
	@Given("^User is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		driver=Browserclass.openBrowser("chrome");
		 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("^User enters the login credentials$")
	public void user_enters_the_login_credentials() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"Login");
		driver.findElement(By.name("userName")).sendKeys("Lalitha");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.name("Login")).click();
	}

	@Then("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(),"Home");
	}

	@When("^User enter four characters in find details box$")
	public void user_enter_four_characters_in_find_details_box() throws Throwable {
		//WebElement elem=driver.findElement(By.name("products"));
		//elem.sendKeys(new String[]{"head"});
		 	wait=new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		  driver.findElement(By.id("myInput")).click();
		driver.findElement(By.id("myInput")).sendKeys("head");
	}

	/*@When("^user select the appropriate product$")
	public void user_select_the_appropriate_product() throws Throwable {
	   driver.findElement(By.xpath("//*[@id=\"myInputautocomplete-list\"]/div")).click();
	}*/

	@When("^user clicks on find details button$")
	public void user_clicks_on_find_details_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
		//System.out.println("finddetails");
	}

	@Then("^User is navigate to purchase page and purchase is done$")
	public void user_is_navigate_to_purchase_page_and_purchase_is_done() throws Throwable {
		wait=new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
	    Assert.assertEquals(driver.getTitle(), "Search");
	    System.out.println("sucessfull purchase");
	    driver.close();
	}

	@When("^User enter four characters in find details$")
	public void user_enter_four_characters_in_find_details() throws Throwable {
		wait=new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
		driver.findElement(By.id("myInput")).sendKeys("moto");
	}


@Then("^Zero items found  will be displayed above the search box$")
public void zero_items_found_will_be_displayed_above_the_search_box() throws Throwable {
   String s=driver.findElement(By.xpath("//*[@id=\"itemscount\"]")).getText();
  // System.out.println(s);
   Assert.assertTrue(s.equals("0"));
   System.out.println("Unsucessfull purchase");
   driver.close();
}

	@When("^User enter four characters in the find details box$")
	public void user_enter_four_characters_in_the_find_details_box() throws Throwable {
		wait=new WebDriverWait(driver,100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("myInput")));
		driver.findElement(By.id("myInput")).click();
			driver.findElement(By.id("myInput")).sendKeys("head");
	}

	@When("^user clicks on find detailss button$")
	public void user_clicks_on_find_detailss_button() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
	}

	@When("^Try to proceed without adding any item in the cart$")
	public void try_to_proceed_without_adding_any_item_in_the_cart() throws Throwable {
	//	Assert.assertTrue(Expected.equals(driver.getTitle(),"Can't proceed without adding any item in the cart"));
		Assert.assertFalse("Can't proceed without adding any item in the cart", expectedTitle.equals(driver.getTitle()));
		//System.out.println("crt");
	}

	@Then("^Testme doesn't display the cart icon$")
	public void testme_doesn_t_display_the_cart_icon() throws Throwable {

		System.out.println("Testme doesn't display the cart icon");
		driver.close();
	}



}
