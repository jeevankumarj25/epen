package testcase;

import java.net.MalformedURLException;

import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class ZoomAreaSelectionTestcase {

	@Test()
	public void zoomselectarea() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen
		// clicking on zoom magnifier
		Screen screen = new Screen();

		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\zoomAreaSelection.PNG";

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

		// convert 5 centimeters to pixels
		double distanceInCm = 5.0;
		double dpi = java.awt.Toolkit.getDefaultToolkit().getScreenResolution();
		int distanceInPixels = (int) Math.round(distanceInCm / 2.54 * dpi);

		// move the cursor to the center of the screen and double click
		Location center = new Location(screenWidth / 2, screenHeight / 2);
		screen.doubleClick(center);

		// hold the mouse button and drag diagonally
		Location end = center.offset(distanceInPixels, distanceInPixels);
		screen.mouseDown(Button.LEFT);
		screen.mouseMove(end);
		screen.mouseUp();

		//zooming back to original
		Pattern zoomOriginal = new Pattern("C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\zoomOriginal.PNG");
		screen.wait(zoomOriginal, 20);
		screen.click();
	}

}
