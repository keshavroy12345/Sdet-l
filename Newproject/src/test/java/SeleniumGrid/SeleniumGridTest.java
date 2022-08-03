package SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGridTest {

	public static void main(String[] args) throws URISyntaxException, MalformedURLException {
		// TODO Auto-generated method stub
  //step 1 :load the url
    URL url = new URL("https://localhost:4444/wd/hub");
		//set desired capabilities
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		//step 3  :load remote web driver
		RemoteWebDriver driver=new RemoteWebDriver(url, cap);
		driver.get("//https://gmail.com");
	}
}
