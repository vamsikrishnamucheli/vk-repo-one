package Pack;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class Sel1 {



public static void main(String[] args) {

//Invoking Browser

//Chrome - ChromeDriver exten->Methods close get

//Firefox- FirefoxDriver ->methods close get

// WebDriver  close  get

//WebDriver methods + class methods

// Chrome

         ChromeOptions options = new ChromeOptions();

         options.addArguments("--remote-allow-origins=*");

System.setProperty("webdriver.chrome.driver", "C:\\chdriver\\chromedriver.exe");

WebDriver driver = new ChromeDriver(options);


System.out.println(driver.getTitle());

System.out.println(driver.getCurrentUrl());

System.out.println(" new code to be added in git");

driver.close();

//driver.quit();



}



}
