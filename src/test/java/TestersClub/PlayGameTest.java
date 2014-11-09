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
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import TestersClub.steps.EndUserSteps;


@RunWith(ThucydidesRunner.class)
@Concurrent(threads="2")
public class PlayGameTest {

    @Managed()  //uniqueSession=true
    public WebDriver webdriver;

    @ManagedPages(defaultUrl = "http://2048game.com/")
    public Pages pages;

    @Steps
    public EndUserSteps endUser;
    
    @Before
    public void setUp() throws Exception {
    	System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");

    	
//    	webdriver.manage().window().setSize(new Dimension(768, 768)); --used for running with 2 browsers
//    	webdriver.manage().window().setPosition(new Point(0,0));  -- used for running with 2 browsers
    }


    @Test
    public void test() {
       endUser.is_the_home_page();
       webdriver.manage().window().maximize();
       endUser.walk();
      }
	} 