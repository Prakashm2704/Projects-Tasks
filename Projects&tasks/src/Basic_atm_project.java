	
	import java.awt.Color;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.*;
	import javax.swing.*;
	class AccHolderDetails{
		TextField ta1;
		TextField tf;
		int bal=152000;
		AccHolderDetails(){
			
			JFrame f = new JFrame("ICICI Bank");
						
			Label l1 = new Label("Enter Username");
			l1.setBounds(110,130,100,30);
			f.add(l1);
			
			Label l2 = new Label("Enter Password");
			l2.setBounds(110,210,100,30);
			f.add(l2);
			
			ta1 = new TextField();
			ta1.setBounds(210,130,150,30);
			f.add(ta1);
			
			TextField ta2 = new TextField();
			ta2.setBounds(210,210,150,30);
			f.add(ta2);
			
			JButton b = new JButton("Confirm");
			b.setBounds(180,280,80,30);
			f.add(b);
			
			b.addActionListener(new ActionListener () {
				public void actionPerformed(ActionEvent e) {
					JFrame f1 = new JFrame("ICICI Bank");
					
					String text = ta1.getText();
					Label ll = new Label("hello  "+text+",");
					ll.setBounds(30,50,150,30);
				
					JButton b1=new JButton("Deposit");
					b1.setBounds(160, 110, 150, 60);
					
					b1.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JFrame f2 = new JFrame();
							
							JDialog d = new JDialog(f2);
							
							Label l3 = new Label("        Deposit");
							l3.setBackground(Color.BLACK);
							l3.setBounds(195,10,100,30);
							l3.setForeground(Color.WHITE);
							
							Label l4 = new Label("Enter the Amount To Deposit");
							l4.setBounds(100, 50, 200, 30);
							
							
							tf = new TextField();
							tf.setBounds(160, 80, 180, 30);
							
							
							JButton bb = new JButton("Confirm");
							bb.setBounds(200, 130, 100, 30);
							
							
							bb.addActionListener(new ActionListener (){
								public void actionPerformed(ActionEvent e) {	
								int n=Integer.parseInt(tf.getText())	;
								bal+=n;
								d.dispose();	
								}
							});
							
							d.add(l3);
							d.add(l4);
							d.add(tf);
							d.add(bb);
							d.setTitle("ICICI Bank");
							d.setLayout(null);
							d.setSize(500,230);
							d.setVisible(true);
						}
					});
									
					JButton b2=new JButton("Withdraw");
					b2.setBounds(160, 190, 150, 60);
					
					b2.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JFrame f3 = new JFrame();
							
							JDialog d1 = new JDialog(f3);
							
							
							Label l5 = new Label("        Withdraw");
							l5.setBackground(Color.BLACK);
							l5.setBounds(195,10,100,30);
							l5.setForeground(Color.WHITE);
							
							Label l6 = new Label("Enter the Amount To Withdraw");
							l6.setBounds(100, 50, 200, 30);
							
							TextField tf1 = new TextField();
							tf1.setBounds(160, 80, 180, 30);
							
							JButton b3 = new JButton("Confirm");
							b3.setBounds(200, 130, 100, 30);
							
							b3.addActionListener(new ActionListener (){
								public void actionPerformed(ActionEvent e) {
									int n1=Integer.parseInt(tf1.getText());
									bal-=n1;
									d1.dispose();
								}
							});
							
							d1.add(l5);
							d1.add(l6);
							d1.add(tf1);
							d1.add(b3);
							d1.setTitle("ICICI Bank");
							d1.setLayout(null);
							d1.setSize(500,230);
							d1.setVisible(true);
						}
					});
					JButton b3=new JButton("Check Balance");
					b3.setBounds(160, 270, 150, 60);
					
					b3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							JFrame f4 = new JFrame();
							
							JDialog d2 = new JDialog(f4);
							
							
							Label l7 = new Label("  Check Balance");
							l7.setBackground(Color.BLACK);
							l7.setBounds(195,10,100,30);
							l7.setForeground(Color.WHITE);
							
							Label l8 = new Label("Your Current balance: ");
							l8.setBounds(100, 50, 200, 30);
							
							String tot= String.valueOf(bal);
							Label tf2 = new Label(tot);
							tf2.setBounds(160, 80, 180, 30);
							
							JButton b4 = new JButton("Back");
							b4.setBounds(200, 130, 100, 30);
							
							b4.addActionListener(new ActionListener (){
								public void actionPerformed(ActionEvent e) {
									d2.dispose();
								}
							});
							
							d2.add(l7);
							d2.add(l8);
							d2.add(tf2);
							d2.add(b4);
							d2.setTitle("ICICI Bank");
							d2.setLayout(null);
							d2.setSize(500,230);
							d2.setVisible(true);
						}
					});
					f1.add(ll);
					f1.add(b1);
					f1.add(b2);
					f1.add(b3);

					f1.setLayout(null);
					f1.setSize(500,500);
					f1.setVisible(true);
				}
			});

			f.setLayout(null);
			f.setSize(500,500);
			f.setVisible(true);

		}
	}
	public class Basic_atm_project {

		public static void main(String[] args) {
			
			new AccHolderDetails();
		}

	}
	

