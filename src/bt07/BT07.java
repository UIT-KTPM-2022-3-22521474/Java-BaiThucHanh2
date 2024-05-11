package bt07;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;

public class BT07 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT07 frame = new BT07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BT07() {
		setTitle("BT07");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JRadioButton RedRadioBtn = new JRadioButton("Red");
		contentPane.add(RedRadioBtn);
		
		JRadioButton GreenRadioBtn = new JRadioButton("Green");
		contentPane.add(GreenRadioBtn);
		
		JRadioButton BlueRadioBtn = new JRadioButton("Blue");
		contentPane.add(BlueRadioBtn);
		
		RedRadioBtn.addActionListener(e -> {
			RedRadioBtn.setSelected(true);
			GreenRadioBtn.setSelected(false);
			BlueRadioBtn.setSelected(false);
			contentPane.setBackground(java.awt.Color.RED);
		});
		
		GreenRadioBtn.addActionListener(e -> {
			RedRadioBtn.setSelected(false);
			GreenRadioBtn.setSelected(true);
			BlueRadioBtn.setSelected(false);
			contentPane.setBackground(java.awt.Color.GREEN);
		});
		
		BlueRadioBtn.addActionListener(e -> {
			RedRadioBtn.setSelected(false);
			GreenRadioBtn.setSelected(false);
			BlueRadioBtn.setSelected(true);
			contentPane.setBackground(java.awt.Color.BLUE);
		});
	}
}