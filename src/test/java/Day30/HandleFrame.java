package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		
        WebElement frame1 = driver.findElement(By.xpath("//frameset[1]/frame[1]"));
        driver.switchTo().frame(frame1);
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
        driver.switchTo().defaultContent();

        WebElement frame2 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Welcome2");
        driver.switchTo().defaultContent();

        //frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frameset//frameset//frame[2]"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Welcom3");

 
       WebElement frame33 = driver.findElement(By.xpath("//iframe[normalize-space()='Loading...']"));
       driver.switchTo().frame(frame33);   //by using webelement
       //inner frame of part 3 frame
       // driver.switchTo().frame(0); //by using id
       WebElement radiobutton = driver.findElement(By.xpath("//div[@id='i6']//div[@class='AB7Lab Id5V1']"));
       radiobutton.click();
       driver.switchTo().defaultContent();
 
 
       //element intersept exception , element is not clickable exception 
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       //js.executeAsyncScript("arguments[0].click();", radiobutton);
       //driver.switchTo().defaultContent();
 
 
 
        WebElement frame4 = driver.findElement(By.xpath("//frameset//frame[3]"));
        driver.switchTo().frame(frame4);
        driver.findElement(By.xpath("//input[@name='mytext4']")).sendKeys("Welcome4");
        driver.switchTo().defaultContent();
        driver.switchTo().defaultContent();
 

       WebElement frame5 = driver.findElement(By.xpath("/html/frameset/frame[2]"));
       driver.switchTo().frame(frame5);
       driver.findElement(By.xpath("//*[@id=\"id5\"]/div/input")).sendKeys("welcome5");
       driver.switchTo().defaultContent();
       
       WebElement frame21 = driver.findElement(By.xpath("//frameset//frameset//frame[1]"));
       driver.switchTo().frame(frame21);
       driver.findElement(By.xpath("//input[@name='mytext2']")).clear();
       Thread.sleep(5000);
       driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("welcom23");
       driver.switchTo().defaultContent();
       driver.switchTo().defaultContent();

       //in frame first we have to switch from main page to frame and we handle element of frame we have to switch 
       //frame to main page it automatically does not switch frame to main page
 
	}

}
