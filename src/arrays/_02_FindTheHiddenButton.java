/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;
	boolean wait;
	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] arbutton;
	// 2 create an int variable called hiddenButton
	int hiddenButton;
	String in = JOptionPane.showInputDialog("Enter a number");
	int num = Integer.parseInt(in);

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(800, 800);

		// 3. Ask the user to enter a positive number and convert it to an int

		// 4. Initialize the array of JButtons to be the size of the int created in step
		// 3
		arbutton = new JButton[num];

		for (int i = 0; i < arbutton.length; i++) {
			arbutton[i] = new JButton();
			arbutton[i].setSize(num, num);
			arbutton[i].addActionListener(this);
			panel.add(arbutton[i]);
			Random rando = new Random();
			int greenValue = rando.nextInt(255);
			int blueValue = rando.nextInt(255);
			int redValue = rando.nextInt(255);

			arbutton[i].setBackground(new Color(redValue, blueValue, greenValue));
			arbutton[i].setOpaque(true);
			arbutton[i].setBorderPainted(false);
			// arbutton[i].setBorder(BorderFactory.createLineBorder(new Color(redValue,
			// blueValue, greenValue), 0));

		}
		Random rand = new Random();
		hiddenButton = rand.nextInt(num);
		for (int j = 0; j < arbutton.length; j++) {
		}

		// 5. Make a for loop to iterate through the JButton array
		// 6. initialize each JButton in the array
		// 7. add the ActionListener to each JButton
		// 8. add each JButton to the panel

		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		// This sets window size to fill screen :::
		// window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.

		// 13. initialize the hiddenButton variable to a random number less than the int
		// created in step 3

		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		arbutton[hiddenButton].setText("me");
		// 15. Use to pause the program.
		// Surround it with a try/catch

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 16. Set the text of the JButton located at hiddenButton to be blank.
		arbutton[hiddenButton].setText("");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked == arbutton[hiddenButton]) {
			System.out.println("ya win");
		} else {
			System.out.println("tri agin");
		}

// 18. else tell them to try again
	}

}
