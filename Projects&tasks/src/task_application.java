
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class application{
	application(){
		Frame f = new Frame("Task");
		f.addWindowListener(new WindowAdapter() {   //we are using window listener
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
			});
		Label l = new Label("SLA application Form");
		l.setBounds(30,40,150,30);
		Label l1 = new Label("Name");
		l1.setBounds(10,80,70,30);
		TextField tf = new TextField();
		tf.setBounds(80,85,100,20);
		Label l2 = new Label("Degree");
		l2.setBounds(10,120,70,30);
		TextField tf1 = new TextField();
		tf1.setBounds(80,120,100,20);
		Label l3 = new Label("DOB");
		l3.setBounds(10,150,70,30);
		TextField tf2 = new TextField();
        tf2.setBounds(80,150,100,20);
        Label l4 = new Label("Gender");
        l4.setBounds(10,180,70,30);
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c=new Checkbox("Male",cg,false);
        c.setBounds(90,180,50,20);
        Checkbox c1=new Checkbox("female",cg,false);
        c1.setBounds(160,180,60,20);
        Label l5 = new Label("course");
        l5.setBounds(10,210,70,30);
        Checkbox c3 = new Checkbox("Java");
        c3.setBounds(90,220,50,20);
        Checkbox c4 = new Checkbox("Python");
        c4.setBounds(180,220,70,20);
        Checkbox c5 = new Checkbox("Sql");
        c5.setBounds(260,220,80,20);
        TextField tf3 = new TextField("Application comments");
        tf3.setBounds(10,250,150,150);
        
        
        f.add(l);
		f.add(l1);
		f.add(tf);
		f.add(l2);
		f.add(tf1);
		f.add(l3);
		f.add(tf2);
		f.add(l4);
		f.add(c);
		f.add(c1);
		f.add(l5);
		f.add(c3);
		f.add(c4);
		f.add(c5);
		f.add(tf3);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,300);
		
	}
}
public class task_application {

	public static void main(String[] args) {
    new application();
	}

}