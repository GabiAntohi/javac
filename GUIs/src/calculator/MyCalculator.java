package calculator;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class MyCalculator extends JFrame /*implements ActionListener*/{
	
	public MyCalculator(){
			super("Calculator");
			setSize (350, 250); //width/height
			setDefaultCloseOperation(EXIT_ON_CLOSE); // make the x button work
			setLocation(150, 100); //x and y, where the frame opens
			setLayout(null);
			initComponents();
			//setVisible(true); - invisible by default, last thing in constructor
		}
	private void initComponents(){// create all components and add them to the frame, set the properties
		JLabel lblFirst = new JLabel("First");
		add(lblFirst);//adds the label to this frame
		JLabel lblSecond = new JLabel("Second");
		add(lblSecond);
		JLabel lblResultHeading = new JLabel("Result");
		add(lblResultHeading);
		 lblResult = new JLabel();//removed the variable declaration, they are now global
		add(lblResult);
		 txtFirst = new JTextField();
		add(txtFirst);
		JLabel lblPlus = new JLabel("+");
		add(lblPlus);
		 txtSecond = new JTextField();
		add(txtSecond);
		JLabel lblEqual = new JLabel("=");
		add(lblEqual);
		JButton btnCalculate = new JButton ("Calculate");
		add(btnCalculate);
		lblFirst.setBounds(50, 20, 80, 50);//x, y, width, height
		lblSecond.setBounds(150, 20, 80, 50);
		lblResult.setBounds(245, 80, 50, 50);
		lblResult.setBorder(new BevelBorder(BevelBorder.LOWERED));
		lblResultHeading.setBounds(250, 20, 80, 50);
		txtFirst.setBounds(40, 80, 50, 50);
		lblPlus.setBounds(115, 60, 80, 80);
		txtSecond.setBounds(147, 80, 50, 50);
		lblEqual.setBounds(217, 60, 80, 80);
		btnCalculate.setBounds(225, 150, 90, 40);
		//btnCalculate.addActionListener(this); //when it's clicked go to class mentioned in the parameter 
		//action listener is an interface therefore there is a class that implements the actionlistener interface
		
	
	btnCalculate.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e){
			calculateButtonPressed();
			
		}

			}
			
			
			);
	btnCalculate.addKeyListener(new KeyListener(){
		public void keyTyped(KeyEvent e) {}
	
		public void keyReleased (KeyEvent e){
			if (e.getKeyCode()==KeyEvent.VK_ENTER)
				btnCalculate.doClick();
			
			
		}
		
		
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	});}
	
	private void calculateButtonPressed(){
		
		try{
		int num1 = Integer.parseInt(txtFirst.getText());//gets text from textField as a string, convert the string into an int
		
		try{
		int num2 = Integer.parseInt(txtSecond.getText());
		int result = num1+num2;
		lblResult.setText("" + result);//turn int into string, Integer.toString(result)
		}catch (NumberFormatException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "type an int for the second number");
			txtSecond.requestFocus();
			txtSecond.selectAll();//select all the text
		}

		}catch (NumberFormatException e){
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "type an int for the first number");
			txtFirst.requestFocus();
			txtFirst.selectAll();//select all the text
	
		}
	

	}
	
	public static void main(String[] args) {
	
		new MyCalculator().setVisible(true);
	}
	
//	public void actionPerformed(ActionEvent e) {
	//	JOptionPane.showMessageDialog(this, "Button was clicked");
		
//	}

	
	
	
	//member variables
	private JTextField txtFirst;
	private JTextField txtSecond;
	private JLabel lblResult;
	
	
}// end of class
