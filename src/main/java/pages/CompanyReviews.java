package pages;

import org.openqa.selenium.Keys;

import base.Page;

public class CompanyReviews extends Page{
	public void doCompanyReviews(String CompanyName) {
		
		menu.gotoCompanyReviews();
		type("CompanyName_CSS", CompanyName);
		type("CompanyName_CSS", Keys.chord(Keys.ENTER));
		//click("CompanySearchBtn");
	}

}
