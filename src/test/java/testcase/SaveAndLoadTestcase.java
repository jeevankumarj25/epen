package testcase;

import java.net.MalformedURLException;

import java.util.Iterator;
import java.util.List;

import org.sikuli.hotkey.Keys;
import org.sikuli.script.Element;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class SaveAndLoadTestcase {

	@Test()

	public void SaveandLoad() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen

		Screen screen = new Screen();
		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\bookletpage.PNG";

		// create a pattern object for the icon
		Pattern iconPattern = new Pattern(imagePath);

		// wait for the icon to appear on the screen
		screen.wait(iconPattern, 50); // wait for 50 seconds
		Thread.sleep(5000);

		// if the icon is found, perform click
		if (screen.exists(iconPattern) != null) {
			screen.click();
		}

		// click arrow down and move the pages 10 times
		for (int i = 0; i <= 10; i++) {
			screen.type(Key.DOWN);

			screen.wait(3.0);

		}
		Thread.sleep(1000);
		// to check checkboxes and add marks

		screen.type(Keys.TAB);
		screen.wait(3.0);
		screen.type(Keys.TAB);
		screen.type(Key.DOWN);
		screen.type(Key.DOWN);
		// click on A-Section checkbox
		Pattern checkboxA = new Pattern("C:\\Users\\DELL\\eclipse-workspace\\epenV15\\SikuliImages\\checkboxA.PNG");
		screen.wait(checkboxA, 20);
		screen.click();


        
	}

}
