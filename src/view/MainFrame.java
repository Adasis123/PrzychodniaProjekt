package view;

import java.awt.BorderLayout;
import java.awt.Dimension;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;


public class MainFrame extends JFrame {

	private static final int WIDTH = 900;
	private static final int HEIGHT = 680;
	private JPanel contentPane = new JPanel();
	private JButton btnVisits;
	private JButton btnPatients;
	private JButton btnDoctors;

	

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setTitle("PRZYCHODNIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(WIDTH, HEIGHT));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel main_panel = new JPanel();
		contentPane.add(main_panel, BorderLayout.CENTER);
		
		JPanel top_panel = new JPanel();
		top_panel.setBorder(new EmptyBorder(5, 0, 5, 0));
		contentPane.add(top_panel, BorderLayout.NORTH);
		
		JButton btnVisits = new JButton("Wizyty");
		btnVisits.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		top_panel.add(btnVisits);
		
		JButton btnPatients = new JButton("Pacjenci");
		btnPatients.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		top_panel.add(btnPatients);
		
		JButton btnDoctors = new JButton("Lekarze");
		btnDoctors.setFont(new Font("Lucida Grande", Font.BOLD, 23));
		top_panel.add(btnDoctors);
	}
	
	
	public JButton getBtnVisits() {
		return btnVisits;
	}
	
	public JButton getBtnPatients() {
		return btnPatients;
	}

	public JButton getBtnDoctors() {
		return btnDoctors;
	}
}
