package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.CompanyReviews;
import pages.FindJobs;
import utilities.Utilities;

public class CompanyReviewsTest {
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void doCompanyReviewsTest(Hashtable<String,String> data) {
		
		CompanyReviews cr = new CompanyReviews();
		cr.doCompanyReviews(data.get("CompanyName"));

	}

}
