package oopj24csb46;
import java.awt.event.*;
import javax.swing.*;
public class Simplecalculator implements ActionListener
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmulti,bdiv,bclr,beq;
JTextField t;
double a,b,re;
int op;
Simplecalculator()
{
JFrame jf=new JFrame("Calculator");
jf.setSize(200,200);
JPanel jp=new JPanel();
jp.setSize(190,190);
t=new JTextField(17);
t.setBounds(100, 100,200,30);
b1=new JButton("1");
b2=new JButton("2");
b3=new JButton("3");
b4=new JButton("4");
b5=new JButton("5");
b6=new JButton("6");
b7=new JButton("7");
b8=new JButton("8");
b9=new JButton("9");
b0=new JButton("0");
badd=new JButton("+");
bsub=new JButton("-");
bmulti=new JButton("*");
bdiv=new JButton("/");
bclr=new JButton("C");
beq=new JButton("=");

b1.setBounds(100, 140, 50, 30);
b2.setBounds(150, 140, 50, 30);
b3.setBounds(200, 140, 50, 30);
badd.setBounds(250, 140, 50, 30);
b4.setBounds(100, 170, 50, 30);
b5.setBounds(150, 170, 50, 30);
b6.setBounds(200, 170, 50, 30);
bsub.setBounds(250, 170, 50, 30);
b7.setBounds(100, 200, 50, 30);
b8.setBounds(150, 200, 50, 30);
b9.setBounds(200, 200, 50, 30);
bmulti.setBounds(250, 200, 50, 30);
b0.setBounds(100, 230, 50, 30);
bclr.setBounds(150, 230, 50, 30);
beq.setBounds(200, 230, 50, 30);
bdiv.setBounds(250, 230, 50, 30);

jp.add(t);
jp.add(b1);
jp.add(b2);
jp.add(b3);
jp.add(badd);
jp.add(b4);
jp.add(b5);
jp.add(b6);
jp.add(bsub);
jp.add(b7);
jp.add(b8);
jp.add(b9);
jp.add(bmulti);
jp.add(b0);
jp.add(bclr);
jp.add(beq);
jp.add(bdiv);
jf.add(jp);
t.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b0.addActionListener(this);
badd.addActionListener(this);
bsub.addActionListener(this);
bmulti.addActionListener(this);
bdiv.addActionListener(this);
bclr.addActionListener(this);
beq.addActionListener(this);
jf.setResizable(false);
jf.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)t.setText(t.getText()+"1");
if(e.getSource()==b2)t.setText(t.getText()+"2");
if(e.getSource()==b3)t.setText(t.getText()+"3");
if(e.getSource()==b4)t.setText(t.getText()+"4");
if(e.getSource()==b5)t.setText(t.getText()+"5");
if(e.getSource()==b6)t.setText(t.getText()+"6");
if(e.getSource()==b7)t.setText(t.getText()+"7");
if(e.getSource()==b8)t.setText(t.getText()+"8");
if(e.getSource()==b9)t.setText(t.getText()+"9");
if(e.getSource()==b0)t.setText(t.getText()+"0");
if(e.getSource()==badd)
{
a=Double.parseDouble(t.getText());
op=1;
t.setText("");
}
if(e.getSource()==bsub)
{
a=Double.parseDouble(t.getText());
op=2;
t.setText("");
}
if(e.getSource()==bmulti)
{
a=Double.parseDouble(t.getText());
op=3;
t.setText("");
}
if(e.getSource()==bdiv)
{
a=Double.parseDouble(t.getText());
op=4;
t.setText("");
}
if(e.getSource()==bclr)
{
a=Double.parseDouble(t.getText());
op=5;
t.setText("");
}
if(e.getSource()==beq)
{
b=Double.parseDouble(t.getText());
switch(op)
{
case 1:
re=a+b;
break;
case 2:
re=a-b;
break;
case 3:
re=a*b;
break;
case 4:
try
{
re=a/b;
}
catch(Exception e1)
{
t.setText("Error");
}
break;
}
String res=String.valueOf(re);
t.setText(res);
}
}
public static void main(String[] args)
{
new Simplecalculator();
}


}