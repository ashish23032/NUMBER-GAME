import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;

class ATM extends JFrame {
	JPanel p,p1;
	JLabel l,l1,l2,l3,l4;
	JTextField f;
	JButton b,b1,b2,b3;
	double amount=0.0;
	
	class User implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			f.setText(null);
			l4.setText("Avilable balanced");
			l3.setText(amount+"");	
		}
	}
	
	class A extends User implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			double dd=Double.parseDouble(f.getText());
			String s=l3.getText().trim();
			if(s.length()==0) {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
			else if(amount>=dd) {
			    double a=Double.parseDouble(f.getText());
				amount-=a;
				l3.setText(amount+"");
				l4.setText(a+" deposit successful");
			}else {
				JOptionPane.showMessageDialog(null, "Unsufficient balanced!");
			  }
			}catch( Exception ex) {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
		}
		
	}
	
class B extends User implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
			double a=Double.parseDouble(f.getText());
			amount+=a;
			l3.setText(amount+"");
			l4.setText(a+" Credit successful");
			}catch( Exception ex) {
				JOptionPane.showMessageDialog(null, "Invalid input");
			}
		}
		
	}

class C implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		f.setText(null);
		l4.setText(null);
		l3.setText("----");	
	}
}
	
	ATM(){
		setTitle("ATM Machine");
		setSize(500,400);
		getContentPane().setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setLayout(null);
		
		p=new JPanel();
		p.setBounds(10,10,463,150);
		p.setBackground(Color.LIGHT_GRAY);
		p.setLayout(null);
		add(p);
		
		l=new JLabel("Enter amount : ");
		l.setBounds(40,40,100,30);
		p.add(l);
		
		f=new JTextField();
		f.setBounds(150,42,120,25);
		p.add(f);
		
		b=new JButton("Clear");
		b.addActionListener(new C());
		b.setBounds(300,42,100,25);
		p.add(b);
		
		b1=new JButton("Deposit");
		b1.addActionListener(new A());
		b1.setBounds(100,80,100,25);
		p.add(b1);
		
		b2=new JButton("Credit");
		b2.addActionListener(new B());
		b2.setBounds(210,80,100,25);
		p.add(b2);
		
		b3=new JButton("Check balance");
		b3.addActionListener(new User());
		b3.setBounds(320,80,120,25);
		p.add(b3);
		
		p1=new JPanel();
		p1.setBounds(10,180,463,150);
		p1.setBackground(Color.LIGHT_GRAY);
		p1.setLayout(null);
		add(p1);
		
		l1=new JLabel("Display avilable balance :");
		l1.setBounds(30,40,200,30);
		p1.add(l1);
		
		l3=new JLabel("----");
		l3.setBounds(200,40,200,30);
		p1.add(l3);
		
		l4=new JLabel();
		l4.setBounds(150,110,200,30);
		p.add(l4);
		
	}
}

public class ATMmachine {
	public static void main(String[] args) {
		ATM m=new ATM();
		m.setVisible(true);
	}
}
