package Tablecolumn;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printcolumn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\New chrome\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/tables");
		
		List<WebElement> Rows= driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		List <String> name=new ArrayList<>();
		//List<String> name=new List();
		
		for(WebElement row:Rows ) {
			
			name.add(row.findElement(By.xpath("td")).getText());
		}
			System.out.print(name);//[Smith, Bach, Doe, Conway]
			// System.out.println(name+"");//out put:[Smith]          [** in the loop**]
			                             //        [Smith, Bach]
			                        	//         [Smith, Bach, Doe]
			                          //           [Smith, Bach, Doe, Conway]

//			String name=(row.findElement(By.xpath("td")).getText()); //for printing  String output like  Smith  Bach  Doe  Conway 
//           System.out.print(name+"");}
			//driver.close();
			Thread.sleep(300);
		driver.quit();
			
		
		
	}

	
	}


