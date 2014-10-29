package TestersClub;


import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.annotations.Managed;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;



import TestersClub.steps.EndUserSteps;

//@Story(Application.Search.SearchByKeyword.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads="2")
public class PlayGame2Test {

    @Managed()  //uniqueSession=true
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://2048game.com/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;
    
    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//    	System.setProperty("webdriver.chrome.driver","D:\\boot\\chromedriver_win32\\chromedriver.exe");
//    	webdriver = new FirefoxDriver();
    	webdriver.manage().window().maximize();
    	
    }


    @Test
    public void test2048(){
    	endUser.is_the_home_page();
       endUser.walk();

    }
   
} 