package bt06;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.ComponentOrientation;

import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class BT06 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BT06 frame = new BT06();
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
	public BT06() {
		setTitle("BT06");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 1, 0, 0));
		
		DefaultListModel<String> bookModel = new DefaultListModel<>();
        bookModel.addElement("Văn học");
        bookModel.addElement("Khoa học");
        bookModel.addElement("Lịch sử");
        bookModel.addElement("Công nghệ");
        bookModel.addElement("Thể thao");
        bookModel.addElement("Văn hóa");
        
		JList<String> BookList = new JList<>(bookModel);
		JScrollPane bookScrollPane = new JScrollPane(BookList);
		contentPane.add(bookScrollPane);	
		
		JButton SubmitBtn = new JButton("Submit");
		contentPane.add(SubmitBtn);
		
		DefaultListModel<String> selectedModel = new DefaultListModel<>();		
		JList<String> SelectedList = new JList<>(selectedModel);
		JScrollPane selectedScrollPane = new JScrollPane(SelectedList);
		contentPane.add(selectedScrollPane);
		
		SubmitBtn.addActionListener(e -> {
			selectedModel.clear();
			for (String book : BookList.getSelectedValuesList()) {
				selectedModel.addElement(book);
			}
		});
	}
}