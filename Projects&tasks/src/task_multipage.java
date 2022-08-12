//multipage task

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class welcomepage{
	//String email;
//	String pass;
	welcomepage(){
		
		Frame f = new Frame("Singup page");
		Label l5 = new Label("Singup page");
		l5.setBounds(150,30,90,20);
		l5.setBackground(Color.GREEN);
		Label l = new Label("Name");
		l.setBounds(40,70,70,20);
		TextField tf = new TextField();
		tf.setBounds(130,70,150,20);
		Label l1 = new Label("D.O.B");
		l1.setBounds(40,100,70,20);
		TextField tf1 = new TextField();
		tf1.setBounds(130,100,150,20);
		Label l2 = new Label("E-mail");
		l2.setBounds(40,130,70,20);
		TextField tf2 = new TextField();
		tf2.setBounds(130,130,150,20);
	//	email=tf2.getText();
		Label l3 = new Label("Phone");
		l3.setBounds(40,160,70,20);
		TextField tf3 = new TextField();
		tf3.setBounds(130,160,150,20);
		Label l4 = new Label("Password");
		l4.setBounds(40,190,70,20);
		TextField tf4 = new TextField();
		tf4.setBounds(130,190,150,20);
	//	pass=tf4.getText();
		
		Button b = new Button("Cancel");
		b.setBounds(40,230,70,30);
		Button b1 = new Button("Next");
		b1.setBounds(130,230,70,30);
		b1.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame f = new Frame("Login page ");
				Label l2 = new Label("Login page");
				l2.setBounds(150,30,90,20);
				l2.setBackground(Color.ORANGE);
				
                Label l = new Label("E-Mail:");
                l.setBounds(40,60,70,30);
              //  String Email=tf.getText();
                
                TextField tf = new TextField();
                tf.setBounds(110,60,150,30);
                Label l1 = new Label("Password:");
                l1.setBounds(40,100,70,30);
              //  String password=tf1.getText();
                TextField tf1 = new TextField();
                tf1.setBounds(110,100,150,30);
               
                Button b = new Button(" Login");
                b.setBounds(130,150,70,30);
                b.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Frame f = new Frame("welcome page");
						
						Label l = new Label ("welcome page singnin sucessfully");
						l.setBounds(30,50,250,30);
						l.setBackground(Color.CYAN);
						
						f.addWindowListener(new WindowAdapter() {
							public void windowClosing(WindowEvent e) {
								f.dispose();
							}
						});
						f.add(l);
						f.setLayout(null);
						f.setSize(300, 200);
						f.setVisible(true);
					}});
                
                f.addWindowListener(new WindowAdapter() {
                	public void windowClosing(WindowEvent e) {
                		f.dispose();
                	}
                });
            	f.add(l2);
				f.add(l);
				f.add(tf);
				f.add(l1);
				f.add(tf1);
				f.add(b);
				f.setLayout(null);
				f.setSize(300, 200);
				f.setVisible(true);
			}
			});
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.add(l5);
		f.add(l);
		f.add(tf);
		f.add(l1);
		f.add(tf1);
		f.add(l2);
		f.add(tf2);
		f.add(l3);
		f.add(tf3);
		f.add(l4);
		f.add(tf4);
		f.add(b);
		f.add(b1);
		f.setLayout(null);
		f.setSize(300, 200);
		f.setVisible(true);
		
}

	
	}
	

public class task_multipage {

	public static void main(String[] args) {
		 new welcomepage ();
	}

}
