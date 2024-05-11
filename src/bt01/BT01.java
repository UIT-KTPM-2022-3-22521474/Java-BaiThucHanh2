package bt01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BT01 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT01 frame = new BT01();
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
	public BT01() {
		setTitle("BT01");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 90);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		String name = null;
		do {
		    name = JOptionPane.showInputDialog("Nhập tên của bạn: ");
		    if (name == null) {
		    	break;
		    } else if (name.trim().isEmpty()) {
		        JOptionPane.showMessageDialog(null, "Bạn chưa nhập tên!");
		    }
		} while (name.trim().isEmpty());
		
		if (name != null) {
			JLabel HelloNameLabel = new JLabel("Xin chào " + name + "!");
			contentPane.add(HelloNameLabel);
			contentPane.revalidate();
			contentPane.repaint();
		}
		else {
			System.exit(0);
		}
	}
}