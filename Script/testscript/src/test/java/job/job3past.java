package job;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class job3past {


	public static void past()
	{
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
