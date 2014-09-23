package com.privacyfix.core;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;







public class Swing extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final Component JMenuBar = null;
	private JMenu textField;
	private TextArea a;
	private JCheckBox checkbox;

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		new Swing() ;

			
	}
//create frame
	public Swing() throws HeadlessException{
		super();
		
		setTitle("Automation script runner");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBackground(Color.BLUE);
		setAlwaysOnTop(true);
		setTitle("Menu");
		
	




		setPreferredSize(new Dimension(500,400));
		setLocationRelativeTo(null);
		setSize(500,400);
	    addComponents(getContentPane());
		pack();
		
		setVisible(true);
		
	}
//add components 
	@SuppressWarnings("deprecation")
	private void addComponents(Container contentPane) {
		contentPane.setLayout(new BorderLayout());
		contentPane.add(new JPanel(),BorderLayout.NORTH);
//button
		JButton b = new JButton("Run");
		b.setToolTipText("Confirm button");
		b.addActionListener(new ActionListener() {
			

			@Override
			public void actionPerformed(ActionEvent e) {
				
				//a.setText(textField.getText());
				checkbox.getItemListeners();
				if(checkbox.isSelected()){
					System.out.println("Perform selected script");
					System.out.println(checkbox.getLabel());
					a.setText(checkbox.getLabel()+" was selected");	
		
				Thread t =new Thread(){
					
		   
				 
					
					};t.start();
					

				}}
		});
		
		contentPane.add(b,BorderLayout.EAST);
		
//Text field		
		JMenuBar menuBar = new JMenuBar();
		ImageIcon icon = new ImageIcon("images/Capture.png");
		menuBar.setAlignmentY(TOP_ALIGNMENT);
		
		
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		file.setAlignmentY(TOP_ALIGNMENT);
		
		JMenuItem eMenuItem = new JMenuItem("Exit", icon);
		
		eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.setToolTipText("Exit application");
        eMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }});
        
		file.add(eMenuItem);
		menuBar.add(file);
		setJMenuBar(menuBar);

		setTitle("Menu");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane.add(menuBar);
		
		
		a = new TextArea("blabla");
		contentPane.add(a,BorderLayout.SOUTH);
//Check box
		checkbox = new JCheckBox("TC name");
		checkbox.setSelected(false);
		checkbox.setToolTipText(checkbox.getLabel());
		checkbox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent o) {
				a.setText(o.getStateChange()==1?"checked":"unchecked");

				
			}
		});

			

		contentPane.add(checkbox,BorderLayout.CENTER);
		
	}

	
}
