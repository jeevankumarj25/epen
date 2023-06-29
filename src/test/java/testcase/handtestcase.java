package testcase;

import java.net.MalformedURLException;

import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class handtestcase {

	@Test()
	public void handtool() throws MalformedURLException, FindFailed, InterruptedException {
		EpenTestcaseLogin.Login();// LoginePen

		// clicking on hand tool
		Screen screen = new Screen();

		// specify the path to the image file of the icon to wait for
		String imagePath = "C:\\Users\\user\\OneDrive\\Documents\\epenV15\\SikuliImages\\hand.PNG";

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

		// move the cursor to the center of the screen
		Location center = new Location(screenWidth / 2, screenHeight / 2);
		screen.mouseMove(center);

		// move the cursor up and down 5 times
		for (int i = 0; i < 5; i++) {
			screen.doubleClick(null, Button.LEFT); // double-click center with left mouse button
			screen.mouseDown(Button.LEFT); // hold down left mouse button
			screen.mouseMove(center); // move back to center
			screen.wait(0.5); // wait for half a second

			screen.mouseMove(center.offset(0, -50)); // move up
			screen.wait(0.5); // wait for half a second
			screen.mouseMove(center); // move cursor to center

			screen.mouseMove(center.offset(0, 50)); // move down
			screen.wait(0.5);// wait for half second
			screen.mouseMove(center); // move cursor to center

			screen.mouseMove(center); // move cursor to center
			
			// release the left mouse button
			screen.mouseUp(Button.LEFT);

		}

		
	}
}
