import java.awt.*;  
import java.awt.event.*;  
import java.io.*;
import java.util.Scanner;
import quiz.*;
public class Quiz { 

public static int count=0;
public static int c=0; 
public static int z=0;
public static int a=0;
public static String name="";

public static void main(String[] args) throws IOException
{ 
	int i=0;
	String s="Press next to start the quiz",s1="",s2="",s3="",s4="",s5="";
	int score=0;
	char ch,ch1;
	Font myFont = new Font("Serif",Font.ITALIC,22);
	MyLoginWindow m=new MyLoginWindow();
	m.setSize(400,400);
	//Scanner sc=new Scanner(System.in);
	FileReader file1= new FileReader("../Question.txt");//file object for question file(change the file location where the file is saved)
	BufferedReader bf=new BufferedReader(file1);
	FileReader file2= new FileReader("../Answer.txt");// file object for answer file(change the file location where the file is saved)
	BufferedReader bf1=new BufferedReader(file2);
	FileReader file3= new FileReader("../Credentials.txt");// file object for answer file(change the file location where the file is saved)
	BufferedReader bf3=new BufferedReader(file3);
	
    Frame f=new Frame("Quiz");  
    Button b=new Button("next");
	Button b1=new Button("Finish");
	Label l1=new Label(s);
	Label l2=new Label(s1);
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox checkBox1 = new Checkbox(s1, cbg, false);
	Checkbox checkBox2 = new Checkbox(s2, cbg, false);
	Checkbox checkBox3 = new Checkbox(s3, cbg, false);
	Checkbox checkBox4 = new Checkbox(s4, cbg, false);
    b.setBounds(1500,450,100,30);  
	b1.setBounds(1600,450,100,30);
    f.add(b);
	f.add(b1);
	f.add(l1);
	f.add(l2);
	f.add(checkBox1);    
    f.add(checkBox2);
	f.add(checkBox3);    
    f.add(checkBox4);
	f.setSize(1950,1080);  
	f.setLayout(null);  
	//f.setVisible(false);

	
		
		
		
		l1.setFont(myFont);
		l1.setBounds(800,300,550,40);
		l2.setFont(myFont);
		
		

		
		
		 
		 checkBox1.setFont(myFont);
		 checkBox2.setFont(myFont);
		 checkBox3.setFont(myFont);
		 checkBox4.setFont(myFont);
		
		 
		 m.b1.addActionListener(new ActionListener()
		 {  
			public void actionPerformed(ActionEvent e)
			{
				
				Quiz.z++;
					if(z==4)
					System.exit(0);
				try
				{
				String s6="",s7="",name="",pass="";
				//m.hide();
				s6=bf3.readLine();
				s7=bf3.readLine();
				name=m.name.getText();
				Quiz.name=m.name.getText();
				pass=m.pass.getText();
				if (s6.equals(name) && s7.equals(pass))
				{
					m.setVisible(false);
					f.setVisible(true);
					
				}
				else
					m.notmatched();
					m.name.setText("");
					m.pass.setText("");
				}
				catch(IOException o)
				{
				}
				catch(NullPointerException n)
				{
				}
				
			}
		 });
	
		
		 
		 
		
		 
		 b.addActionListener(new ActionListener()
		 {  
			public void actionPerformed(ActionEvent e)
			{
				
				char ch,ch1;
				String s="",s1="",s2="",s3="",s4="",s5="";
				try
				{
				s=bf.readLine();//reading the question
				
				s1=bf.readLine();//reading option a from question file 
		
				s2=bf.readLine();//reading option b from question file
		
				s3=bf.readLine();//reading option c from question file
		
				s4=bf.readLine();//reading option d from question file
				
				s5=bf1.readLine();//reading the answer from the answer file
				ch=s5.charAt(0);
				
				l1.setText(s);
				
				checkBox1.setLabel(s1);
				checkBox2.setLabel(s2);
				checkBox3.setLabel(s3);
				checkBox4.setLabel(s4);
				checkBox1.setState(false);
				checkBox2.setState(false);
				checkBox3.setState(false);
				checkBox4.setState(false);
				l1.setBounds(80,50,550,40);
				checkBox1.setBounds(100,100, 450,50);
				checkBox2.setBounds(100,150, 450,50);
				checkBox3.setBounds(100,200, 450,50);
				checkBox4.setBounds(100,250, 450,50);
				
				checkBox1.addItemListener(new ItemListener() 
				{
					public void itemStateChanged(ItemEvent e) 
					{             
						if (ch=='a')
						Quiz.c=1;
						else
						Quiz.c=0;
					}
				});
				
				checkBox2.addItemListener(new ItemListener() 
				{
					public void itemStateChanged(ItemEvent e) 
					{             
						if (ch=='b')
						Quiz.c=1;
						else
						Quiz.c=0;
					}
				});
				
				checkBox3.addItemListener(new ItemListener() 
				{
					public void itemStateChanged(ItemEvent e) 
					{             
						if (ch=='c')
						Quiz.c=1;
						else
						Quiz.c=0;
					}
				});
				
				checkBox4.addItemListener(new ItemListener() 
				{
					public void itemStateChanged(ItemEvent e) 
					{             
						if (ch=='d')
						Quiz.c=1;
						else
						Quiz.c=0;
					}
				});
				
				Quiz.count+=Quiz.c;
				
				}
				catch(IOException o)
				{
				}
				catch(NullPointerException n)
				{
				}
			}  
		  });  
		  
		  
		b1.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				Quiz.a++;
				try
				{
				String s="";
				s="Your score is "+Integer.toString(Quiz.count);
				b.setVisible(false);
				checkBox1.setVisible(false);
				checkBox2.setVisible(false);
				checkBox3.setVisible(false);
				checkBox4.setVisible(false);
				l1.setVisible(false);
				l2.setBounds(800,300,550,40);
				l2.setText(s);
				
				if(a==1)
				{
				FileWriter file4= new FileWriter("../Score.txt",true);// file object for answer file(change the file location where the file is saved)
				BufferedWriter bf4=new BufferedWriter(file4);
				bf4.write(Quiz.name+" scored "+Integer.toString(Quiz.count));
				bf4.write("\n");
				bf4.close();
				}
				}
				catch(IOException o)
				{
				}
			}
		 });
		
	
		f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
			
         }
		});
		
		m.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent we) {
            System.exit(0);
			
         }
		});
	
    
	
	//bf4.close();
    
	
}  

}

