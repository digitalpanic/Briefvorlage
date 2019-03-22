import org.openqa.selenium.firefox.FirefoxDriver;
public class start_firefox2_goto_Homepage {

	    public static void main(String[] args) {
	 
	        FirefoxDriver fox1 = new FirefoxDriver();
	        FirefoxDriver fox2 = new FirefoxDriver();
	 
	        fox1.get("https://www.google.com");
	        fox2.get("https://www.google.com");
	        
	    }
	}

