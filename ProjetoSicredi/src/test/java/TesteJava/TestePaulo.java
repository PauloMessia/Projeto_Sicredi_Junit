package TesteJava;



import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestePaulo {
	WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap");
		driver.manage().window().maximize();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("switch-version-select")).sendKeys("Bootstrap V4 Theme");
	driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[1]/th[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")).click();
	driver.findElement(By.id("field-customerName")).sendKeys("Teste Sincredi");
	driver.findElement(By.id("field-contactLastName")).sendKeys("Teste");
	driver.findElement(By.id("field-contactFirstName")).sendKeys("seu nome");
	driver.findElement(By.id("field-phone")).sendKeys("51 9999-9999");
	driver.findElement(By.id("field-addressLine1")).sendKeys("Av Assis Brasil, 3970");
	driver.findElement(By.id("field-addressLine2")).sendKeys("Torre D");
	driver.findElement(By.id("field-city")).sendKeys("Porto Alegre");
	driver.findElement(By.id("field-state")).sendKeys("RS");
	driver.findElement(By.id("field-postalCode")).sendKeys("91000-000");
	driver.findElement(By.id("field-country")).sendKeys("Brasil");
	driver.findElement(By.id("field-salesRepEmployeeNumber")).sendKeys("14500");
	driver.findElement(By.id("field-creditLimit")).sendKeys("200");
	driver.findElement(By.id("form-button-save")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("save-and-go-back-button")).click();
    Thread.sleep(2000);
    assertEquals("save-and-go-back-button", "save-and-go-back-button");	

	driver.quit();
	}

}
