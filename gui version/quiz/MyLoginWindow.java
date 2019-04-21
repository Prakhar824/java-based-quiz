package quiz;

import java.awt.*;
import java.awt.event.*;
public class MyLoginWindow extends Frame
{
    public TextField name,pass;
    public Button b1,b2;
	public Label n,p,invalid;
    public MyLoginWindow()
    {
        setLayout(new FlowLayout());
        this.setLayout(null);
        n=new Label("Name:",Label.CENTER);
        p=new Label("password:",Label.CENTER);
		invalid=new Label("");
        name=new TextField(40);
        pass=new TextField(40);
        pass.setEchoChar('#');
        b1=new Button("submit");
        b2=new Button("cancel");
        this.add(n);
        this.add(name);
        this.add(p);
        this.add(pass);
        this.add(b1);
        this.add(b2);
		this.add(invalid);
        n.setBounds(70,90,90,60);
        p.setBounds(70,130,90,60);
        name.setBounds(200,100,90,20);
        pass.setBounds(200,140,90,20);
        b1.setBounds(100,260,70,40);
        b2.setBounds(180,260,70,40);
		invalid.setBounds(100,320,250,40);
		this.setVisible(true);
		this.setTitle("Login");
 
    }
	public void hide()
	{
		b1.setVisible(false);
		b2.setVisible(false);
		pass.setVisible(false);
		n.setVisible(false);
		p.setVisible(false);
		
	}
	public void matched()
	{
		name.setText("Verified");
	}
	
	public void notmatched()
	{
		invalid.setText("Invalid username or password");
	}

}