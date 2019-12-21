package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

import base.Page;

public class FindSalaries extends Page{
	public void doFindSalaries(String CompanyTitle) throws InterruptedException {
		menu.gotoFindSalaries();
		type("CompanyTitle_CSS", CompanyTitle);
		Thread.sleep(2000);
		type("CompanyTitle_CSS", Keys.chord(Keys.ENTER));
		Thread.sleep(2000);
		//click("CompanyTitleSearchBtn_CSS");
		
	}

}
