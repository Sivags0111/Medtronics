package com.Manager;

import org.openqa.selenium.WebDriver;

import com.Model.Medtronics_Login;

public class Page_Object_Manager {

	private WebDriver driver;


	private Medtronics_Login Dp;

	public Medtronics_Login getInstanceMed() {

		if(Dp == null) {

			Dp= new Medtronics_Login(driver);
		}
		return Dp;
	}

	public Page_Object_Manager(WebDriver driver2) {

		driver = driver2;

	}


}
