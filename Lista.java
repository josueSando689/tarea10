package tarea10;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JTextField;
import javax.swing.JMenu;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JCheckBox;
import java.awt.Color;

public class Lista extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;


	
	public Lista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(33, 21, 86, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(33, 72, 86, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(33, 122, 86, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(33, 170, 86, 30);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(33, 219, 86, 30);
		contentPane.add(textField_4);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("LISTA");
		lblNewJgoodiesLabel.setBounds(156, 0, 92, 14);
		contentPane.add(lblNewJgoodiesLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Listo");
		chckbxNewCheckBox.setBounds(128, 28, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Listo");
		chckbxNewCheckBox_1.setBounds(128, 76, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_1_1 = new JCheckBox("Listo");
		chckbxNewCheckBox_1_1.setBounds(128, 121, 97, 23);
		contentPane.add(chckbxNewCheckBox_1_1);
		
		JCheckBox chckbxNewCheckBox_1_2 = new JCheckBox("Listo");
		chckbxNewCheckBox_1_2.setBounds(128, 169, 97, 23);
		contentPane.add(chckbxNewCheckBox_1_2);
		
		JCheckBox chckbxNewCheckBox_1_3 = new JCheckBox("Listo");
		chckbxNewCheckBox_1_3.setBounds(128, 218, 97, 23);
		contentPane.add(chckbxNewCheckBox_1_3);
	}
}
