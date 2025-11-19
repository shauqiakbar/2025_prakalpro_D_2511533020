package pekan9_2511533020;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUI_2511533020 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtAngka1;
	private JTextField txtAngka2;
	private JTextField txtHasil;
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Peringatan", JOptionPane.WARNING_MESSAGE );
	}
	private void pesanError(String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Error", JOptionPane.ERROR_MESSAGE );
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUI_2511533020 frame = new OperatorAritmatikaGUI_2511533020();
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
	public OperatorAritmatikaGUI_2511533020() {
		setTitle("ProgramUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 304);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMATIKA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(38, 11, 213, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Angka 1");
		lblNewLabel_1.setBounds(10, 54, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Angka 2");
		lblNewLabel_2.setBounds(10, 79, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Operator");
		lblNewLabel_3.setBounds(10, 133, 66, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Hasil");
		lblNewLabel_4.setBounds(10, 216, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		txtAngka1 = new JTextField();
		txtAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka1.setBounds(66, 48, 86, 20);
		contentPane.add(txtAngka1);
		txtAngka1.setColumns(10);
		
		txtAngka2 = new JTextField();
		txtAngka2.setHorizontalAlignment(SwingConstants.CENTER);
		txtAngka2.setBounds(66, 79, 86, 20);
		contentPane.add(txtAngka2);
		txtAngka2.setColumns(10);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setBounds(66, 213, 86, 17);
		contentPane.add(txtHasil);
		txtHasil.setColumns(10);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(66, 133, 66, 23);
		contentPane.add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (txtAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				} else if(txtAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
				} else { 
					try {
						int a = Integer.valueOf(txtAngka1.getText());
						int b = Integer.parseInt(txtAngka2.getText());
						int c = cbOperator.getSelectedIndex();
						
						if (c==0) { hasil = a + b; }
						
						if (c==1) { hasil = a - b; }
						
						if (c==2) { hasil = a * b; }
						
						if (c==3) { hasil = a / b; }
						
						if (c==4) { hasil = a % b; }
						
						txtHasil.setText(String.valueOf(hasil));	
					} catch (NumberFormatException ex) {
						pesanError("Angka 1 dan Angka 2 tidak valid") ;
					}
					
				}
				
			}
		});
		btnNewButton.setBounds(142, 129, 89, 23);
		contentPane.add(btnNewButton);

	}
}
