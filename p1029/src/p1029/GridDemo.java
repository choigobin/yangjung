package p1029;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridDemo extends JFrame {
	GridDemo(){
		setTitle("Grid Layout");
		
		setLayout(new GridLayout(0,2));
		add(new JButton("버튼1"));
		add(new JButton("버튼2"));
		add(new JButton("버튼3"));
		add(new JButton("버튼4"));
		add(new JButton("버튼5"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,110);
		setVisible(true);
	}
	public static void main(String[] args) {
		new GridDemo();

	}

}
