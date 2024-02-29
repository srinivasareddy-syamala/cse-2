package sample;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ECOMMERCE {

	private JFrame frame;
    int items=0;
    int bill=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ECOMMERCE window = new ECOMMERCE();
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
	public ECOMMERCE() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(102, 205, 170));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("E COMMERCE APP");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(141, 11, 156, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel L1 = new JLabel("CART : 0");
		L1.setBounds(307, 27, 94, 14);
		frame.getContentPane().add(L1);
		
		JLabel lblNewLabel_4 = new JLabel("  RS: 290");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBackground(new Color(0, 0, 128));
		lblNewLabel_4.setBounds(50, 232, 72, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("RS:800");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(217, 233, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton b1 = new JButton("");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					items=items+1;
					bill=bill+290;
				 L1.setText(" CART :"+items);	
			}
		});
		b1.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\book1.png"));
		b1.setBounds(10, 46, 163, 175);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				items=items+1;
				bill=bill+800;
				L1.setText("CART :"+items);
			}
		});
		b2.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\IMG3.jpg"));
		b2.setBounds(183, 46, 114, 165);
		frame.getContentPane().add(b2);
		
		JButton btnNewButton_2 = new JButton("BUY");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(btnNewButton_2, "number of items "+items+"\n total bill "+bill);
			}
		});
		btnNewButton_2.setBounds(355, 229, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}

}
