package day44;

import org.testng.annotations.Test;

public class loginTests {

	@Test(priority=1, groups= {"sanity"})
	void loginByEmail() {
		System.out.println("This is login by email");
	}
	
	@Test(priority=2, groups= {"sanity"})
void loginByFacebook() {
		System.out.println("This is login by facebook");	
	}
	
	@Test(priority=3, groups= {"sanity"})
void loginByTwitter() {
		System.out.println("This is login by twitter");
}
	
	
	/*
	LoginByFacebook - sanity
	LoginByemail- sanity
	LoginBytwitter - sanity
	
	signupByFacebook - regression
	signupByemai - regression
	signupBytwitter - regression
	
	paymentInRupees - sanity, regression (functional)
	paymentIndollar - sanity, regression (functional)
	
	*/
	
}
