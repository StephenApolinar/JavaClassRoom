// Demonstrates the RectPanel class by placing one into a GUI.

import java.awt.*;
import javax.swing.*;

public class UseAnimatedRectPanel1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		frame.setTitle("A panel with rectangles");

		AnimatedRectPanel2 panel = new AnimatedRectPanel2();
		panel.setBackground(Color.WHITE);
		frame.add(panel);

		frame.setVisible(true);
		
	}
}
