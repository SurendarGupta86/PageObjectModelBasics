package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.CompanyReviews;
import pages.FindSalaries;
import utilities.Utilities;

public class FindSalariesTest {
	
	
	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void doFindSalariesTest(Hashtable<String,String> data) throws InterruptedException {
		
		FindSalaries fs = new FindSalaries();
		fs.doFindSalaries(data.get("CompanyTitle"));

	}

}
