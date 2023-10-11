import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame1 {

	private JFrame frame;
	private JTextField textField;
	
	//Setting up global variables to take in the numbers pressed
	//on the calculator and the operations pressed on the calculator
	//Also creating a result variable to store the answer in and an answer 
	//variable so we can display the result to the user
	double first_num;
	double second_num;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame1 window = new Frame1();
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
	public Frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 492, 697);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//Setting up a text field which acts like the screen on a calculator
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 24, 458, 77);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//creating all the buttons on the calculator  
		//they all use action listener, which basically listens out
		//for a users input. SOme of the buttons are initialized with differnt background colours
		JButton clear = new JButton("AC");
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		clear.setBackground(Color.ORANGE);
		clear.setFont(new Font("Stencil", Font.BOLD, 20));
		clear.setBounds(353, 146, 85, 44);
		frame.getContentPane().add(clear);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
			}
		});
		plus.setFont(new Font("Stencil", Font.BOLD, 20));
		plus.setBackground(Color.GRAY);
		plus.setBounds(353, 227, 85, 44);
		frame.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		minus.setFont(new Font("Stencil", Font.BOLD, 30));
		minus.setBackground(Color.GRAY);
		minus.setBounds(353, 314, 85, 44);
		frame.getContentPane().add(minus);
		
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		divide.setFont(new Font("Stencil", Font.BOLD, 20));
		divide.setBackground(Color.GRAY);
		divide.setBounds(353, 408, 85, 44);
		frame.getContentPane().add(divide);
		
		JButton multiply = new JButton("x");
		multiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first_num=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		multiply.setFont(new Font("Stencil", Font.BOLD, 20));
		multiply.setBackground(Color.GRAY);
		multiply.setBounds(353, 491, 85, 44);
		frame.getContentPane().add(multiply);
		
		JButton nine = new JButton("9");
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+nine.getText();
				textField.setText(button);
			}
		});
		nine.setFont(new Font("Stencil", Font.BOLD, 20));
		nine.setBackground(Color.GRAY);
		nine.setBounds(241, 176, 85, 44);
		frame.getContentPane().add(nine);
		
		JButton eight = new JButton("8");
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+eight.getText();
				textField.setText(button);
			}
		});
		eight.setFont(new Font("Stencil", Font.BOLD, 20));
		eight.setBackground(Color.GRAY);
		eight.setBounds(125, 176, 85, 44);
		frame.getContentPane().add(eight);
		
		JButton seven = new JButton("7");
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+seven.getText();
				textField.setText(button);
			}
		});
		seven.setFont(new Font("Stencil", Font.BOLD, 20));
		seven.setBackground(Color.GRAY);
		seven.setBounds(10, 176, 85, 44);
		frame.getContentPane().add(seven);
		
		JButton six = new JButton("6");
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+six.getText();
				textField.setText(button);
			}
		});
		six.setFont(new Font("Stencil", Font.BOLD, 20));
		six.setBackground(Color.GRAY);
		six.setBounds(241, 269, 85, 44);
		frame.getContentPane().add(six);
		
		JButton three = new JButton("3");
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+three.getText();
				textField.setText(button);
			}
		});
		three.setFont(new Font("Stencil", Font.BOLD, 20));
		three.setBackground(Color.GRAY);
		three.setBounds(241, 363, 85, 44);
		frame.getContentPane().add(three);
		
		JButton zero = new JButton("0");
		zero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+zero.getText();
				textField.setText(button);
			}
		});
		zero.setFont(new Font("Stencil", Font.BOLD, 20));
		zero.setBackground(Color.GRAY);
		zero.setBounds(125, 450, 85, 44);
		frame.getContentPane().add(zero);
		
		JButton five = new JButton("5");
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+five.getText();
				textField.setText(button);
			}
		});
		five.setFont(new Font("Stencil", Font.BOLD, 20));
		five.setBackground(Color.GRAY);
		five.setBounds(125, 269, 85, 44);
		frame.getContentPane().add(five);
		
		JButton four = new JButton("4");
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+four.getText();
				textField.setText(button);
			}
		});
		four.setFont(new Font("Stencil", Font.BOLD, 20));
		four.setBackground(Color.GRAY);
		four.setBounds(10, 269, 85, 44);
		frame.getContentPane().add(four);
		
		JButton one = new JButton("1");
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+one.getText();
				textField.setText(button);
			}
		});
		one.setFont(new Font("Stencil", Font.BOLD, 20));
		one.setBackground(Color.GRAY);
		one.setBounds(10, 363, 85, 44);
		frame.getContentPane().add(one);
		
		JButton two = new JButton("2");
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+two.getText();
				textField.setText(button);
			}
		});
		two.setFont(new Font("Stencil", Font.BOLD, 20));
		two.setBackground(Color.GRAY);
		two.setBounds(125, 363, 85, 44);
		frame.getContentPane().add(two);
		
		JButton dot = new JButton(".");
		dot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String button = textField.getText()+dot.getText();
				textField.setText(button);
			}
		});
		dot.setFont(new Font("Stencil", Font.BOLD, 20));
		dot.setBackground(Color.GRAY);
		dot.setBounds(10, 450, 85, 44);
		frame.getContentPane().add(dot);
		
		//creating the equals button 
		JButton equals = new JButton("=");
		equals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second_num=Double.parseDouble(textField.getText());
				
				//using a simple if else statement to work 
				//out the answer to the sum depending on what operation the
				//user has decided to go for.
				if(operation == "+") {
					result = first_num + second_num;
					answer=String.format("%.2f", result);
					textField.setText(answer);	
				}else if(operation == "-") {
					result = first_num - second_num;
					answer=String.format("%.2f", result);
					textField.setText(answer);	
				}else if(operation == "*") {
					result = first_num * second_num;
					answer=String.format("%.2f", result);
					textField.setText(answer);	
				}else {
					result = first_num / second_num;
					answer=String.format("%.2f", result);
					textField.setText(answer);	
				}
				
			}
		});
		equals.setFont(new Font("Stencil", Font.BOLD, 20));
		equals.setBackground(Color.GRAY);
		equals.setBounds(241, 450, 85, 44);
		frame.getContentPane().add(equals);
	}
}
