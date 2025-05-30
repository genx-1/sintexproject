package day44;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependancyMethod {
@Test(priority = 1)
	void openapp() {
		Assert.assertEquals(true, true);
	}
	
@Test(priority = 2, dependsOnMethods = {"openapp"})
	void login() {
		Assert.assertEquals(true, true);
	}
	
@Test (priority = 3, dependsOnMethods = {"openapp"})
	void search () {
		Assert.assertEquals(true, true);
	}
	
@Test (priority = 4, dependsOnMethods = {"login"})
	void advancesearch() {
		Assert.assertEquals(true, false);
	}
	
@Test (priority = 5, dependsOnMethods = {"advancesearch"})
	void logout() {
		Assert.assertEquals(true, true);	
	}
	
	
	
	//jar openapp method fail zali ani login method openapp 
//method  var depen hoti mhanun ti skip zali ani search, advancesearch ani lodout
//methods login var depen hotya tar khalchya char pan method skip hotat
	
	
//jar method fail zali tar jya method fail method vat depen hotya tya skip hotat	
	
//method fail ho pass hon he tichya execution var depend aahe pan skip hon he ti jya method
//var depend aahe tichya fail honyavar depend aahe
	
	
	
	
	
	
}
