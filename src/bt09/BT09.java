package bt09;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class BT09 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT09 frame = new BT09();
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
	public BT09() {
		setTitle("BT09");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 100);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(131, 11, 325, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JRadioButton plainBtn = new JRadioButton("Normal/Plain");
		plainBtn.setHorizontalAlignment(SwingConstants.CENTER);
		plainBtn.setBounds(20, 38, 109, 23);
		contentPane.add(plainBtn);
		
		JRadioButton boldBtn = new JRadioButton("Bold");
		boldBtn.setFont(new Font("Tahoma", Font.BOLD, 11));
		boldBtn.setHorizontalAlignment(SwingConstants.CENTER);
		boldBtn.setBounds(131, 38, 109, 23);
		contentPane.add(boldBtn);
		
		JRadioButton italicBtn = new JRadioButton("Italic");
		italicBtn.setFont(new Font("Tahoma", Font.ITALIC, 11));
		italicBtn.setHorizontalAlignment(SwingConstants.CENTER);
		italicBtn.setBounds(242, 38, 109, 23);
		contentPane.add(italicBtn);
		
		JRadioButton boldItalicBtn = new JRadioButton("Bold Italic");
		boldItalicBtn.setHorizontalAlignment(SwingConstants.CENTER);
		boldItalicBtn.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		boldItalicBtn.setBounds(353, 38, 109, 23);
		contentPane.add(boldItalicBtn);
		
		JLabel textFieldLabel = new JLabel("Enter the text: ");
		textFieldLabel.setLabelFor(textField);
		textFieldLabel.setBounds(37, 14, 85, 14);
		contentPane.add(textFieldLabel);
		
		plainBtn.addActionListener(e -> {
			plainBtn.setSelected(true);
			boldBtn.setSelected(false);
			italicBtn.setSelected(false);
			boldItalicBtn.setSelected(false);
			textField.setFont(textField.getFont().deriveFont(Font.PLAIN));
		});
		
		boldBtn.addActionListener(e -> {
			plainBtn.setSelected(false);
			boldBtn.setSelected(true);
			italicBtn.setSelected(false);
			boldItalicBtn.setSelected(false);
			textField.setFont(textField.getFont().deriveFont(Font.BOLD));
		});
		
		italicBtn.addActionListener(e -> {
			plainBtn.setSelected(false);
			boldBtn.setSelected(false);
			italicBtn.setSelected(true);
			boldItalicBtn.setSelected(false);
			textField.setFont(textField.getFont().deriveFont(Font.ITALIC));
		});
		
		boldItalicBtn.addActionListener(e -> {
			plainBtn.setSelected(false);
			boldBtn.setSelected(false);
			italicBtn.setSelected(false);
			boldItalicBtn.setSelected(true);
			textField.setFont(textField.getFont().deriveFont(Font.BOLD | Font.ITALIC));
		});
	}
}
