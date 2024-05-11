package bt04;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class BT04 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT04 frame = new BT04();
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
	public BT04() {
		setTitle("BT04");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		JButton LeftBtn = new JButton("Trái");
		contentPane.add(LeftBtn);

		JButton CenterBtn = new JButton("Giữa");
		contentPane.add(CenterBtn);

		JButton RightBtn = new JButton("Phải");
		contentPane.add(RightBtn);

		LeftBtn.addActionListener(e -> {
			contentPane.setLayout(new FlowLayout(FlowLayout.LEFT));
			contentPane.revalidate();
		});

		CenterBtn.addActionListener(e -> {
			contentPane.setLayout(new FlowLayout(FlowLayout.CENTER));
			contentPane.revalidate();
		});

		RightBtn.addActionListener(e -> {
			contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			contentPane.revalidate();
		});
	}
}