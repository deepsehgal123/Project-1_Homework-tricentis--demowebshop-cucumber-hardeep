package com.tricentis.demowebshop.browserfactory;


import com.tricentis.demowebshop.propertyreader.PropertyReader;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class ManageBrowser {

    public static WebDriver driver;
    static String baseUrl = PropertyReader.getInstance().getProperty("baseUrl");
    static int implicitlyWait = Integer.parseInt(PropertyReader.getInstance().getProperty("implicitlyWait"));

    public ManageBrowser() {
        // Configure Log4j only once
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/resources/propertiesfile/log4j2.properties");
    }

    public void selectBrowser(String browser) {

        // Set WebDriver system properties if needed
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser name! Defaulting to Chrome.");
            driver = new ChromeDriver();
        }

        // Maximize and configure timeouts
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));

        // Open base URL
        driver.get(baseUrl);
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
