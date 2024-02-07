package brasileirao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;

public class frmRegisterTeam extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField edtCode;
	private JTextField edtName;
	private JTextField edtCity;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRegisterTeam frame = new frmRegisterTeam();
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
	public frmRegisterTeam() {
		setTitle("Teams Register");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCode = new JLabel("Code:");
		lblCode.setForeground(SystemColor.textHighlight);
		lblCode.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCode.setBounds(74, 28, 54, 13);
		contentPane.add(lblCode);
		
		edtCode = new JTextField();
		edtCode.setBounds(133, 27, 234, 19);
		contentPane.add(edtCode);
		edtCode.setColumns(10);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(SystemColor.textHighlight);
		lblName.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblName.setBounds(74, 65, 54, 13);
		contentPane.add(lblName);
		
		edtName = new JTextField();
		edtName.setBounds(133, 64, 234, 19);
		contentPane.add(edtName);
		edtName.setColumns(10);
		
		edtCity = new JTextField();
		edtCity.setColumns(10);
		edtCity.setBounds(133, 104, 234, 19);
		contentPane.add(edtCity);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setForeground(SystemColor.textHighlight);
		lblCity.setBackground(SystemColor.desktop);
		lblCity.setFont(new Font("Arial Black", Font.BOLD, 14));
		lblCity.setBounds(74, 102, 54, 18);
		contentPane.add(lblCity);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Arial", Font.BOLD, 12));
		btnAdd.setBounds(48, 163, 85, 21);
		contentPane.add(btnAdd);
		
		JButton btnChange = new JButton("Change");
		btnChange.setFont(new Font("Arial", Font.BOLD, 12));
		btnChange.setBounds(137, 163, 85, 21);
		contentPane.add(btnChange);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setFont(new Font("Arial", Font.BOLD, 12));
		btnCancel.setBounds(226, 163, 85, 21);
		contentPane.add(btnCancel);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Arial", Font.BOLD, 12));
		btnDelete.setBounds(315, 163, 85, 21);
		contentPane.add(btnDelete);
	}
}
