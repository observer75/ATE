import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
//import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
//import javax.swing.JPanel;
import javax.swing.JTextField;
//import javax.swing.JTextPane;
//import javax.swing.JList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import org.eclipse.wb.swing.FocusTraversalOnArray;
//import java.awt.TextField;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	private static double a1;
	private static double b1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					Calculator_f fcalc = new Calculator_f(a1, b1);
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 395, 351);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setAlignmentX(Component.RIGHT_ALIGNMENT);
		textField.setEditable(false);
		textField.setBounds(26, 11, 332, 67);
		textField.setText("0");
		frame.getContentPane().add(textField);
		textField.setColumns(15);
		
		JButton button_1 = new JButton("1");
		button_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent arg0) {
			}
		});
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//System.out.println(textField.getText());
				//try {
				Double zero = Double.parseDouble(textField.getText());
								//System.out.println(zero);
				if (zero == 0){
					textField.setText("1");
					//System.out.println(textField.getText() + "A");
					//textField.setText(textField.getText() + "1");
				} else textField.setText(textField.getText() + "1");
				//} catch (Exception e) {
				//	e.printStackTrace();
				//}
				//textField.setText(textField.getText() + "1");
				//System.out.println(textField.getText());
				
				//if (textField.getText() != "0") {
				//textField.setText(textField.getText() + "1");
				//}
				//textField.setText(textField.getText() + "1");
				
				//textField.setText(Double.toString(a1));
//				String b = textField.getText() + "1";
//				String a = "";
//				
		}
		});
		
		button_1.setBounds(26, 89, 74, 33);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("2");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("2");
				} else textField.setText(textField.getText() + "2");
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setBounds(110, 89, 76, 33);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("3");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("3");
				} else textField.setText(textField.getText() + "3");

			}
		});
		button_3.setBounds(196, 89, 76, 33);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("4");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("2");
				} else textField.setText(textField.getText() + "4");
			}
		});
		button_4.setBounds(26, 133, 76, 33);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("5");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("5");
				} else textField.setText(textField.getText() + "5");
			}
		});
		button_5.setBounds(110, 133, 76, 33);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("6");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("6");
				} else textField.setText(textField.getText() + "6");
			}
		});
		button_6.setBounds(196, 133, 76, 33);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("7");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("7");
				} else textField.setText(textField.getText() + "7");

			}
		});
		button_7.setBounds(26, 177, 76, 33);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("8");
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("8");
				} else textField.setText(textField.getText() + "8");
			}
		});
		button_8.setBounds(110, 177, 76, 33);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("9");
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("9");
				} else textField.setText(textField.getText() + "9");
		}
		});
		button_9.setBounds(196, 177, 76, 33);
		frame.getContentPane().add(button_9);
		
		JButton button_0 = new JButton("0");
		button_0.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("0");
				} else textField.setText(textField.getText() + "0");
			}
		});
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_0.setBounds(26, 221, 160, 33);
		frame.getContentPane().add(button_0);
		
		JButton button_comma = new JButton(",");
		button_comma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Double zero = Double.parseDouble(textField.getText());
				if (zero == 0){
					textField.setText("0.");
				} else textField.setText(textField.getText() + ".");
			}
		});
		button_comma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_comma.setBounds(196, 221, 76, 33);
		frame.getContentPane().add(button_comma);
		
		JButton button_divide = new JButton("/");
		button_divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + " / ");
			}
		});
		button_divide.setBounds(282, 89, 76, 33);
		frame.getContentPane().add(button_divide);
		
		JButton button_multiply = new JButton("*");
		button_multiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() + " * ");
			}
		});
		button_multiply.setBounds(282, 133, 76, 33);
		frame.getContentPane().add(button_multiply);
		
		JButton button_minus = new JButton("-");
		button_minus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() + " - ");
			}
		});
		button_minus.setBounds(282, 177, 76, 33);
		frame.getContentPane().add(button_minus);
		
		JButton button_plus = new JButton("+");
		button_plus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() + " + ");
				a1 = Double.parseDouble(textField.getText()); 
			}
		});
		button_plus.setBounds(282, 221, 76, 33);
		frame.getContentPane().add(button_plus);
		
		JButton button_equal = new JButton("=");
		button_equal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() + " = ");
			}
		});
		button_equal.setBounds(196, 265, 162, 33);
		frame.getContentPane().add(button_equal);
		
		JButton button_esc = new JButton("C");
		button_esc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("0");
			}
		});
		button_esc.setBounds(26, 265, 160, 33);
		frame.getContentPane().add(button_esc);
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{textField, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_0, button_comma, button_divide, button_multiply, button_minus, button_plus, button_equal, button_esc}));
	}
}
