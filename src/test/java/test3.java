import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class test3 {
  public static final String AUTOMATE_USERNAME = "YOUR_USERNAME";
  public static final String AUTOMATE_KEY = "YOUR_ACCESS_KEY";
  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

  public static void main(String[] args) throws Exception {

    //Configure ChromeOptions to pass fake media stream
    ChromeOptions options = new ChromeOptions();
    options.addArguments("use-fake-device-for-media-stream");
    options.addArguments("use-fake-ui-for-media-stream");

    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("browser", "Chrome");
    caps.setCapability("browser_version", "114.0");
    caps.setCapability("os", "Windows");
    caps.setCapability("os_version", "11");
    caps.setCapability(ChromeOptions.CAPABILITY, options);
    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);

    //WebCam Test
    driver.get("https://webcamtests.com/check");
    Thread.sleep(5000);
    driver.findElement(By.id("webcam-launcher")).click();
    Thread.sleep(2000);

    //Mic Test
    driver.get("https://www.vidyard.com/mic-test/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//a[@id='start-test']")).click();
    Thread.sleep(2000);

    driver.quit();
  }
}
