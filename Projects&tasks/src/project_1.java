
import java.awt.*;
import java.sql.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;
class miniproject{
	miniproject(){
		JFrame f = new JFrame("");
		 ImageIcon icon1 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\signup.jpg");
	     JLabel li1 = new JLabel(icon1);  //LabelIcon
	     li1.setBounds(0,0,650,500);
	     Label L1 = new Label("Trainer Support System");
	     L1.setBounds(250,10,150,30);
	    
	     L1.setBackground(Color.BLUE);
	     Button B1 = new Button("Sign In");
	     B1.setBounds(250,150,140,50);
	     B1.setBackground(Color.RED);
	     
	     B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f1  = new JFrame("Sign Up");
				 ImageIcon icon2 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\prak.png");
			     JLabel li2 = new JLabel(icon2);  
			     li2.setBounds(0,0,600,500);
			     JLabel l = new JLabel("Sign Up Here ");
			     l.setBounds(200,20,100,30);
				JLabel l1 = new JLabel("Name : ");
				l1.setBounds(30,50,70,20);
				JTextField ta = new JTextField();
				ta.setBounds(110,50,90,20);
				JLabel l2 = new JLabel("D.O.B : ");
				l2.setBounds(30,80,70,20);
				JTextField ta1 = new JTextField();
				ta1.setBounds(110,80,90,20);
				JLabel l3 = new JLabel("E-mail : ");
				l3.setBounds(30,110,70,20);
				JTextField ta2 = new JTextField();
				ta2.setBounds(110,110,90,20);
				
				JLabel l4 = new JLabel("Password : ");
				l4.setBounds(30,140,70,20);
				JPasswordField p = new JPasswordField("");
				p.setBounds(110,140,90,20);
				
				
				JButton B2 = new JButton("OK");
				B2.setBounds(150,190,100,30);
				B2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(B2, "Sign up succesfully");
						//database code will connect here...
					/*	String Name=ta.getText();
						String dob=ta1.getText();
					    String email=ta2.getText();
						String pass=p.getText().toString();
						
						try {
						Class.forName("com.mysql.jdbc.Driver");
						Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "admin");
						System.out.println("connection succeed"+con);
						Statement st=con.createStatement();
						st.execute("use miniproject");
						//st.execute("create table signin(Name varchar(30), Dob varchar(10), E_mail varchar(50), pass varchar(20) )");
				        String query1="INSERT INTO miniproject.signin VALUES('"+Name+"','"+dob+"','"+email+"','"+pass+"')";
				        st.executeLargeUpdate(query1);
				         con.close();
						}catch(Exception ex) {System.out.println(ex);} */
						
						JFrame f2 = new JFrame();
						 ImageIcon icon3 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\images.png");
					     JLabel li3 = new JLabel(icon3);  //LabelIcon
					     li3.setBounds(0,0,600,500);
						  Label l1 = new Label("Student");
					      l1.setBounds(30,80,100,30);
					      l1.setBackground(Color.magenta);
					      JButton b1 = new JButton("Log in");
					        b1.setBounds(140,80,100,30);
					        b1.setBackground(Color.LIGHT_GRAY);
					      b1.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								JFrame f3 = new JFrame();
								 ImageIcon icon3 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\login.png");
							     JLabel li4 = new JLabel(icon3); 
								 li4.setBounds(0,0,600,500);
								   Label b1 = new Label(" Log in");
							        b1.setBounds(235,75,100,30);
							        b1.setBackground(Color.YELLOW);
							        Label l1 = new Label("E-mail");
							        l1.setBounds(60,120,80,20);
							        l1.setBackground(Color.green);
							        JTextField ta1 = new JTextField();
							        ta1.setBounds(160,120,100,20);
							        Label l2 = new Label("Password");
							        l2.setBounds(60,150,80,20);
							        l2.setBackground(Color.green);
							        JTextField ta2 = new JTextField();
							        ta2.setBounds(160,150,100,20);
							        JButton b2 = new JButton("confirm");
							        b2.setBounds(160,220,80,30);
							        b2.addActionListener(new ActionListener() {

										public void actionPerformed(ActionEvent e) {
											JFrame f4 = new JFrame();
											ImageIcon icon4 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\ram1.png");
											JLabel li5  = new JLabel(icon4);
											li5.setBounds(0,0,600,400);
											Label l1 = new Label("Student");
											l1.setBounds(250,30,80,30);
											JButton b1 = new JButton("syllabus completion");
											b1.setBounds(250,80,170,30);
											b1.addActionListener(new ActionListener () {
												public void actionPerformed(ActionEvent e) {
													JFrame f4 = new JFrame();
							                        Label ls = new Label("JAVA");
							                        ls.setBounds(70,20,90,30);
													ls.setBackground(Color.ORANGE);
							                        JLabel ls1 = new JLabel("Basics :");
							                        ls1.setBounds(30,60,100,30);
							                        
							                        JProgressBar p = new JProgressBar();
							                        p.setBounds(95,65,80,20);
							                		p.setStringPainted(true);   // progressbar will be colored
							                		p.setValue(100); 
							                        
							                		
							                		 JLabel ls2 = new JLabel("OOps :");
							                         ls2.setBounds(30,85,100,30);
							                         
							                         JProgressBar p1 = new JProgressBar();
							                         p1.setBounds(95,90,80,20);
							                 		 p1.setStringPainted(true);   // progressbar will be colored
							                 		 p1.setValue(100); 
							                 		 
							                 		 JLabel ls3 = new JLabel(" AWT & SWING :");
							                         ls3.setBounds(0,110,100,30);
							                         
							                         JProgressBar p2 = new JProgressBar();
							                         p2.setBounds(95,115,80,20);
							                 		 p2.setStringPainted(true);   // progressbar will be colored
							                 		 p2.setValue(80); 
							                 		 
							                 		 
							                 		 JLabel ls4 = new JLabel(" Data Base :");
							                         ls4.setBounds(10,135,100,30);
							                         
							                         JProgressBar p3 = new JProgressBar();
							                         p3.setBounds(95,140,80,20);
							                 		 p3.setStringPainted(true);   // progressbar will be colored
							                 		 p3.setValue(20); 
							                 		 
							                 		 JButton bback = new JButton("BACK");
							                 		 bback.setBounds(100,170,70,20);
							                 		 bback.addActionListener(new ActionListener() {

														public void actionPerformed(ActionEvent e) {
															 f4.dispose();
														}
							                 			 
							                 		 });                    
							                        f4.add(ls);
							                        f4.add(ls1);
							                        f4.add(p);
							                        f4.add(ls2);
							                        f4.add(p1);
							                        f4.add(ls3);
							                        f4.add(p2);
							                        f4.add(ls4);
							                        f4.add(p3);
													f4.add(bback);
							                        
							                        f4.setSize(600,400);
													f4.setLayout(null);
													f4.setVisible(true);
												}
												
											});
											
											JButton b2 = new JButton("Daily Reports");
											b2.setBounds(250,140,170,30);
											b2.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													JFrame f5 = new JFrame("Daily Reports");

													String[] col= {"SI.NO","Name","Date","Reports"};
													String row[][]= {{"01","Prakash","20/03/22" ,"Present"},{"02","Rajkumar","20/03/22","Present"},{"03","Swetha","20/03/22","Present"},{"04","Hari","20/03/22","Absent"}};
												
													JTable t = new JTable(row,col );
											        t.setBounds(30,30,150,150);
											        
											        JScrollPane s = new JScrollPane(t);
											        
											        
													    f5.add(s);
													    f5.setSize(600,400);
													  //  f5.setLayout(bl);
														f5.setVisible(true);
												}
												
											});
											JButton b3 = new JButton("SUBMISSION");
											b3.setBounds(250,190,170,30);
											b3.addActionListener(new ActionListener() {

												public void actionPerformed(ActionEvent e) {
													JFrame f6 = new JFrame("submission");
													String [] col= {"Name","Coding","project","Grade"};
													String [][] row = {{"Prakash","DONE","No","B"},{"Rajkumar","DONE","No","B"},{"Swetha","DONE","YES","A"},{"Hari","DONE","No","B"}};
													JTable t1 = new JTable(row,col );
											        t1.setBounds(30,30,150,150);
											        
											        JScrollPane s1 = new JScrollPane(t1);
											        

												    f6.add(s1);
												    f6.setSize(600,400);
												  //  f6.setLayout(bl);
													f6.setVisible(true);
												}
												
											});
											JButton b4 = new JButton("Doubts?");
											b4.setBounds(250,230,170,30);
											b4.addActionListener(new ActionListener() {
												public void actionPerformed(ActionEvent e) {
													JFrame ft1 = new JFrame();
													JLabel lt1 = new JLabel();
													lt1.setBounds(70, 20, 70, 30);
													
													ft1.add(lt1);
													
													ft1.setSize(600,400);
													ft1.setLayout(null);
													ft1.setVisible(true);
												}
											});
											
											li5.add(l1);
											li5.add(b1);
											li5.add(b2);
											li5.add(b3);
											li5.add(b4);
											f4.add(li5);
											
											f4.setSize(600,400);
											f4.setLayout(null);
											f4.setVisible(true);
										}
							        	
							        });
							        
							        
							        
							     li4.add(l1);
							     li4.add(ta1);
							     li4.add(l2);
							     li4.add(ta2);
							     li4.add(b2);
							     li4.add(b1);
							     
							    f3.add(li4);
								f3.setSize(600,500);
								f3.setLayout(null);
								f3.setVisible(true);
							}
						});
						
						  Label l2 = new Label("Trainer");
					      l2.setBounds(30,120,100,30);
					      l2.setBackground(Color.magenta);
					      JButton b2 = new JButton("Log in");
					        b2.setBounds(140,120,100,30);
					        b2.setBackground(Color.LIGHT_GRAY);
					        b2.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e) {
									
									JFrame f7 = new JFrame();
									 ImageIcon icon4 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\guf.png"); //change the icon
								     JLabel li5 = new JLabel(icon4); 
									 li5.setBounds(0,0,600,500);
									   Label b1 = new Label(" Log in");
								        b1.setBounds(235,75,100,30);
								        b1.setBackground(Color.YELLOW);
								        Label l1 = new Label("E-mail");
								        l1.setBounds(60,120,80,20);
								        l1.setBackground(Color.green);
								        JTextField ta1 = new JTextField();
								        ta1.setBounds(160,120,100,20);
								        Label l2 = new Label("Password");
								        l2.setBounds(60,150,80,20);
								        l2.setBackground(Color.green);
								        JTextField ta2 = new JTextField();
								        ta2.setBounds(160,150,100,20);
								        JButton b2 = new JButton("confirm");
								        b2.setBounds(160,220,80,30);
								        b2.addActionListener(new ActionListener() {
											public void actionPerformed(ActionEvent e) {
												JFrame f8 = new JFrame("Trainer");
												ImageIcon icon5 = new ImageIcon("C:\\Users\\Prakash\\Desktop\\ram1.png");
												JLabel li6 = new JLabel(icon5);
												li6.setBounds(0,0,600,400);
												Label l1 = new Label("Trainer");
												l1.setBounds(250,30,80,30);
												JButton b1 = new JButton("syllabus completion");
												b1.setBounds(250,80,170,30);
												b1.addActionListener(new ActionListener () {
													public void actionPerformed(ActionEvent e) {
														JFrame f9 = new JFrame();
								                        Label ls = new Label("JAVA");
								                        ls.setBounds(70,20,90,30);
														ls.setBackground(Color.ORANGE);
								                        JLabel ls1 = new JLabel("Basics :");
								                        ls1.setBounds(30,60,100,30);
								                        
								                        JProgressBar p = new JProgressBar();
								                        p.setBounds(95,65,80,20);
								                		p.setStringPainted(true);   // progressbar will be colored
								                		p.setValue(100); 
								                        
								                		
								                		 JLabel ls2 = new JLabel("OOps :");
								                         ls2.setBounds(30,85,100,30);
								                         
								                         JProgressBar p1 = new JProgressBar();
								                         p1.setBounds(95,90,80,20);
								                 		 p1.setStringPainted(true);   // progressbar will be colored
								                 		 p1.setValue(100); 
								                 		 
								                 		 JLabel ls3 = new JLabel(" AWT & SWING :");
								                         ls3.setBounds(0,110,100,30);
								                         
								                         JProgressBar p2 = new JProgressBar();
								                         p2.setBounds(95,115,80,20);
								                 		 p2.setStringPainted(true);   // progressbar will be colored
								                 		 p2.setValue(80); 
								                 		 
								                 		 
								                 		 JLabel ls4 = new JLabel(" Data Base :");
								                         ls4.setBounds(10,135,100,30);
								                         
								                         JProgressBar p3 = new JProgressBar();
								                         p3.setBounds(95,140,80,20);
								                 		 p3.setStringPainted(true);   // progressbar will be colored
								                 		 p3.setValue(20); 
								                 		 
								                 		 JButton bback = new JButton("BACK");
								                 		 bback.setBounds(100,170,70,20);
								                 		 bback.addActionListener(new ActionListener() {

															public void actionPerformed(ActionEvent e) {
																 f9.dispose();
															}
								                 			 
								                 		 });                    
								                        f9.add(ls);
								                        f9.add(ls1);
								                        f9.add(p);
								                        f9.add(ls2);
								                        f9.add(p1);
								                        f9.add(ls3);
								                        f9.add(p2);
								                        f9.add(ls4);
								                        f9.add(p3);
														f9.add(bback);
								                       
								                        f9.setSize(600,400);
														f9.setLayout(null);
														f9.setVisible(true);
													}
													
													
													
												});
												JButton b2 = new JButton(" Student Activity");
												b2.setBounds(250,130,170,30);
												b2.addActionListener(new ActionListener() {
													public void actionPerformed(ActionEvent e) {
														JFrame f7 = new JFrame("submission");
														String [] col= {"Name","Interaction","sub & Grade","Level"};
														String [][] row = {{"Prakash","GOOD","No","7"},{"Rajkumar","GOOD","No","7"},{"Swetha","GOOD","YES","8"},{"Hari","GOOD","No","7"}};
														JTable t1 = new JTable(row,col );
												        t1.setBounds(30,30,150,150);
												        
												        JScrollPane s1 = new JScrollPane(t1);
												        

													    f7.add(s1);
													    f7.setSize(600,400);
													  //  f6.setLayout(bl);
														f7.setVisible(true);
													}
													
												});
												  JButton b3 = new JButton("Question");
											        b3.setBounds(250,170,170,30);
								             
												
												li6.add(l1);
												li6.add(b1);
												li6.add(b2);
											    li6.add(b3);

												f8.add(li6);
												f8.setSize(600,400);
												f8.setLayout(null);
												f8.setVisible(true);

											}
										});
								   
								        
								        li5.add(l1);
									     li5.add(ta1);
									     li5.add(l2);
									     li5.add(ta2);
									     li5.add(b2);
									     li5.add(b1);
									     
									    f7.add(li5);
										f7.setSize(600,500);
										f7.setLayout(null);
										f7.setVisible(true);
								}
					        	
					        });				
					      
					        
						 
					      li3.add(b1);
					      li3.add(l1);
					      li3.add(l2);
					      li3.add(b2);
					      
					      
					      
					    f2.add(li3);
						f2.setSize(600,500);
						f2.setLayout(null);
						f2.setVisible(true);
						
					}
					
				});
				
				
				
				
				li2.add(l1);
				li2.add(ta);
				li2.add(l2);
				li2.add(ta1);
				li2.add(l3);
				li2.add(ta2);
				li2.add(l4);
				li2.add(p);
				li2.add(B2);
				li2.add(l);
				
				f1.add(li2);
				f1.setSize(600,500);
				f1.setLayout(null);
				f1.setVisible(true);
				
				
				
			}
	    	 
	     });
	     
	     
	     li1.add(L1);
	     li1.add(B1);
	     
		f.add(li1);
	    f.setSize(650,500);
	    f.setLayout(null);
	    f.setVisible(true);
		
	}
}
public class project_1 {

	public static void main(String[] args) {
     new miniproject();
	}

}
