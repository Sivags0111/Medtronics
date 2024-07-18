package com.Model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Medtronics_Login {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//*[text()='Products']")
	private WebElement products;
	
	@FindBy(xpath = "//*[text()='CareLink']")
	private WebElement careLink;
	
	@FindBy(xpath = "//*[text()='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath = "//*[text()='LOGIN TO CARELINK']")
	private WebElement loginToCarelink;
	
	@FindBy(xpath = "//*[text()=' Create an Account ']")
	private WebElement createAnAccount;
	
	@FindBy(xpath = "(//*[text()='keyboard_arrow_down'])[1]")
	private WebElement country;
	
	@FindBy(xpath = "//*[text()='India']")
	private WebElement countrySelect;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn;
	
	@FindBy(xpath = "//*[@value='PATIENT']")
	private WebElement patientBtn;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn1;
	
	@FindBy(xpath = "//*[@id='r1-page-TOU_APAC_1-radiobutton-yes-input']")
	private WebElement yesBtn1;
	
	@FindBy(xpath = "(//span[text()='Next'])[1]")
	private WebElement nextBtn2;
	
	@FindBy(xpath = "//*[@id='r1-page-LEGAL_AGE_APAC_1-radiobutton-yes-input']")
	private WebElement age13;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn3;
	
	@FindBy(xpath = "//*[@id='r1-page-PS_APAC_1-radiobutton-yes-input']")
	private WebElement personalData1;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn4;
	
	@FindBy(xpath = "//*[@id='r1-page-DEIDENTIFY_APAC_1-radiobutton-no-input']")
	private WebElement personalData2;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn5;
	
	@FindBy(xpath = "//*[@id='r1-page-AGGREGATE_APAC_1-radiobutton-no-input']")
	private WebElement personalData3;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn6;
	
	@FindBy(xpath = "//*[@id='r1-page-SMS_TEXT_APAC_1-radiobutton-no-input']")
	private WebElement personalData4;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn7;
	
	@FindBy(xpath = "//*[@id='r1-page-PATIENT_SMS_CP_APAC-radiobutton-no-input']")
	private WebElement personalData5;
	
	@FindBy(xpath = "//*[text()='Next']")
	private WebElement nextBtn8;
	
	@FindBy(xpath = "//*[@id='r-username']")
	private WebElement username;
	
	@FindBy(xpath = "//*[@id='mat-input-5']")
	private WebElement newPassword;
	
	@FindBy(xpath = "//*[text()=' Confirm new password ']")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//*[@id='r-email']")
	private WebElement email;
	
	public WebElement getPatientBtn() {
		return patientBtn;
	}

	public void setPatientBtn(WebElement patientBtn) {
		this.patientBtn = patientBtn;
	}

	public WebElement getNextBtn1() {
		return nextBtn1;
	}

	public void setNextBtn1(WebElement nextBtn1) {
		this.nextBtn1 = nextBtn1;
	}

	public WebElement getYesBtn1() {
		return yesBtn1;
	}

	public void setYesBtn1(WebElement yesBtn1) {
		this.yesBtn1 = yesBtn1;
	}

	public WebElement getNextBtn2() {
		return nextBtn2;
	}

	public void setNextBtn2(WebElement nextBtn2) {
		this.nextBtn2 = nextBtn2;
	}

	public WebElement getAge13() {
		return age13;
	}

	public void setAge13(WebElement age13) {
		this.age13 = age13;
	}

	public WebElement getNextBtn3() {
		return nextBtn3;
	}

	public void setNextBtn3(WebElement nextBtn3) {
		this.nextBtn3 = nextBtn3;
	}

	public WebElement getPersonalData1() {
		return personalData1;
	}

	public void setPersonalData1(WebElement personalData1) {
		this.personalData1 = personalData1;
	}

	public WebElement getNextBtn4() {
		return nextBtn4;
	}

	public void setNextBtn4(WebElement nextBtn4) {
		this.nextBtn4 = nextBtn4;
	}

	public WebElement getPersonalData2() {
		return personalData2;
	}

	public void setPersonalData2(WebElement personalData2) {
		this.personalData2 = personalData2;
	}

	public WebElement getNextBtn5() {
		return nextBtn5;
	}

	public void setNextBtn5(WebElement nextBtn5) {
		this.nextBtn5 = nextBtn5;
	}

	public WebElement getPersonalData3() {
		return personalData3;
	}

	public void setPersonalData3(WebElement personalData3) {
		this.personalData3 = personalData3;
	}

	public WebElement getNextBtn6() {
		return nextBtn6;
	}

	public void setNextBtn6(WebElement nextBtn6) {
		this.nextBtn6 = nextBtn6;
	}

	public WebElement getPersonalData4() {
		return personalData4;
	}

	public void setPersonalData4(WebElement personalData4) {
		this.personalData4 = personalData4;
	}

	public WebElement getNextBtn7() {
		return nextBtn7;
	}

	public void setNextBtn7(WebElement nextBtn7) {
		this.nextBtn7 = nextBtn7;
	}

	public WebElement getPersonalData5() {
		return personalData5;
	}

	public void setPersonalData5(WebElement personalData5) {
		this.personalData5 = personalData5;
	}

	public WebElement getNextBtn8() {
		return nextBtn8;
	}

	public void setNextBtn8(WebElement nextBtn8) {
		this.nextBtn8 = nextBtn8;
	}

	
	public WebElement getProducts() {
		return products;
	}

	public void setProducts(WebElement products) {
		this.products = products;
	}

	public WebElement getCareLink() {
		return careLink;
	}

	public void setCareLink(WebElement careLink) {
		this.careLink = careLink;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}

	public WebElement getLoginToCarelink() {
		return loginToCarelink;
	}

	public void setLoginToCarelink(WebElement loginToCarelink) {
		this.loginToCarelink = loginToCarelink;
	}

	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}

	public void setCreateAnAccount(WebElement createAnAccount) {
		this.createAnAccount = createAnAccount;
	}

	public WebElement getCountry() {
		return country;
	}

	public void setCountry(WebElement country) {
		this.country = country;
	}

	public WebElement getCountrySelect() {
		return countrySelect;
	}

	public void setCountrySelect(WebElement countrySelect) {
		this.countrySelect = countrySelect;
	}

	public WebElement getNextBtn() {
		return nextBtn;
	}

	public void setNextBtn(WebElement nextBtn) {
		this.nextBtn = nextBtn;
	}

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(WebElement newPassword) {
		this.newPassword = newPassword;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(WebElement confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public Medtronics_Login(WebDriver abc) {
		driver = abc;
		
		PageFactory.initElements(driver, this);
	}
}
