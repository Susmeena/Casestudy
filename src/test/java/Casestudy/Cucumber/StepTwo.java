package Casestudy.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import  Casestudy.Cucumber.Browserclass;
public class StepTwo {
	WebDriver driver;
	WebDriverWait wait;

@Given("^user is on the login page$")
public void user_is_on_the_login_page() throws Throwable {
	driver=Browserclass.openBrowser("firefox");
	 driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	driver.findElement(By.linkText("SignIn")).click();
}

@When("^user enters \"([^\"]*)\" on user name field$")
public void user_enters_on_user_name_field(String arg1) throws Throwable {
	Assert.assertEquals(driver.getTitle(),"Login");
	  driver.findElement(By.name("userName")).sendKeys(arg1);
}

@When("^User enters \"([^\"]*)\" on the  password field$")
public void user_enters_on_the_password_field(String arg1) throws Throwable {
	driver.findElement(By.name("password")).sendKeys(arg1);
}

@When("^User clicks on  login button$")
public void user_clicks_on_login_button() throws Throwable {
	driver.findElement(By.name("Login")).click();
	  wait=new WebDriverWait(driver,100);
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
	  Assert.assertEquals(driver.getTitle(), "Home");
	  System.out.println("Login Sucessfull");
	  driver.close();
}

@Then("^user is navigate to the home page$")
public void user_is_navigate_to_the_home_page() throws Throwable {
	Assert.assertEquals(driver.getTitle(), "Home");
    
}



}
