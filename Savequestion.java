//save question 
import java.io.*;
import java.util.Scanner;
public class Savequestion
{
	public static void main(String args[])throws IOException
	{
		int i=0;
		String q="";
		char ch;
		FileWriter f= new FileWriter("./Question.txt",true);//file object for question file (change the file location where you want to save the file)
		BufferedWriter bf=new BufferedWriter(f);
		FileWriter f1= new FileWriter("./Answer.txt",true);// file object for answer file(change the file location where you want to save the file)
		BufferedWriter bf1=new BufferedWriter(f1);
		FileWriter f2= new FileWriter("./CO.txt",true);//file object for question file (change the file location where you want to save the file)
		BufferedWriter bf2=new BufferedWriter(f2);
		Scanner sc=new Scanner(System.in);
		
		bf.write("\n");
		System.out.println("Enter the question");
		q=sc.nextLine();//taking question as input
		bf.write(q);//writing question to the question file
		bf.write("\n");
		
		System.out.println("Enter option (a)");
		q=sc.nextLine();//taking option a as input
		bf.write("(a) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (b)");
		q=sc.nextLine();//taking option b as input
		bf.write("(b) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (c)");
		q=sc.nextLine();//taking option c as input
		bf.write("(c) ");
		bf.write(q);//writing to the question file
		bf.write("\n");
		
		System.out.println("Enter option (d)");
		q=sc.nextLine();//taking option d as input
		bf.write("(d) ");
		bf.write(q);//writing to the question file
		//bf.write("\n");
		
		System.out.println("Enter CO of the question(1,2,3,4)");
		q=sc.nextLine();//taking option d as input
		bf2.write("CO");
		bf2.write(q);//writing to the question file
		bf2.write("\n");
		
		System.out.println("Enter the correct option (a,b,c,d)");
		ch=sc.next().charAt(0);//taking answer as input
		bf1.write("\n");
		bf1.write(ch);//writing to the answer file
		
		
		
		bf.close();//closing question file
		bf1.close();//closing answer file
		bf2.close();//closing the CO file
	}
}