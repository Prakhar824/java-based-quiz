import java.awt.*;  
import java.awt.event.*;  
import java.io.*;
import java.util.Scanner;
public class Quiz {  
public static void main(String[] args) throws IOException{ 
	int i=0;
	String s="Press next to start the quiz",s1="",s2="",s3="",s4="",s5="";
	int score=0;
	char ch,ch1;
	Font myFont = new Font("Serif",Font.ITALIC,22);

	//Scanner sc=new Scanner(System.in);
	FileReader file1= new FileReader("c:/jprograms/file handeling/Question.txt");//file object for question file(change the file location where the file is saved)
	BufferedReader bf=new BufferedReader(file1);
	FileReader file2= new FileReader("c:/jprograms/file handeling/Answer.txt");// file object for answer file(change the file location where the file is saved)
	BufferedReader bf1=new BufferedReader(file2);
    Frame f=new Frame("Quiz");  
    Button b=new Button("next");
	Label l1=new Label(s);
	CheckboxGroup cbg = new CheckboxGroup();
	Checkbox checkBox1 = new Checkbox(s1, cbg, false);
	Checkbox checkBox2 = new Checkbox(s2, cbg, false);
	Checkbox checkBox3 = new Checkbox(s3, cbg, false);
	Checkbox checkBox4 = new Checkbox(s4, cbg, false);
    b.setBounds(1500,450,100,30);  
    f.add(b);
	f.add(l1);
	f.add(checkBox1);    
    f.add(checkBox2);
	f.add(checkBox3);    
    f.add(checkBox4);
	f.setSize(1950,1080);  
	f.setLayout(null);  
	f.setVisible(true);


		
		
		
		l1.setFont(myFont);
		l1.setBounds(800,300,550,40);
		
		

		
		
		/*ch=sc.next().charAt(0);
		
		
		s5=bf1.readLine();//reading the answer from the answer file
		ch1=s5.charAt(0);
		if(ch==ch1)//comparing the input answer with the correct answer
		{
			System.out.println("correct answer");
			score++;
		}
		else
		{
			System.out.println("wrong answer");
			break;
		}*/
		 
		 checkBox1.setFont(myFont);
		 checkBox2.setFont(myFont);
		 checkBox3.setFont(myFont);
		 checkBox4.setFont(myFont);
		
		 
		 
		 
		 
		
		 
		 b.addActionListener(new ActionListener()
		 {  
			public void actionPerformed(ActionEvent e)
			{
				String s="",s1="",s2="",s3="",s4="",s5="";
				try
				{
				s=bf.readLine();//reading the question
				
				s1=bf.readLine();//reading option a from question file 
		
				s2=bf.readLine();//reading option b from question file
		
				s3=bf.readLine();//reading option c from question file
		
				s4=bf.readLine();//reading option d from question file
				
				l1.setText(s);
				checkBox1.setLabel(s1);
				checkBox2.setLabel(s2);
				checkBox3.setLabel(s3);
				checkBox4.setLabel(s4);
				l1.setBounds(80,50,550,40);
				checkBox1.setBounds(100,100, 450,50);
				checkBox2.setBounds(100,150, 450,50);
				checkBox3.setBounds(100,200, 450,50);
				checkBox4.setBounds(100,250, 450,50);
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
	
    
	
	
    
	
}  
}