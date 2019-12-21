package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.CompanyReviews;
import pages.FindJobs;
import pages.FindSalaries;
//import pages.SignIn;

public class TopMenu{
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver){
		this.driver = driver;
	}
	
	/*
	public SignIn gotoSignIn() {
		Page.click("signIn_CSS");
		return new SignIn();
	}
	*/
	
	public FindJobs gotoFindJobs() {
		Page.click("findJobs_CSS");
		return new FindJobs();
	}

	public CompanyReviews gotoCompanyReviews() {
		Page.click("companyReviews_CSS");
		return new CompanyReviews();
	}

	public FindSalaries gotoFindSalaries() {
		Page.click("findSalaries_CSS");
		return new FindSalaries();
	}
}
