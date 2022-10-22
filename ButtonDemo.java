import javax.swing.JPanel;

import components.ButtonDemo;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class ButtonDemo extends JPanel {

	
	protected JButton b1,b2,b3;
	
	
	

	public ButtonDemo() {
		
		ImageIcon LeftIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\Test\\src\\images\\right.gif");
		setLayout(null);
		b1=new JButton("disable the middle button",LeftIcon);
		b1.setBounds(33, 33, 177, 31);
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		
		
		add(b1);
		
		
		ImageIcon MidleIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\Test\\src\\images\\middle.gif");
		b2 = new JButton("middle Button", MidleIcon );
		b2.setBounds(230, 26, 97, 49);
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		add(b2);
		

		
		ImageIcon RightIcon = new ImageIcon("C:\\Users\\PC23\\eclipse-workspace\\Test\\src\\images\\left.gif");
		b3 = new JButton("DISSABLE LEFT BUTTON", RightIcon );
		b3.setBounds(343, 33, 177, 31);
		b3.setVerticalTextPosition(AbstractButton.CENTER);
		b3.setHorizontalTextPosition(AbstractButton.RIGHT);
		add(b3);
		
		
		
		
		
		

	}
	 private static void createAndShowGUI() {

	        //Create and set up the window.
	        JFrame frame = new JFrame("ButtonDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        ButtonDemo newContentPane = new ButtonDemo();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI(); 
	            }
	        });
	    }
}
