 //Quiz
import java.io.*;
import java.util.Scanner;
public class Quiz
{
	public static void main(String args[])throws IOException
	{
		int i=0;
		String s="",s1="";
		int score=0;
		char ch,ch1;
		Scanner sc=new Scanner(System.in);
		FileReader f= new FileReader("./Question.txt");//file object for question file(change the file location where the file is saved)
		BufferedReader bf=new BufferedReader(f);
		FileReader f1= new FileReader("./Answer.txt");// file object for answer file(change the file location where the file is saved)
		BufferedReader bf1=new BufferedReader(f1);
		while(true)
		{
		s=bf.readLine();//reading the question
		if (s==null)
		break;
		System.out.println(s);
		
		
		s=bf.readLine();//reading option a from question file 
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option b from question file
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option c from question file
		System.out.println(s);
		if (s==null)
		break;
		
		s=bf.readLine();//reading option d from question file
		System.out.println(s);
		if (s==null)
		break;
		
		System.out.println("Enter the correct option (a,b,c,d)");//taking answer as input
		ch=sc.next().charAt(0);
		
		
		s1=bf1.readLine();//reading the answer from the answer file
		ch1=s1.charAt(0);
		if(ch==ch1)//comparing the input answer with the correct answer
		{
			System.out.println("correct answer");
			score++;
		}
		else
		{
			System.out.println("wrong answer");
			break;
		}
		
		}
		System.out.println("Your score is "+score);//displaying the score
	}
}