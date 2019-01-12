package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		Robot[] arobo = new Robot[8];

		for (int i = 0; i < 8; i++) {
			arobo[i] = new Robot();
			arobo[i].miniaturize();
			arobo[i].setSpeed(50);
			arobo[i].moveTo(100 * i + 100, 500);
		}
		int x = 0;
		for (int y = 500; y > 0; y--) {
			for (x = 0; x < 8; x++) {

				Random g = new Random();
				int e = g.nextInt(10) + 1;
				int o = g.nextInt(20) + 1;
				arobo[x].move(e);
				arobo[x].setAngle(y);
				arobo[x].setPenColor(100,200,250);
				arobo[x].penDown();
			
				
				if (arobo[x].getY() < 38) {
					arobo[x].setAngle(-90);
					arobo[x].setPenColor(200,200,0);
					break;
				}
				
			}
		}

	}

	// 2. create an array of 5 robots.

	// 3. use a for loop to initialize the robots.

	// 4. make each robot start at the bottom of the screen, side by side, facing up

	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!



	// 9. make the robots race to the top.
}
