package controller;

import javax.swing.JButton;

import view.MainFrame;

public class MainController {
	
	private MainFrame mainFrame;
	private JButton btnVisits;
	private JButton btnPatients;
	private JButton btnDoctors;

	public MainController() {
		initComponents();
		
	}
	
	public void showMainFrameWindow() {
        mainFrame.setVisible(true);
    }

	private void initComponents() {
		mainFrame = new MainFrame();
		
	}
}
