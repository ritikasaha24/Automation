package StepDef;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverSetup {
	private static WebDriver driver;

	//Local FireFoxDriverSetup
	public static WebDriver getFireFoxWebDriver() {

		// Set path for driver
		System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");

		// Initialize Driver
		driver = new FirefoxDriver();
		return driver;
	}

	//Local ChromeDriverSetup
	public static WebDriver getChromeWebDriver() {

		// Set path for driver
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

		// Initialize Driver
		driver = new ChromeDriver();
		return driver;
	}
	
	//Grid Chrome Driver setup
	public static WebDriver getGridChromeDriver(URL testGridUrl) throws MalformedURLException {
		ChromeOptions chromeOptions = new ChromeOptions();    
		DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        driver = new RemoteWebDriver(testGridUrl, desiredCapabilities);
        
        return driver;
	}
	
	//Grid Firefox driver setup
	public static WebDriver getGridFirefoxDriver(URL testGridUrl) {
		driver = new RemoteWebDriver(testGridUrl, DesiredCapabilities.firefox());
		return driver;
	}
	 
	
}
