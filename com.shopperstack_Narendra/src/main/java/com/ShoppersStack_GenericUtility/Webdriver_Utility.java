package com.shopperstack_GenericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Webdriver_Utility {

	public void WebPage_SS(WebDriver driver) throws IOException {
		TakesScreenshot tScreenshot = (TakesScreenshot) driver;
		File sourceFile = tScreenshot.getScreenshotAs(OutputType.FILE);
		File desFile = new File(FrameWorkConstants.screenshotPath);
		FileHandler.copy(sourceFile, desFile);

	}

	public void element_SS(WebElement element) throws IOException {
		File tempFile = element.getScreenshotAs(OutputType.FILE);
		File deFile = new File("");
		FileHandler.copy(tempFile, deFile);
	}

	public void SelectByValues(WebElement selectElement, String Value) {
		Select mySelect = new Select(selectElement);
		mySelect.selectByValue(Value);
	}

	public void javaScriptClick(WebDriver driver, WebElement cliElement) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("argument[0].click();", cliElement);
	}

}
