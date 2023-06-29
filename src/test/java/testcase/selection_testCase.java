package testcase;

import org.sikuli.script.*;

import java.net.MalformedURLException;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class selection_testCase {

	@Test()
	public void selectiontool() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen

		Screen screen = new Screen();
		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\saveandLoad.PNG";

		// create a pattern object for the icon
		Pattern iconPattern = new Pattern(imagePath);

		// wait for the icon to appear on the screen
		screen.wait(iconPattern, 50); // wait for 50 seconds
		Thread.sleep(5000);
		Pattern selecttool = new Pattern("C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\selection.PNG");
		screen.wait(selecttool, 20);
		screen.click();
		// if the icon is found, perform click
		if (screen.exists(iconPattern) != null) {
			screen.click();

			screen.doubleClick();
			int x1 = 600;
			int y1 = 600;
			int x2 = 800;
			int y2 = 700;

			// create a region object for the rectangle
			Region region = new Region(x1, y1, x2 - x1, y2 - y1);

			// draw the rectangle on the screen
			region.highlight(10.0f); // highlight the region for 2 seconds

		}

	}
}
