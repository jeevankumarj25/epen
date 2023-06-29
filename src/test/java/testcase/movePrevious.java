package testcase;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class movePrevious {

	@Test()
	public void moveprevious() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen
		// clicking on zoom magnifier
		Screen screen = new Screen();

		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\moveNext.PNG";

		// create a pattern object for the icon
		Pattern iconPattern = new Pattern(imagePath);

		// wait for the icon to appear on the screen
		screen.wait(iconPattern, 50); // wait for 50 seconds
		Thread.sleep(7000);
		// if the icon is found, perform next 5times
		if (screen.exists(iconPattern) != null) {
			for (int i = 0; i < 5; i++) {
				Thread.sleep(1000);
				screen.click();
			}
		}
		//click on previous button for 3 times
		Pattern moveprev = new Pattern("C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\movePrevious.PNG");
		screen.wait(moveprev, 20);
		for (int i = 0; i < 3; i++) {
			screen.click();
			Thread.sleep(1000);
		}
	}

}
