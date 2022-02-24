package test3;

import org.testng.annotations.*;
public class TestNGDataProviderExample {

	@DataProvider(name="userlist")
	public Object[][] dataProvide(){
		
		return new Object[][] {{"jack","jack123"},
			{"king","king123"},
			{"jam","jam123"}};
	}
	
	@DataProvider(name="userAge")
	public Object[][] dataUserAge(){
		
		return new Object[][] {{"jack","jack123",24},
			{"king","king123",40},
			{"jam","jam123",60}};
	}
	
	@Test(dataProvider = "userlist")
	public void loginTest(String user,String pass) {
		System.out.println("User name -> "+user +" Password ->"+pass);
	}
	
	@Test(dataProvider = "userAge")
	public void loginAgeTest(String user,String pass,int age) {
		System.out.println("User name -> "+user +" Password ->"+pass +" Age->"+age);	
	}
}
