package testcase;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class zoomMagnifierTestcase {

	@Test()
	public void zoommagnifier() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen
		// clicking on zoom magnifier
		Screen screen = new Screen();

		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\zoommagnifier.PNG";

		// create a pattern object for the icon
		Pattern iconPattern = new Pattern(imagePath);

		// wait for the icon to appear on the screen
		screen.wait(iconPattern, 50); // wait for 50 seconds
		Thread.sleep(5000);
		// if the icon is found, perform click
		if (screen.exists(iconPattern) != null) {
			screen.doubleClick();
		}

		Thread.sleep(7000);
		
		// get the screen dimensions
		int screenWidth = screen.getScreen().getBounds().width;
		int screenHeight = screen.getScreen().getBounds().height;

		// convert 3 centimeters to pixels
		double distanceInCm = 10.0;
		double dpi = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
		int distanceInPixels = (int) Math.round(distanceInCm / 2.54 * dpi);

		// move the cursor to the center of the screen
		Location center = new Location(screenWidth / 2, screenHeight / 2);
		screen.mouseMove(center);

		// move the cursor left and right 5 times
		for (int i = 0; i < 5; i++) {
			Location left = center.offset(-distanceInPixels, 0);
			Location right = center.offset(distanceInPixels, 0);

			screen.mouseMove(left); // move left
			screen.wait(0.5); // wait for 1 second
			screen.mouseMove(center); // move back to center
			screen.wait(0.5); // wait for 1 second
			screen.mouseMove(right); // move right
			screen.wait(0.5); // wait for 1 second
			screen.mouseMove(center); // move back to center
			screen.wait(0.5); // wait for 1 second
		}
	}
}