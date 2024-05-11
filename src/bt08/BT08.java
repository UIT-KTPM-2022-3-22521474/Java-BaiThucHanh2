package bt08;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class BT08 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT08 frame = new BT08();
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
	public BT08() {
		setTitle("BT08");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton ImageBtn = new JButton("Choose image file");
		contentPane.add(ImageBtn);
		
		JLabel imageLabel = new JLabel("");
		contentPane.add(imageLabel);
		
		ImageBtn.addActionListener(e -> {
			JFileChooser fileChooser = new JFileChooser();
			int returnValue = fileChooser.showOpenDialog(null);
			if (returnValue == JFileChooser.APPROVE_OPTION) {
				try {
                    ImageIcon icon = new ImageIcon(fileChooser.getSelectedFile().getPath());
                    Image image = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    imageLabel.setIcon(new ImageIcon(image));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
			}
		});
	}

}
