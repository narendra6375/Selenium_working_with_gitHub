package com.ShoppersStack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.ShoppersStack_GenericUtility.FrameWorkConstants;

public class Webdriver_Utility {

	public void getWebPageScreenShot(WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath);
		FileHandler.copy(temp, dest);

	}

	public void getWebElementScreenShot(WebElement element) throws IOException {

		File temp = element.getScreenshotAs(OutputType.FILE);
		File dest = new File(FrameWorkConstants.screenshotPath);
		FileHandler.copy(temp, dest);

	}

	public void selectByValue(WebElement element, String value) {

		Select sel = new Select(element);
		sel.selectByValue(value);

	}

	public void javaScriptClick(WebDriver driver, WebElement element) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

}
