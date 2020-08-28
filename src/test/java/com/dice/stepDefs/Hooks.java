package com.dice.stepDefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.dice.utilities.ConfigReader;
import com.dice.utilities.Driver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	

	@Before
	public void setUpMethod() {

		Driver.getDriver().manage().timeouts().implicitlyWait(Long.parseLong(ConfigReader.getProperty("implicitWait")),
				TimeUnit.SECONDS);
		Driver.getDriver().manage().window().maximize();

	}

	@After

	public void tearDownMethod() {
		Driver.quit();
	}

	
	
	@After
	public void tearDown2(Scenario scenario) {
		if (scenario. isFailed()) {
			// Take a screenshot...
			final byte[] screenshot = ((TakesScreenshot) 
					Driver.getDriver()).getScreenshotAs(OutputType. BYTES);
			//TODO -> need to define name of each screenshot
			String name = "failed at " + System.currentTimeMillis();
			scenario.attach(screenshot, "image/png", name); 
		}
	}
	

}


