package technicalTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jejaktravel {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
		//Create a new instance of the Chrome Driver
		WebDriver wd = new ChromeDriver();
		
		//Launch the Jejakin Web
		wd.get("https://dev.jejak.travel/");
		
		//Maximime Browser
		wd.manage().window().maximize();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Click edit Icon
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div/div/div/div[1]/div[2]/span")).click();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Select Departure Airport
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]")).click();
		
		//Select Arrival Airport
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[1]")).click();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Update Passenger Info
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div/div/div[1]/div[3]/div/div[2]/span")).click();
		
		//Select Cabin Class
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div[1]/div/div[3]")).click();
		
		//Update Number of Passenger(s)
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]")).click();
		
		//Click Save Button
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div[2]/button")).click();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Update Travel Purpose
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[1]/div/div/div[1]/div[4]/div/div[2]/span[1]")).click();
		
		//Select custom option
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div/div[4]/h3")).click();
		
		//Select Hotel Star
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[1]/div[3]/div")).click();
		
		//Select Day(s)
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[4]/div")).click();
		
		//Select car distance
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/div[3]/div[4]/div")).click();
		
		//Click Save Button
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[3]/div/div[2]/div/div/div/button")).click();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Click take Action Button
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div/div[2]/div[2]/div/div/div/button")).click();
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//Select Planting Program
		wd.findElement(By.xpath("//*[@id=\"react-tabs-3\"]/div[3]")).click();
		
		//Type id in the Full Name text box
		wd.findElement(By.id("input-fullname")).sendKeys("Gunado Siregar");
		
		//Type id in the Email text box
		wd.findElement(By.id("input-email")).sendKeys("gunado.regar72@gmail.com");
		
		//Select Payment Method
		wd.findElement(By.xpath("//*[@id=\"card-select-payment\"]")).click();
		
		//Choose option
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[1]/div/div[2]/div[5]")).click();
		
		//wait for 3 secs
		Thread.sleep(3000);
		
		//click Term & Condition
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[1]/div[5]")).click();
		
		//Click Payment
		wd.findElement(By.xpath("//*[@id=\"__next\"]/div/div/div[2]/div[2]/div[2]/div/div/div/button")).click();
		
		//Print message to the screen
		System.out.println("Successfully to Calculate Carbon Footprint");
		
		//wait for 5 secs
		Thread.sleep(5000);
		
		//close the driver
		wd.quit();

	}

}
