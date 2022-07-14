package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons {
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		addNumbers.addActionListener(e-> {String first=JOptionPane.showInputDialog("Give me a number");
		String second=JOptionPane.showInputDialog("Give me another number");
		int addone=Integer.parseInt(first);
		int addtwo=Integer.parseInt(second);
		int added=addone+addtwo;
		System.out.println(first+"+"+second+"="+added);
		}
				);
		randNumber.addActionListener(e->{
			Random ran= new Random();
			int num=ran.nextInt();
			System.out.println(num);
		});
		tellAJoke.addActionListener(e->System.out.println("Miso happy udon even know"));

		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons(); 	
		
	}
	
	
}
