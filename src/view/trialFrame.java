package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 * @author Ning Zhu 08/01/2016
 * Trial project following https://www.clear.rice.edu/comp504/f15/labs/lab01/.
 */
public class trialFrame extends JFrame {

	/**
	 * Generate serial UID
	 */
	private static final long serialVersionUID = -2286090873987840088L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trialFrame frame = new trialFrame();
					frame.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public trialFrame() 
	{
		initGUI();  // Call the initialization method.
	}

	/**
	 * Initialize the GUI components but do not start the frame.
	 * This method could be public if desired.
	 */
	private void initGUI()
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	private void start()
	{
		setVisible(true);
	}
}
