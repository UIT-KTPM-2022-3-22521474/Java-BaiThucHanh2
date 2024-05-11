package bt05;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;

public class BT05 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT05 frame = new BT05();
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
	public BT05() {
		setTitle("BT05");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton TopBtn = new JButton("Trên");
		contentPane.add(TopBtn, BorderLayout.NORTH);
		
		JButton LeftBtn = new JButton("Trái");
		contentPane.add(LeftBtn, BorderLayout.WEST);
		
		JButton CenterBtn = new JButton("Giữa");
		contentPane.add(CenterBtn, BorderLayout.CENTER);
		
		JButton RightBtn = new JButton("Phải");
		contentPane.add(RightBtn, BorderLayout.EAST);
		
		JButton BotBtn = new JButton("Dưới");
		contentPane.add(BotBtn, BorderLayout.SOUTH);
		
		TopBtn.addActionListener(e -> {
			TopBtn.setVisible(false);
			LeftBtn.setVisible(true);
			CenterBtn.setVisible(true);
			RightBtn.setVisible(true);
			BotBtn.setVisible(true);
			contentPane.revalidate();
		});
		
		LeftBtn.addActionListener(e -> {
			TopBtn.setVisible(true);
			LeftBtn.setVisible(false);
			CenterBtn.setVisible(true);
			RightBtn.setVisible(true);
			BotBtn.setVisible(true);
			contentPane.revalidate();
		});
		
		CenterBtn.addActionListener(e -> {
			TopBtn.setVisible(true);
			LeftBtn.setVisible(true);
			CenterBtn.setVisible(false);
			RightBtn.setVisible(true);
			BotBtn.setVisible(true);
			contentPane.revalidate();
		});
		
		RightBtn.addActionListener(e -> {
			TopBtn.setVisible(true);
			LeftBtn.setVisible(true);
			CenterBtn.setVisible(true);
			RightBtn.setVisible(false);
			BotBtn.setVisible(true);
			contentPane.revalidate();
		});
		
		BotBtn.addActionListener(e -> {
			TopBtn.setVisible(true);
			LeftBtn.setVisible(true);
			CenterBtn.setVisible(true);
			RightBtn.setVisible(true);
			BotBtn.setVisible(false);
			contentPane.revalidate();
		});
	}
}