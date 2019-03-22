import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.UserDataHandler;
public class click_Link_in_Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		//User initialisieren
		UserData User1 = new UserData();
		User1.getNormal();
		
		//Chrome aufrufen
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\M18865\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver Wait initialisieren
		WebDriverWait myWaitVar = new WebDriverWait (driver, 10);
		
		// SAP PCW aufrufen
		driver.get("https://pcw.apps.eon.com/sap(bD1kZSZjPTEwMCZkPW1pbg==)/bc/bsp/sap/crm_ui_start/default.htm");
		
		
		
		WebElement element_UserName = driver.findElement(By.name("sap-user"));
		element_UserName.sendKeys(User1.username);

		WebElement element_password = driver.findElement(By.name("sap-password"));
		element_password.sendKeys(User1.password);
		element_password.submit();
		
		WebElement element_ICWC = driver.findElement(By.id("Z_HVP_ICWC"));
		element_ICWC.click();

		//in den Korrekten Frame springen
		driver.switchTo().frame(0);
		driver.switchTo().frame(2);
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.switchTo().frame(1);
		
		WebElement element_VK_Suche = driver.findElement(By.id("C14_W44_V45_V46_identifyui_buag"));
		element_VK_Suche.sendKeys("232045462080");
		element_VK_Suche.sendKeys(Keys.RETURN);
		
		//warten bis Weiter mit VK erscheint um dann diesen Link zu klicken
		myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.id("C14_W44_V45_V66_CONFIRM_ACC_BUAG")));
		WebElement element_confirm_BUAG = driver.findElement(By.id("C14_W44_V45_V66_CONFIRM_ACC_BUAG"));
		element_confirm_BUAG.click();
		
		driver.close();
		System.out.println("Test erfolgreich durchgeführt");

		}
	}
