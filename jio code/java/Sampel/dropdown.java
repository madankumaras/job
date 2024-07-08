package Sampel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\software\\chronew\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	//	driver.manage().window().maximize();
		
		Select selectelement=new Select(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select")));
       List<WebElement>options=selectelement.getOptions();
       System.out.println(options.size());
       
    //   selectelement.selectByVisibleText("Armenia");
    //   driver.navigate().refresh();
       Thread.sleep(2000);
       selectelement.selectByIndex(45);
        Thread.sleep(2000);         
       driver.navigate().to("https://semantic-ui.com/modules/dropdown.html#/definition");
       Thread.sleep(2000);
       JavascriptExecutor js=(JavascriptExecutor)driver;
     	js.executeScript("window.scrollBy(0,1000);");
     	
      Select selectelements=new Select(driver.findElement(By.xpath("//div[@class='ui fluid dropdown selection multiple']//select[@name='skills']")));
       List<WebElement>option=selectelements.getOptions();
       System.out.println(option.size()); 
       
       Boolean bool1=selectelements.isMultiple();                    //div[@class='ui fluid search dropdown selection multiple']
       System.out.println(bool1);
       Thread.sleep(2000);
       
   selectelements.selectByIndex(2);
      selectelement.selectByIndex(3);
      Thread.sleep(2000);
      selectelements.selectByValue("css");
      selectelements.selectByIndex(0);
       Thread.sleep(3000);
       selectelements.deselectAll();   
       
       
       
}
}