package com.calc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Calculator {
	
	public Calculator()
	{
		System.out.println("Calling constructor");
	}

	public void add() {
		System.out.println("Addition Done");
	}
	public void subtract() {
		System.out.println("subtraction Done");
	}
	public void multi()
	{
		System.out.println("Multiplication");
	}

	public static void main(String[] orgs) {
		System.setProperty("webdriver.gecko.driver", "/home/synerzip/Downloads/geckodriver-v0.26.0-linux64/geckodriver"); 
		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.way2automation.com");
		System.out.println("Hello");
		Calculator calc= new Calculator();
		calc.add();
		calc.subtract();

	}

}
