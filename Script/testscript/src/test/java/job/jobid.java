package job;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jobid {

	public static void main(String[] args) throws UnsupportedFlavorException, IOException {
				WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://stage-playbackcqc.jiocinema.com/create-job");


		driver.manage().window().maximize();

			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(String.valueOf("3984208"));
		driver.findElement(By.xpath("//input[@name='androidtv']")).click();
		driver.findElement(By.xpath("//input[@name='iostv']")).click();
		driver.findElement(By.xpath("//input[@name='samsungtv']")).click();
		driver.findElement(By.xpath("//input[@name='androidmobile']")).click();
		driver.findElement(By.xpath("//input[@name='iosmobile']")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Create Job']")).click();
		
		driver.findElement(By.xpath("//p")).click();  
		
		 String copiedText = getClipboardContents();
		System.out.println(copiedText);


	}
	 
		  public static String getClipboardContents() {
		        try {
		            Toolkit toolkit = Toolkit.getDefaultToolkit();
		            Clipboard clipboard = toolkit.getSystemClipboard();
		            Transferable contents = clipboard.getContents(null);
		            boolean hasText = (contents != null) && contents.isDataFlavorSupported(DataFlavor.stringFlavor);
		            if (hasText) {
		                return (String) contents.getTransferData(DataFlavor.stringFlavor);
		            }
		        } catch (UnsupportedFlavorException | IOException e) {
		            e.printStackTrace();
		        }
		        return "";
		    }
	}


