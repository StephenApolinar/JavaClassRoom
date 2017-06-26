// Demonstrates the JTextArea component.

import java.awt.*;
import javax.swing.*;

public class TextFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setSize(new Dimension(300, 150));
		frame.setTitle("Text frame");

		JTextArea area = new JTextArea(5, 20);
		// Commented out text area frame
		//frame.add(area);
		// use scrollbars on this text area
		frame.add(new JScrollPane(area));
		// changing Font from default
		area.setFont(new Font("Serif", Font.BOLD, 14));

		frame.setVisible(true);
	}
}
