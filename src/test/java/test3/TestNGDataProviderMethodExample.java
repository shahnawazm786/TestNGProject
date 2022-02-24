package test3;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class TestNGDataProviderMethodExample {


	@DataProvider(name="userlist")
	public Object[][] dataProvide(Method m){
		if(m.getName().equalsIgnoreCase("loginTest")) {
		
		return new Object[][] {{"jack","jack123"},
			{"king","king123"},
			{"jam","jam123"}};
		}
		else if(m.getName().equalsIgnoreCase("loginAgeTest")) {
			return new Object[][] {{"md","md123",18},
				{"mohd","mohdd123",28},
				{"mohamad","mohamad123",38}
			
			};
		}
		else {
			return new Object[][] {{"you have wrong method name"}};
		}
	}
	
	@Test(dataProvider = "userlist")
	public void loginTest(String user,String pass) {
		System.out.println("User name -> "+user +" Password ->"+pass);
	}
	
	@Test(dataProvider = "userlist")
	public void loginAgeTest(String user,String pass,int age) {
		System.out.println("User name -> "+user +" Password ->"+pass +" Age->"+age);	
	}
	
	
}
