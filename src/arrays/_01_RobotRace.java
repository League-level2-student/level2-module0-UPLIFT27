package arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.

		Robot[] robots = new Robot[7];
		Random random = new Random();

		// 3. use a for loop to initialize the robots.

		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setX(50 + i * 100);
			robots[i].setY(550);
			robots[i].setSpeed(100);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		int num;
		boolean robotFinish = true;
		while (robotFinish) {
			for (int i = 0; i < robots.length; i++) {
				num = random.nextInt(50);
				robots[i].move(num);
				if (robots[i].getY() <= 10)	
				{
					JOptionPane.showMessageDialog(null, "Robot " + i + " is the Winner and now it gets a Party ");

					while (true) {
						for (int j = 0; j < robots.length; j++) {

							robots[j].turn(360);

						}
					}

				}
			}

		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.

	}

}
