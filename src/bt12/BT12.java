package  bt12;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class BT12 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Color penColor = Color.BLACK;
    private int penSize = 1;
    private int startX = 300, startY = 300 , endX = 700, circleSize = 200;
    private JSlider sizeSlider;
    private JPanel drawingPanel;

    public BT12() {
        setTitle("BT12");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        drawingPanel = new JPanel() {
            /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(penColor);

                circleSize = (int)((endX - startX)*sizeSlider.getValue()/sizeSlider.getMaximum());
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(penSize));
                g2d.drawOval( startX, startY, circleSize, circleSize);
            }
        };
     
        sizeSlider = new JSlider(JSlider.HORIZONTAL, 10, 200, 100);
        sizeSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {              
                drawingPanel.repaint();
            }
        });
        
        drawingPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                startX = e.getX();
                startY = e.getY();
                endX = startX;
                drawingPanel.repaint();
            }
        });
        drawingPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                endX = e.getX();
                e.getY();
                drawingPanel.repaint();
            }
        });

        add(drawingPanel, BorderLayout.CENTER);
        add(sizeSlider, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BT12 app = new BT12();
            app.setVisible(true);
        });
    }
}
