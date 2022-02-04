package week2.day2.assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase3 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement elementUsername = driver.findElement(By.id("username"));
		elementUsername.sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Harishankar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("27/02/1999");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8838453545");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ragnar");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("babu@testleaf.com");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Harishankar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("22");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Vellalakari");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Cuddalore");
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cc = new Select(country);
		cc.selectByVisibleText("India");
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ss = new Select(state);
		ss.selectByVisibleText("TAMILNADU");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("607003");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("607003");
		driver.findElement(By.className("smallSubmit")).click();
	}

}
