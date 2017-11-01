package userInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.awt.Font;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 785, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		Component horizontalStrut_11 = Box.createHorizontalStrut(120);
		panel.add(horizontalStrut_11);
		
		JLabel lblAssfjadgjadiogkad = new JLabel("Ma");
		lblAssfjadgjadiogkad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblAssfjadgjadiogkad);
		
		Component horizontalStrut_7 = Box.createHorizontalStrut(130);
		panel.add(horizontalStrut_7);
		
		JLabel lblTi = new JLabel("Ti");
		lblTi.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblTi);
		
		Component horizontalStrut_8 = Box.createHorizontalStrut(100);
		panel.add(horizontalStrut_8);
		
		JLabel lblKe = new JLabel("Ke");
		lblKe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblKe);
		
		Component horizontalStrut_9 = Box.createHorizontalStrut(100);
		panel.add(horizontalStrut_9);
		
		JLabel lblTo = new JLabel("To");
		lblTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblTo);
		
		Component horizontalStrut_10 = Box.createHorizontalStrut(100);
		panel.add(horizontalStrut_10);
		
		JLabel lblPe = new JLabel("Pe");
		lblPe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel.add(lblPe);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.WEST);
		
		Component horizontalStrut_12 = Box.createHorizontalStrut(130);
		panel_4.add(horizontalStrut_12);
		
		JPanel panel_5 = new JPanel();
		panel_1.add(panel_5, BorderLayout.CENTER);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_6 = new JPanel();
		panel_5.add(panel_6, BorderLayout.WEST);
		
		Component horizontalStrut_13 = Box.createHorizontalStrut(130);
		panel_6.add(horizontalStrut_13);
		
		JPanel panel_7 = new JPanel();
		panel_5.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_8 = new JPanel();
		panel_7.add(panel_8, BorderLayout.WEST);
		
		Component horizontalStrut_14 = Box.createHorizontalStrut(130);
		panel_8.add(horizontalStrut_14);
		
		JPanel panel_9 = new JPanel();
		panel_7.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_10 = new JPanel();
		panel_9.add(panel_10, BorderLayout.WEST);
		
		Component horizontalStrut_15 = Box.createHorizontalStrut(130);
		panel_10.add(horizontalStrut_15);
		
		JPanel panel_11 = new JPanel();
		panel_9.add(panel_11, BorderLayout.CENTER);
		
		Component horizontalStrut_16 = Box.createHorizontalStrut(130);
		panel_11.add(horizontalStrut_16);
		
		JPanel panel_2 = new JPanel();
		frame.getContentPane().add(panel_2, BorderLayout.WEST);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.Y_AXIS));
		
		Component horizontalStrut_4 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_4);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_1);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		panel_2.add(lblNewLabel);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(80);
		panel_2.add(horizontalStrut_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_2);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_2);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_3);
		
		Component horizontalStrut_3 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setAlignmentX(Component.CENTER_ALIGNMENT);
		panel_2.add(lblNewLabel_4);
		
		Component horizontalStrut_5 = Box.createHorizontalStrut(20);
		panel_2.add(horizontalStrut_5);
		
		JPanel panel_3 = new JPanel();
		frame.getContentPane().add(panel_3, BorderLayout.SOUTH);
		
		JButton btnKaksiButton = new JButton("Add");
		panel_3.add(btnKaksiButton);
		
		Component horizontalStrut_6 = Box.createHorizontalStrut(50);
		panel_3.add(horizontalStrut_6);
		
		JButton btnYksiButton = new JButton("Remove");
		panel_3.add(btnYksiButton);
	}

}
