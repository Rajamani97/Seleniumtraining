package org.stepdefinition;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PositiveandNegative extends BaseClass {

	@Given("user launch the chrome browser and window maximize")
	public void user_launch_the_chrome_browser_and_window_maximize() {
		LaunchBrowser();
		windowMaximize();
	}

	@When("user hit the url")
	public void user_hit_the_url() {
		LaunchUrl("https://accounts.google.com/");
	}

	@When("user send the username {string} in email field")
	public void user_send_the_username_in_email_field(String p) {
		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys(p);

	}

	@When("user click the next button")
	public void user_click_the_next_button() {
		WebElement nxt = driver.findElement(By.xpath("//span[text()='Next']"));
		nxt.click();
	}

	@When("user to check the credentials of result")
	public void user_to_check_the_credentials_of_result() {
		System.out.println("To  check the credentials... ");

	}

	@Then("user to close the browser")
	public void user_to_close_the_browser() {
		CloseBrowser();
	}

}
