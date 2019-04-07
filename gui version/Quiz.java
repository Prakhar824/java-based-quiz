import java.awt.*;  
import java.awt.event.*;  
import java.io.*;
import java.util.Scanner;
public class Quiz
{
	static void working(FileReader file1,FileReader file2,BufferedReader bf,BufferedReader bf1,Frame f)throws IOException
	{
		
		int i=0;
		String s="",s1="",s2="",s3="",s4="",s5="";
		int score=0;
		char ch,ch1;
		Font myFont = new Font("Serif",Font.ITALIC,22);
		
		
	
	while(true)
	{
		s=bf.readLine();//reading the question
		if (s==null)
		break;
		Label l1=new Label(s);
		l1.setFont(myFont);
		l1.setBounds(80,50,550,20);
		//System.out.println(s);
		
		
		s1=bf.readLine();//reading option a from question file 
		//System.out.println(s1);
		if (s1==null)
		break;
		
		s2=bf.readLine();//reading option b from question file
		//System.out.println(s2);
		if (s2==null)
		break;
		
		s3=bf.readLine();//reading option c from question file
		//System.out.println(s3);
		if (s3==null)
		break;
		
		s4=bf.readLine();//reading option d from question file
		//System.out.println(s4);
		if (s4==null)
		break;
		
		//System.out.println("Enter the correct option (a,b,c,d)");//taking answer as input
		//ch=sc.next().charAt(0);
		
		
		s5=bf1.readLine();//reading the answer from the answer file
		ch1=s5.charAt(0);
		/*if(ch==ch1)//comparing the input answer with the correct answer
		{
			System.out.println("correct answer");
			score++;
		}
		else
		{
			System.out.println("wrong answer");
			break;
		}*/
		 CheckboxGroup cbg = new CheckboxGroup();
		 Checkbox checkBox1 = new Checkbox(s1, cbg, false);
		 Checkbox checkBox2 = new Checkbox(s2, cbg, false);
		 Checkbox checkBox3 = new Checkbox(s3, cbg, false);
		 Checkbox checkBox4 = new Checkbox(s4, cbg, false);
		 checkBox1.setFont(myFont);
		 checkBox2.setFont(myFont);
		 checkBox3.setFont(myFont);
		 checkBox4.setFont(myFont);
		 checkBox1.setBounds(100,100, 450,50);
		 checkBox2.setBounds(100,150, 450,50);
		 checkBox3.setBounds(100,200, 450,50);
		 checkBox4.setBounds(100,250, 450,50);
		 f.add(l1);
		 f.add(checkBox1);    
         f.add(checkBox2);
		 f.add(checkBox3);    
         f.add(checkBox4);
		 
		 
		 
		f.setSize(1950,1080);  
		f.setLayout(null);  
		f.setVisible(true);
		 
		
	}
	
	
		
	}
	
	
	public static void main(String[] args) throws IOException
	{
		
		FileReader file1= new FileReader("../Question.txt");//file object for question file(change the file location where the file is saved)
		BufferedReader bf=new BufferedReader(file1);
		FileReader file2= new FileReader("../Answer.txt");// file object for answer file(change the file location where the file is saved)
		BufferedReader bf1=new BufferedReader(file2);
		
		Frame f=new Frame("Quiz");
		
		Button b=new Button("Next");  
		b.setBounds(1000,450,100,30);  
		
		f.add(b);
		f.setSize(1950,1080);  
		f.setLayout(null);  
		f.setVisible(true);
		
		b.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e)
		{
			 
			try 
			{
				working(file1,file2,bf,bf1,f);
			}
			catch(IOException z)
			{
				z.printStackTrace();
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
