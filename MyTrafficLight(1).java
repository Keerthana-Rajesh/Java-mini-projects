package oopj24csb46;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyTrafficLight extends JFrame implements ActionListener{
	JRadioButton r1,r2,r3;
	Color r,y,gr;
	MyTrafficLight()
	{
		r1 = new JRadioButton("Red");
	    r2 = new JRadioButton("Yellow");
		r3 = new JRadioButton("Green");
		
		ButtonGroup gb = new ButtonGroup();
	    gb.add(r1);
	    gb.add(r2);
	    gb.add(r3);
	    
	    add(r1);
	    add(r2);
	    add(r3);
	    
	    r= getBackground();
	    y= getBackground();
	    gr= getBackground();
	    
	    r1.addActionListener(this);
	    r2.addActionListener(this);
	    r3.addActionListener(this);
	    
	    r1.setBounds(100, 50, 100, 50);
	    r2.setBounds(200, 50, 100, 50);
	    r3.setBounds(300, 50, 100, 50);
	    
	    setTitle("My Traffic Light");
	    setLayout(null);
	    setVisible(true);
	    
	}
	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected())
		{
			r = Color.red;
			y = getBackground();
			gr = getBackground();
		}
		else if(r2.isSelected())
		{
			y = Color.yellow;
			r = getBackground();
			gr = getBackground();
		}
		else if(r3.isSelected())
		{
			gr = Color.green;
			y = getBackground();
			r = getBackground();
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		super.paint(g);/*this line calls the super class implementation of paint 
		method which clears the previous drawings and prepares the component for fresh drawing*/
		g.drawOval(150, 150, 50, 50);
		g.drawOval(150, 210, 50, 50);
		g.drawOval(150, 270, 50, 50);
		g.setColor(r);
		g.fillOval(150, 150, 50, 50);
		g.setColor(y);
		g.fillOval(150, 210, 50, 50);
		g.setColor(gr);
		g.fillOval(150, 270, 50, 50);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new MyTrafficLight();
	}

}
