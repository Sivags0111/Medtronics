package com.StepDefinitions;

import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.time.DurationUtils;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Base.BaseClass_Medtronics;
import com.Manager.Page_Object_Manager;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Medtronics extends BaseClass_Medtronics {

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^the user is on the Medtronic Diabetes India homepage$")
	public void the_user_is_on_the_Medtronic_Diabetes_India_homepage()  {

		url_Launch("https://www.medtronic-diabetes.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^the user navigates to the \"([^\"]*)\"  page$")
	public void the_user_navigates_to_the_page(String arg1) throws InterruptedException  {

		click_element(pom.getInstanceMed().getProducts());
		Thread.sleep(1000);

		click_element(pom.getInstanceMed().getCareLink());
		Thread.sleep(1000);

		click_element(pom.getInstanceMed().getContinueBtn());
		Thread.sleep(1000);

		click_element(pom.getInstanceMed().getLoginToCarelink());
		Thread.sleep(1000);

		String mainWindow = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		for(String handle : windowHandles) {
			if(!handle.equals(mainWindow))
				driver.switchTo().window(handle);
		}

		click_element(pom.getInstanceMed().getCreateAnAccount());
		Thread.sleep(2000);

		click_element(pom.getInstanceMed().getCountry());
		Thread.sleep(2000);
		
//		String mainWindow1 = driver.getWindowHandle();
//		Set<String> windowHandles1 = driver.getWindowHandles();
//		for(String handle1 : windowHandles1) {
//			if(!handle1.equals(mainWindow1))
//				driver.switchTo().window(handle1);
//		}
		

		click_element(pom.getInstanceMed().getCountrySelect());
		Thread.sleep(1000);

		click_element(pom.getInstanceMed().getNextBtn());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPatientBtn());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn1());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getYesBtn1());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn2());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getAge13());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn3());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPersonalData1());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn4());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPersonalData2());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn5());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPersonalData3());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn6());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPersonalData4());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn7());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getPersonalData5());
		Thread.sleep(1000);
		
		click_element(pom.getInstanceMed().getNextBtn8());
		Thread.sleep(1000);
		
		send_values(pom.getInstanceMed().getUsername(), "sivags");
		Thread.sleep(1000);
		
		send_values(pom.getInstanceMed().getNewPassword(), "Pranav@8792");
		
		waitForElementToBeVisible(driver, pom.getInstanceMed().getConfirmPassword(), 20);
		
		send_values(pom.getInstanceMed().getConfirmPassword(), "Pranav@8792");
		Thread.sleep(1000);
		
		send_values(pom.getInstanceMed().getEmail(), "sivags1210@gmail.com");
		Thread.sleep(1000);

	}

	@And("^the user fills in the registration form with valid details$")
	public void the_user_fills_in_the_registration_form_with_valid_details()  {


	}

	@And("^the user agrees to the terms and conditions$")
	public void the_user_agrees_to_the_terms_and_conditions()  {


	}

	@And("^the user clicks the \"([^\"]*)\" button$")
	public void the_user_clicks_the_button(String arg1)  {


	}

	@Then("^the user should see a confirmation message \"([^\"]*)\"$")
	public void the_user_should_see_a_confirmation_message(String arg1)  {


	}
	
}
