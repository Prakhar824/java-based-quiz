package quiz;
import java.awt.*;  
import java.awt.event.*;  
import java.io.*;
public class MyResultWindow extends Frame
{
	public MyResultWindow()
	{
		String s=" ";
		int i=1;
		TextField[] t=new TextField[40];
		
		this.setSize(1950,1080);
		this.setVisible(true);
		try{
		Font myFont = new Font("Serif",Font.ITALIC,20);
		FileReader file1= new FileReader("c:/jprograms/file handeling/Score.txt");//file object for question file(change the file location where the file is saved)
		BufferedReader bf=new BufferedReader(file1);
		while(s!=null)
		{
			s=bf.readLine();
			t[i]=new TextField();
			t[i].setBounds(250, 50 + i * 45, 1500, 40);
			t[i].setFont(myFont);
			t[i].setText(s);
			this.add(t[i]);
			i++;
		}
		bf.close();
		}
		catch(IOException o)
		{
		}
		catch(NullPointerException n)
		{
		}
		
		this.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
			
         }
		});
	}
}