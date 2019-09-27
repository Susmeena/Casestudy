package Casestudy.Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  Casestudy.Cucumber.Browserclass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class StepOne {
WebDriver driver;
@Given("^User is on signup page$")
public void user_is_on_signup_page() throws Throwable {
    driver=Browserclass.openBrowser("firefox");
    driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
    Assert.assertEquals(driver.getTitle(), "Home");
    driver.findElement(By.partialLinkText("SignUp")).click();
}

@When("^User enters \"([^\"]*)\" on the user name field$")
public void user_enters_on_the_user_name_field(String arg1) throws Throwable {
	//Assert.assertEquals(driver.getTitle(),"Home");
	  driver.findElement(By.name("userName")).sendKeys("ramya959");
}

@When("^User enters \"([^\"]*)\" on the first name field$")
public void user_enters_on_the_first_name_field(String arg1) throws Throwable {
	 driver.findElement(By.name("firstName")).sendKeys("Susmeena");
}

@When("^User enters \"([^\"]*)\" on the  last name field$")
public void user_enters_on_the_last_name_field(String arg1) throws Throwable {
	driver.findElement(By.name("lastName")).sendKeys("sree");
}

@When("^User enters \"([^\"]*)\" on the password field$")
public void user_enters_on_the_password_field(String arg1) throws Throwable {
	driver.findElement(By.name("password")).sendKeys("Susmeena2");
}

@When("^User enters \"([^\"]*)\" on the confirmpassword field$")
public void user_enters_on_the_confirmpassword_field(String arg1) throws Throwable {
	 driver.findElement(By.name("confirmPassword")).sendKeys("Susmeena2");
}

@When("^User selects \"([^\"]*)\" on the Gender Radio button$")
public void user_selects_on_the_Gender_Radio_button(String arg1) throws Throwable {
	driver.findElement(By.xpath("//input[@type='radio' and @value='Female']")).click();
}

@When("^User enters \"([^\"]*)\" on the email field$")
public void user_enters_on_the_email_field(String arg1) throws Throwable {
	driver.findElement(By.name("emailAddress")).sendKeys("susmeenau@gmail.com");
}

@When("^User enters \"([^\"]*)\" on the mobile number field$")
public void user_enters_on_the_mobile_number_field(String arg1) throws Throwable {
	driver.findElement(By.name("mobileNumber")).sendKeys("9629171749");
}

@When("^User selects \"([^\"]*)\" on the DOB field$")
public void user_selects_on_the_DOB_field(String arg1) throws Throwable {
	driver.findElement(By.name("dob")).sendKeys("09/23/1998");
}

@When("^User enter \"([^\"]*)\" in the address field$")
public void user_enter_in_the_address_field(String arg1) throws Throwable {
	driver.findElement(By.name("address")).sendKeys("Kanyakumari");
}

@When("^User enters \"([^\"]*)\" in the birthplace field$")
public void user_enters_in_the_birthplace_field(String arg1) throws Throwable {
	driver.findElement(By.name("answer")).sendKeys("Nagercoil");
}

@When("^User clicks on Register button$")
public void user_clicks_on_Register_button() throws Throwable {
	driver.findElement(By.name("Submit")).click();
	Assert.assertEquals(driver.getTitle(),"Login");
	driver.close();
}

@Then("^Registration successful and User is on login page$")
public void registration_successful_and_User_is_on_login_page() throws Throwable {
    System.out.println("Registration successful and User is on login page");
}


}
