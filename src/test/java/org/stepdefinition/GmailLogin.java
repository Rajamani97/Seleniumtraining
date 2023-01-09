package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GmailLogin extends BaseClass {

	@Given("To launch the chrome browser and window maximize")
	public void to_launch_the_chrome_browser_and_window_maximize() {
		LaunchBrowser();
		windowMaximize();
	}

	@When("To launch the url of gmail")
	public void to_launch_the_url_of_gmail() {
		LaunchUrl("https://accounts.google.com/");
		
	}

	@When("To pass the username in email field")
	public void to_pass_the_username_in_email_field() {
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("rajamaniselvam45@gmail.com");
	
	}

	@When("To click the next button")
	public void to_click_the_next_button() {
		WebElement nxt = driver.findElement(By.xpath("//span[text()='Next']"));
		nxt.click();
	}

	@When("To check the Credentials")
	public void to_check_the_Credentials() {
		System.out.println("To  check the credentials... ");

	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		CloseBrowser();
	}

}
