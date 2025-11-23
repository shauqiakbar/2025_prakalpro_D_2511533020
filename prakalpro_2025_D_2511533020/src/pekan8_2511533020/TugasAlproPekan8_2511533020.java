package alprotugas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;


import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TugasAlproPekan8_2511533020 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtLogika1;
	private JTextField txtLogika2;
	private JTextField txtHasil;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JComboBox CbOperator;
	private JButton btnNewButton_1;

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
					TugasAlproPekan8_2511533020 frame = new TugasAlproPekan8_2511533020();
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
	public TugasAlproPekan8_2511533020() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtLogika1 = new JTextField();
		txtLogika1.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogika1.setBounds(197, 52, 58, 17);
		contentPane.add(txtLogika1);
		txtLogika1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("OPERATOR LOGIKA");
		lblNewLabel.setBounds(143, 11, 152, 17);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel);
		
		
		txtLogika2 = new JTextField();
		txtLogika2.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogika2.setColumns(10);
		txtLogika2.setBounds(197, 88, 58, 17);
		contentPane.add(txtLogika2);
		
		lblNewLabel_4 = new JLabel("HASIL");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(10, 206, 163, 14);
		contentPane.add(lblNewLabel_4);
		
		txtHasil = new JTextField();
		txtHasil.setEditable(false);
		txtHasil.setHorizontalAlignment(SwingConstants.CENTER);
		txtHasil.setColumns(10);
		txtHasil.setBounds(197, 204, 58, 17);
		contentPane.add(txtHasil);
		
		CbOperator = new JComboBox();
		CbOperator.setModel(new DefaultComboBoxModel(new String[] {"&&", "||", "!"}));
		CbOperator.setBounds(197, 141, 58, 22);
		contentPane.add(CbOperator);
		
		
		lblNewLabel_1 = new JLabel("Input 1 (true/false)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(23, 54, 136, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Input 2 (true/false)");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(23, 90, 136, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("OPERATOR");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(23, 145, 136, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("HASIL");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(23, 206, 136, 14);
		contentPane.add(lblNewLabel_4);
			
		btnNewButton_1 = new JButton("OPERASIKAN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String input1 = txtLogika1.getText().trim().toLowerCase();
		        String input2 = txtLogika2.getText().trim().toLowerCase();
		        String op = CbOperator.getSelectedItem().toString();

		        
		        if (input1.isEmpty()) {
		            pesanPeringatan("Input 1 wajib diisi");
		            return;
		        }

		        
		        if (!input1.equals("true") && !input1.equals("false")) {
		            pesanError("Input harus berupa true atau false");
		            return;
		        }

		        
		        if (!op.equals("!")) {

		            
		            if (input2.isEmpty()) {
		                pesanPeringatan("Input 2 wajib diisi");
		                return;
		            }

		           
		            if (!input2.equals("true") && !input2.equals("false")) {
		                pesanError("Input harus berupa true atau false");
		                return;
		            }
		        }

		       
		        boolean a = Boolean.parseBoolean(input1);
		        boolean b = Boolean.parseBoolean(input2);
		        boolean hasil = false;

		        switch (op) {
		            case "&&":
		                hasil = a && b;
		                break;

		            case "||":
		                hasil = a || b;
		                break;

		            case "!":
		                hasil = !a;
		                break;
		        }

		        txtHasil.setText(String.valueOf(hasil));
		    }

		});
		btnNewButton_1.setBounds(293, 141, 89, 23);
		contentPane.add(btnNewButton_1);
		

	}
}
