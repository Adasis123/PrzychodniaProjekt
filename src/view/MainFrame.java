package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("PRZYCHODNIA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setMinimumSize(new Dimension(900, 680));
		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
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

}
