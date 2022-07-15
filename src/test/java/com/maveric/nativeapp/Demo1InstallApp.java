 package com.maveric.nativeapp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Demo1InstallApp {
	
		public static void main(String[] args) throws MalformedURLException {
			
			DesiredCapabilities cap=new DesiredCapabilities();
	        cap.setCapability("platformName", "android");
	        cap.setCapability("deviceName", "priya");
	        cap.setCapability("app", "C:\\Appium_workspace\\MobileAutomation\\MobileAutomation\\app\\khan-academy-7-3-2.apk");
	        
	        
	        AndroidDriver driver=new AndroidDriver(new URL("http://localhost:4723/wd/hub"),cap);
	        
	      
	        String appSource = driver.getPageSource();
	        System.out.println(appSource);
	        
	        driver.quit();
		}
		
	}


