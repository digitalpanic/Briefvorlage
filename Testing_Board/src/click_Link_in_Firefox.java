import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class click_Link_in_Firefox {

		    public static void main(String[] args) {
		 
		        FirefoxDriver fox1 = new FirefoxDriver();
		        
		        //SalesForce
		        //fox1.get("https://eon--preprod.cs101.my.salesforce.com/?ec=302&startURL=%2Fvisualforce%2Fsession%3Furl%3Dhttps%253A%252F%252Feon--preprod.lightning.force.com%252Fone%252Fone.app");
		        //SAP
		        fox1.get("https://pcw.apps.eon.com/sap(bD1kZSZjPTEwMCZkPW1pbg==)/bc/bsp/sap/crm_ui_start/default.htm");
		        
		        WebElement element_UserName = fox1.findElementById("username");
		        element_UserName.sendKeys("matthias.kuehn@eon-energie.com.preprod");
		        
		        WebElement element_password = fox1.findElementById("password");
		        element_password.sendKeys("Medion007!");
		        
		        fox1.findElementById("Login").submit();
		        
		        //Prüfen ob die Startseite geladen wurde
		        String Startseite = fox1.getTitle();
		        System.out.println(Startseite);
		        
		        
		        fox1.quit();

		    }
		
}
