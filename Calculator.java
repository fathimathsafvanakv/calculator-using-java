import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
/*creating frame object*/
	JFrame jf;
/*creating displaylabel object*/
	JLabel displaylabel;
/*creating button objects*/
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton threebutton;
	JButton twobutton;
	JButton onebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton divbutton;
	JButton mulbutton;
	JButton subbutton;
	JButton addbutton;
	JButton clearbutton;
/*setting a boolean variable*/
	boolean isoperandclicked=false;
/*setting two string variables*/
	String oldValue;
	String newValue;
/*setting an operator variable*/
	int operator;
/*setting a float variable to store result*/
	float result;
	
public Calculator()
{
	/*setting frame properties*/
	jf=new JFrame("Calculator");
	jf.setLayout(null);
	jf.setSize(600, 600);
	jf.setLocation(200, 200);
	/*setting label properties*/
	displaylabel=new JLabel();
	displaylabel.setBounds(30, 40, 540, 40);
	displaylabel.setBackground(Color.YELLOW);
	displaylabel.setForeground(Color.GREEN);
	displaylabel.setOpaque(true);
	displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
	displaylabel.setFont(displaylabel.getFont().deriveFont(25.0f));
	/*adding label to the frame*/
	jf.add(displaylabel);
	/*setting button properties for each buttons*/
	sevenbutton=new JButton("7");
	sevenbutton.setBounds(30, 120, 80, 80);
	sevenbutton.setFont(sevenbutton.getFont().deriveFont(25.0f));
	/*operation*/
	sevenbutton.addActionListener(this);
	/*adding button to frame*/
	jf.add(sevenbutton);
	
	eightbutton=new JButton("8");
	eightbutton.setBounds(130, 120, 80, 80);
	eightbutton.setFont(eightbutton.getFont().deriveFont(25.0f));
	eightbutton.addActionListener(this);
	jf.add(eightbutton);
	
	ninebutton=new JButton("9");
	ninebutton.setBounds(230, 120, 80, 80);
	ninebutton.setFont(ninebutton.getFont().deriveFont(25.0f));
	ninebutton.addActionListener(this);
	jf.add(ninebutton);
	
	fourbutton=new JButton("4");
	fourbutton.setBounds(30, 220, 80, 80);
	fourbutton.setFont(fourbutton.getFont().deriveFont(25.0f));
	fourbutton.addActionListener(this);
	jf.add(fourbutton);
	
	fivebutton=new JButton("5");
	fivebutton.setBounds(130, 220, 80, 80);
	fivebutton.setFont(fivebutton.getFont().deriveFont(25.0f));
	fivebutton.addActionListener(this);
	jf.add(fivebutton);
	
	sixbutton=new JButton("6");
	sixbutton.setBounds(230, 220, 80, 80);
	sixbutton.setFont(sixbutton.getFont().deriveFont(25.0f));
	sixbutton.addActionListener(this);
	jf.add(sixbutton);
	
	onebutton=new JButton("1");
	onebutton.setBounds(30, 320, 80, 80);
	onebutton.setFont(onebutton.getFont().deriveFont(25.0f));
	onebutton.addActionListener(this);
	jf.add(onebutton);
	
	twobutton=new JButton("2");
	twobutton.setBounds(130, 320, 80, 80);
	twobutton.setFont(twobutton.getFont().deriveFont(25.0f));
	twobutton.addActionListener(this);
	jf.add(twobutton);
	
	threebutton=new JButton("3");
	threebutton.setBounds(230, 320, 80, 80);
	threebutton.setFont(threebutton.getFont().deriveFont(25.0f));
	threebutton.addActionListener(this);
	jf.add(threebutton);
	
	dotbutton=new JButton(".");
	dotbutton.setBounds(30, 420, 80, 80);
	dotbutton.setFont(dotbutton.getFont().deriveFont(25.0f));
	dotbutton.addActionListener(this);
	jf.add(dotbutton);
	
	zerobutton=new JButton("0");
	zerobutton.setBounds(130, 420, 80, 80);
	zerobutton.setFont(zerobutton.getFont().deriveFont(25.0f));
	zerobutton.addActionListener(this);
	jf.add(zerobutton);
	
	equalbutton=new JButton("=");
	equalbutton.setBounds(230, 420, 80, 80);
	equalbutton.setFont(equalbutton.getFont().deriveFont(25.0f));
	equalbutton.addActionListener(this);
	jf.add(equalbutton);
	
	divbutton=new JButton("/");
	divbutton.setBounds(330, 120, 80, 80);
	divbutton.setFont(divbutton.getFont().deriveFont(25.0f));
	divbutton.addActionListener(this);
	jf.add(divbutton);
	
	mulbutton=new JButton("x");
	mulbutton.setBounds(330, 220, 80, 80);
	mulbutton.setFont(mulbutton.getFont().deriveFont(25.0f));
	mulbutton.addActionListener(this);
	jf.add(mulbutton);
	
	subbutton=new JButton("-");
	subbutton.setBounds(330, 320, 80, 80);
	subbutton.setFont(subbutton.getFont().deriveFont(25.0f));
	subbutton.addActionListener(this);
	jf.add(subbutton);
	
	addbutton=new JButton("+");
	addbutton.setBounds(330, 420, 80, 80);
	addbutton.setFont(addbutton.getFont().deriveFont(25.0f));
	addbutton.addActionListener(this);
	jf.add(addbutton);
	
	clearbutton=new JButton("clear");
	clearbutton.setBounds(430, 420, 80, 80);
	clearbutton.addActionListener(this);
	jf.add(clearbutton);
	
		
	jf.setVisible(true);
	/*setting on close of window, terminate the program*/
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String[] args) {
	new Calculator();
}
@Override
public void actionPerformed(ActionEvent e) {
	/*if else if functions to perform accordingly as which button is clicked*/
	if(e.getSource()==sevenbutton)
	{
		if(isoperandclicked)
		{
			/*setting 7 in display label if operand clicked is true*/
			displaylabel.setText("7");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"7");
		}
	}
	else if(e.getSource()==eightbutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("8");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"8");
		}
	}
	else if(e.getSource()==ninebutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("9");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"9");
		}
	}
	else if(e.getSource()==fourbutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("4");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"4");
		}
	}
	else if(e.getSource()==fivebutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("5");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"5");
		}
	}
	else if(e.getSource()==sixbutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("6");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"6");
		}
	}
	else if(e.getSource()==onebutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("1");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"1");
		}
	}
	else if(e.getSource()==twobutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("2");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"2");
		}
	}
	else if(e.getSource()==threebutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("3");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"3");
		}
	}
	else if(e.getSource()==dotbutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText(".");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+".");
		}
	}
	else if(e.getSource()==zerobutton)
	{
		if(isoperandclicked)
		{
			displaylabel.setText("0");
			isoperandclicked=false;
		}
		else
		{	
			displaylabel.setText(displaylabel.getText()+"0");
		}
	}
	else if(e.getSource()==equalbutton)
	{
		/*equal button to get result*/
		isoperandclicked=true;
		/*storing current value to new value*/
		newValue=displaylabel.getText();
		/*converting it into float*/
		float oldValueF=Float.parseFloat(oldValue);
		float newValueF=Float.parseFloat(newValue);
		/* operator results according to which operator is clicked,1 for division,2 for multiplication,3 for subtraction,4 for addition*/
		if(operator==1)
		{
			result=oldValueF/newValueF;
		}
		else if(operator==2)
		{
			result=oldValueF*newValueF;
		}
		else if(operator==3)
		{
			result=oldValueF-newValueF;
		}
		else if(operator==4)
		{
			result=oldValueF+newValueF;
		}
		displaylabel.setText(result+"");
	}
	/*setting operator values, isoperandclicked variables and keeping oldvalue for each operator button*/
	else if(e.getSource()==divbutton)
	{
		isoperandclicked=true;
		oldValue=displaylabel.getText();
		operator=1;
	}
	else if(e.getSource()==mulbutton)
	{
		isoperandclicked=true;
		oldValue=displaylabel.getText();
		operator=2;
	}
	else if(e.getSource()==subbutton)
	{
		isoperandclicked=true;
		oldValue=displaylabel.getText();
		operator=3;
	}
	else if(e.getSource()==addbutton)
	{
		isoperandclicked=true;
		oldValue=displaylabel.getText();
		operator=4;
		
	}
	/*clearbutton operation*/
	else if(e.getSource()==clearbutton)
	{
		displaylabel.setText("");
	}
	
}
}
