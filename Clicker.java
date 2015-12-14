import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Clicker{
	public static void main(String[] args) throws AWTException{
			Robot clix = new Robot();
			for(int i = 0; i < 40; i++){
				clix.mouseMove(new Random().nextInt(1400), new Random().nextInt(1000));
				clix.delay(10);
				clix.mousePress(InputEvent.BUTTON1_MASK);
				clix.mouseRelease(InputEvent.BUTTON1_MASK);
			}
		}
	}

