package pack2;

import org.testng.annotations.Test;

public class ContactTest {

	@Test
	public void createContactTest() {
		
		String Url = System.getProperty("url");
		//here the user is forgot to provide the data in Cmd line of browser so 
		//it is taking from the chrome as parameter
		String Browser = System.getProperty("browser", "chrome");
		String Username = System.getProperty("username");
		String Password = System.getProperty("password");
		
		
		System.out.println(Url + Browser + Username + Password);
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
		
		System.out.println("execute createContactTest");
	}
	
	@Test
	public void modifyContactTest() {
		System.out.println("execute modifyContactTest");
	}
	
	@Test
	public void deleteContactTest() {
		System.out.println("execute deleteContactTest");
	}
}
