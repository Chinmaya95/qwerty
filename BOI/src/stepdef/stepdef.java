package stepdef;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdef {
	
	WebDriver d;

	@Given("^Open boi web site$")
	public void open_boi_web_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\BDD Jar Files\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
		d.get("https://www.bankofindia.co.in/");
		d.manage().window().maximize();
		Thread.sleep(5000);
//		String h1 = d.getWindowHandle();// original 
//		System.out.println("First handle = " + h1);
		d.findElement(By.cssSelector("body > div > div.col-sm-3.sidewrap > div > div > div.accordingcontent.active > div > div.viewport > div > ul > li:nth-child(1) > a")).click();
		String parentWindow = d.getWindowHandle();
		Set<String> handles =  d.getWindowHandles();
		   for(String windowHandle  : handles)
		       {
		       if(!windowHandle.equals(parentWindow))
		          {
		          d.switchTo().window(windowHandle);
		  		d.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(1) > div > input[type=\"button\"]")).click();
		          }
		       }
		   d.switchTo().window("");
		Thread.sleep(3000);
//		String h2 = d.getWindowHandle();
//		System.out.println("Second handle = " + h2);
//	    throw new PendingException();
	}

	@When("^user input name \"([^\"]*)\"$")
	public void user_input_name(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.switchTo().window("");
		Thread.sleep(5000);
		d.findElement(By.xpath("//*[@id='CorporateSignonCorpId']")).sendKeys(arg1);
//	    throw new PendingException();
	}

	@When("^user input  password \"([^\"]*)\"$")
	public void user_input_password(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//*[@name='CorporateSignonPassword']")).sendKeys(arg1);
		d.findElement(By.xpath("//*[@id='button1']")).click();
//	    throw new PendingException();
	}

	@Then("^Login should be successful$")
	public void login_should_be_successfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.switchTo().alert().accept();
		d.switchTo().window("");
		boolean a=d.findElement(By.linkText("Logout")).isDisplayed();
		if(a)
			System.out.println("Login success for valid name and address");
		else
			System.out.println("Login not success");
//	    throw new PendingException();
	}
}
