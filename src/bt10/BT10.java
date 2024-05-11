package bt10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class BT10 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT10 frame = new BT10();
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
	public BT10() {
		setTitle("BT10");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		JMenuBar menuBar = new JMenuBar();
		contentPane.add(menuBar, BorderLayout.NORTH);

		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);

		JMenuItem aboutMenuItem = new JMenuItem("About");
		fileMenu.add(aboutMenuItem);

		JMenuItem exitMenuItem = new JMenuItem("Exit");
		fileMenu.add(exitMenuItem);

		JMenu formatMenu = new JMenu("Format");
		menuBar.add(formatMenu);

		JMenu colorMenu = new JMenu("Color");
		formatMenu.add(colorMenu);

		JMenuItem redColorMenuItem = new JMenuItem("Red");
		colorMenu.add(redColorMenuItem);

		JMenuItem greenColorMenuItem = new JMenuItem("Green");
		colorMenu.add(greenColorMenuItem);

		JMenuItem blueColorMenuItem = new JMenuItem("Blue");
		colorMenu.add(blueColorMenuItem);

		JMenu fontMenu = new JMenu("Font");
		formatMenu.add(fontMenu);

		JCheckBoxMenuItem boldFontChkBoxMenuItem = new JCheckBoxMenuItem("Bold");
		fontMenu.add(boldFontChkBoxMenuItem);

		JCheckBoxMenuItem italicFontChkBoxMenuItem = new JCheckBoxMenuItem("Italic");
		fontMenu.add(italicFontChkBoxMenuItem);

		JRadioButtonMenuItem arialFontRadioBtnMenuItem = new JRadioButtonMenuItem("Arial");
		fontMenu.add(arialFontRadioBtnMenuItem);

		JRadioButtonMenuItem tnmFontRadioBtnMenuItem = new JRadioButtonMenuItem("Times New Roman");
		fontMenu.add(tnmFontRadioBtnMenuItem);

		JRadioButtonMenuItem tahomaFontRadioBtnMenuItem = new JRadioButtonMenuItem("Tahoma");
		fontMenu.add(tahomaFontRadioBtnMenuItem);

		ButtonGroup fontGroup = new ButtonGroup();

		fontGroup.add(arialFontRadioBtnMenuItem);
		fontGroup.add(tnmFontRadioBtnMenuItem);
		fontGroup.add(tahomaFontRadioBtnMenuItem);

		aboutMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Creator: To Vinh Tien - 22521474.", "About - BT10",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		exitMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		redColorMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});

		greenColorMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});

		blueColorMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});

		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		contentPane.add(textArea, BorderLayout.CENTER);

		JLabel textAreaLabel = new JLabel("Enter the text here:");
		textAreaLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textAreaLabel.setLabelFor(textArea);
		contentPane.add(textAreaLabel, BorderLayout.WEST);

		boldFontChkBoxMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int style = Font.PLAIN;
				if (boldFontChkBoxMenuItem.isSelected()) {
					style = style | Font.BOLD;
				}
				if (italicFontChkBoxMenuItem.isSelected()) {
					style = style | Font.ITALIC;
				}
				textArea.setFont(new Font(textArea.getFont().getName(), style, textArea.getFont().getSize()));
			}
		});

		italicFontChkBoxMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int style = Font.PLAIN;
				if (boldFontChkBoxMenuItem.isSelected()) {
					style = style | Font.BOLD;
				}
				if (italicFontChkBoxMenuItem.isSelected()) {
					style = style | Font.ITALIC;
				}
				textArea.setFont(new Font(textArea.getFont().getName(), style, textArea.getFont().getSize()));
			}
		});

		arialFontRadioBtnMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setFont(new Font("Arial", textArea.getFont().getStyle(), textArea.getFont().getSize()));
			}
		});

		tnmFontRadioBtnMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setFont(
						new Font("Times New Roman", textArea.getFont().getStyle(), textArea.getFont().getSize()));
			}
		});

		tahomaFontRadioBtnMenuItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.setFont(new Font("Tahoma", textArea.getFont().getStyle(), textArea.getFont().getSize()));
			}
		});
	}
}