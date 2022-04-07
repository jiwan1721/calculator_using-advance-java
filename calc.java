package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;//calculator ko main window banauda kam lagxa
//botton haru etc.
import javax.swing.JPanel;//calculator ma huney screen ko lagi use hunxa
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class calc implements ActionListener{//yo chaii last ma gareko kina garya tha xaina
	//Actionlistner le casting issue laii solve garxa re
	JFrame frame = new JFrame();
	JPanel pannel = new JPanel();
	JTextArea textArea = new JTextArea(2, 14);// calculator ma kati row column huncxa vanew input dina

	// calculator ma botton haru banako
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JButton btn3 = new JButton();
	JButton btn4 = new JButton();
	JButton btn5 = new JButton();
	JButton btn6 = new JButton();
	JButton btn7 = new JButton();
	JButton btn8 = new JButton();
	JButton btn9 = new JButton();
	JButton btn0 = new JButton();

	JButton btnadd = new JButton();
	JButton btnsub = new JButton();
	JButton btnmul = new JButton();
	JButton btndiv = new JButton();
	JButton btnclear = new JButton();
	JButton btndot = new JButton();
	JButton btnequal = new JButton();

	double number1, number2;
	double result;
	int add = 0, sub = 0, mul = 0, div = 0;

	public calc() {// constructor banako
		frame.setSize(450, 550); // calculator ko size fix gareko
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// calculator close garda chahiney tool
		frame.setVisible(true);// calculator laii display ma show garna laii
		frame.setTitle("Sambho");// calculator ko ya application ko nam rakheko
		// frame.setResizable(false);//calculator ko size aautai hunxa

		frame.add(pannel);
		pannel.setBackground(Color.BLUE);// pannel ko color set gareko
		Border border = BorderFactory.createLineBorder(Color.cyan); // border rakhera border ko color fix gareko

		pannel.add(textArea);// pannel add gareko ho
		textArea.setBackground(Color.white);

		Border jboBorder = BorderFactory.createLineBorder(Color.blue);
		textArea.setBorder(jboBorder);

		Font font = new Font("arial", Font.BOLD, 33); // text fix gareko
		textArea.setFont(font);
		textArea.setForeground(Color.black);

		textArea.setPreferredSize(new Dimension(2, 14));// prefer gareko size rakhna lai
		textArea.setLineWrap(true);

		btn1.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn1.setIcon(new ImageIcon("f:\\1.png"));
		pannel.add(btn1); // button laii display gareko

		btn2.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn2.setIcon(new ImageIcon("f:\\2b.png"));
		pannel.add(btn2);

		btn3.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn3.setIcon(new ImageIcon("f:\\3b.png"));
		pannel.add(btn3);

		btn4.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn4.setIcon(new ImageIcon("f:\\4.png"));
		pannel.add(btn4);

		btn5.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn5.setIcon(new ImageIcon("f:\\5.png"));
		pannel.add(btn5);

		btn6.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn6.setIcon(new ImageIcon("f:\\6.png"));
		pannel.add(btn6);

		btn7.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn7.setIcon(new ImageIcon("f:\\7.png"));
		pannel.add(btn7);

		btn8.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn8.setIcon(new ImageIcon("f:\\8.png"));
		pannel.add(btn8);

		btn9.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn9.setIcon(new ImageIcon("f:\\9.png"));
		pannel.add(btn9);

		btn0.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btn0.setIcon(new ImageIcon("f:\\0.png"));
		pannel.add(btn0);

		btnadd.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btnadd.setIcon(new ImageIcon("f:\\plus.png"));
		pannel.add(btnadd);

		btnsub.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btnsub.setIcon(new ImageIcon("f:\\minus.png"));
		pannel.add(btnsub);

		btndiv.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btndiv.setIcon(new ImageIcon("f:\\div.png"));
		pannel.add(btndiv);

		btnmul.setPreferredSize(new Dimension(75, 50));// button ko size fix garko
		btnmul.setIcon(new ImageIcon("f:\\multiply.gif"));
		pannel.add(btnmul);
		
		btndot.setPreferredSize(new Dimension(75,50));
		btndot.setIcon(new ImageIcon("f:\\point.gif"));
		pannel.add(btndot);

		btnequal.setPreferredSize(new Dimension(75, 50));
		btnequal.setIcon(new ImageIcon("f:\\equal.png"));
		pannel.add(btnequal);

		btnclear.setPreferredSize(new Dimension(75, 50));
		btnclear.setIcon(new ImageIcon("f:\\clear.png"));
		pannel.add(btnclear);// hamle rakheko png file laii button vittra display gareko

		// button haru lai action perform garauna laii
		btn1.addActionListener((ActionListener) this);
		btn2.addActionListener((ActionListener) this);
		btn3.addActionListener((ActionListener) this);
		btn4.addActionListener((ActionListener) this);
		btn5.addActionListener((ActionListener) this);
		btn6.addActionListener((ActionListener) this);
		btn7.addActionListener((ActionListener) this);
		btn8.addActionListener((ActionListener) this);
		btn9.addActionListener((ActionListener) this);
		btn0.addActionListener((ActionListener) this);
		btnadd.addActionListener((ActionListener) this);
		btnsub.addActionListener((ActionListener) this);
		btndiv.addActionListener((ActionListener) this);
		btnmul.addActionListener((ActionListener) this);
		btndot.addActionListener((ActionListener) this);
		btnclear.addActionListener((ActionListener) this);
		btnequal.addActionListener((ActionListener) this);

	}
	

	public void actionPerformed(ActionEvent e) { // hamley calculator bata input linako lagi
		Object source = (Object) e.getSource(); //yo line vayana vane hami calculator ma num input dina sakdainam
		//mul,div operation haru keii kam gardainan
		
		
		//Object source=new Object();
		
		if(source==btnclear) {
			number1=0.0;
			number2=0.0;
			textArea.setText("");
		}
		if(source==btn1) {
			textArea.append("1");
		}
		if(source==btn2) {
			textArea.append("2");
		}
		if(source==btn3) {
			textArea.append("3");
		}
		if(source==btn4) {
			textArea.append("4");
		}
		if(source==btn5) {
			textArea.append("5");
		}
		if(source==btn6) {
			textArea.append("6");
		}
		if(source==btn7) {
			textArea.append("7");
		}
		if(source==btn8) {
			textArea.append("8");
		}
		if(source==btn9) {
			textArea.append("9");
		}
		if(source==btn0) {
			textArea.append("0");
		}
		if(source==btndot) {
			textArea.append(".");
		}
		if (source==btnadd) {
			number1=number_reader();
			
			textArea.setText("+");
			add=1;
			div=0;
			sub=0;
			mul=0;
		}
		if (source==btndiv) {
			number1=number_reader();
			
			textArea.setText("/");
			add=0;
			div=1;
			sub=0;
			mul=0;
		}
		if (source==btnsub) {
			number1=number_reader();
			
			textArea.setText("-");
			add=0;
			div=0;
			sub=1;
			mul=0;
		}
		if (source==btnmul) {
			number1=number_reader();
			
			textArea.setText("*");
			add=0;
			div=0;
			sub=0;
			mul=1;
		}
		if (source==btnequal) {
			
			number2=number_reader();
			if(add>0) {
				result=number1+number2;
				textArea.setText(Double.toString(result));
			}
			if(sub>0) {
				result=number1-number2;
				textArea.setText(Double.toString(result));
				
			}
			if(mul>0) {
				result=number1*number2;
				textArea.setText(Double.toString(result));
			}
			if(div>0) {
				result=number1/number2;
				textArea.setText(Double.toString(result));
			}
			
		}

	}
	
	public double number_reader() {
		double num1;
		String string;
		string = textArea.getText();
		num1=Double.valueOf(string);
		return num1;
	}

}
