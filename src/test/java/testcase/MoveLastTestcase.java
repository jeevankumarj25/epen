package testcase;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class MoveLastTestcase {

	@Test()
	public void movelast() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen
		// clicking on zoom magnifier
		Screen screen = new Screen();

		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\moveLast.PNG";

		// create a pattern object for the icon
		Pattern iconPattern = new Pattern(imagePath);

		// wait for the icon to appear on the screen
		screen.wait(iconPattern, 50); // wait for 50 seconds
		Thread.sleep(5000);
		// if the icon is found, perform click
		if (screen.exists(iconPattern) != null) {
			screen.click();
		}

		Thread.sleep(7000);
	}
}
