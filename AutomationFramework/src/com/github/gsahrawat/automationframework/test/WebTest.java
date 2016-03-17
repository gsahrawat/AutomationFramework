package com.github.gsahrawat.automationframework.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver cd = new ChromeDriver();
		//cd.get("https://github.com");
		Navigation nav = cd.navigate();
		nav.to("https://github.com/");
		System.out.println("Title of the loaded window is: " + cd.getTitle());
		cd.close();
		return;
	}

}
