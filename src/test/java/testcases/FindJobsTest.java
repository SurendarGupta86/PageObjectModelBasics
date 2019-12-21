package testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import pages.FindJobs;
import utilities.Utilities;

public class FindJobsTest{

	@Test(dataProviderClass = Utilities.class, dataProvider = "dp")
	public void doFindJobsTest(Hashtable<String,String> data) {
		
		FindJobs fi = new FindJobs();
		fi.doFindJobs(data.get("searchtext"), data.get("location"));

	}
}
