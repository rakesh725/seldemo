/**
 * 
 */
package com.seldemo.test;

/**
 * 
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Rakesh
 *
 */
public class GoogleSearchTest extends SelTestCase {

	static WebDriver driver; 
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		  //Launch WebApp
        driver = new FirefoxDriver();
	   
       
	}


    @AfterClass
    public static void tearDownAfterClass() throws Exception {
         driver.quit();
    	
    }

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    	
    	driver.close();
    }
    

	@Test
	public void testSearch() {
	
        
   	 	driver.get("http://www.google.com");

   	 
		//Enter: Selenium Rocks in search
		WebElement txSearchBar = driver.findElement(By.id("gbqfq"));
		txSearchBar.sendKeys("Selenium Rocks");
		//Click on Search
		driver.findElement(By.id("gbqfb")).click();
		
	}

}
