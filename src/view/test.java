package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;

public class test {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test window = new test();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public test() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Tune Audio");
		frame.setBounds(100, 100, 430, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVolume = new JLabel("Volume:");
		lblVolume.setBounds(82, 12, 57, 30);
		frame.getContentPane().add(lblVolume);
		
		JSlider slider = new JSlider();
		slider.setBounds(12, 47, 200, 16);
		frame.getContentPane().add(slider);
		
		JLabel lblPitch = new JLabel("Pitch:");
		lblPitch.setBounds(91, 75, 70, 15);
		frame.getContentPane().add(lblPitch);
		
		JSlider slider_1 = new JSlider();
		slider_1.setBounds(12, 102, 200, 16);
		frame.getContentPane().add(slider_1);
		
		JLabel lblRate = new JLabel("Rate:");
		lblRate.setBounds(91, 130, 70, 15);
		frame.getContentPane().add(lblRate);
		
		JSlider slider_2 = new JSlider();
		slider_2.setBounds(12, 157, 200, 16);
		frame.getContentPane().add(slider_2);
		
		JLabel lblGetvolume = new JLabel("getVolume");
		lblGetvolume.setBounds(142, 20, 70, 15);
		frame.getContentPane().add(lblGetvolume);
		
		JLabel lblGetpitch = new JLabel("getPitch");
		lblGetpitch.setBounds(142, 75, 70, 15);
		frame.getContentPane().add(lblGetpitch);
		
		JLabel lblGetrate = new JLabel("getRate");
		lblGetrate.setBounds(142, 130, 70, 15);
		frame.getContentPane().add(lblGetrate);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(263, 102, 117, 25);
		frame.getContentPane().add(btnOk);
	}
}
