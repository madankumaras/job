package job2;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Job3paste {
	
	

	

	public static void past()
	{
		String copiedText = getClipboardContents();
		System.out.println(copiedText);
		
		Job2.clear();
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
