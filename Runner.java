import java.util.Scanner;


public class Runner {

	public static void main(String[] args) 
	{
		FileInput f= new FileInput();
		System.out.println("run small or large?");
		System.out.println("enter 'small' or 'large'");
		Scanner s =new Scanner(System.in);
		String filePick=s.next();
		if(filePick.equals("small"))
		{
			f.runFile("A-small-practice.in");
		}
		if(filePick.equals("large"))
		{
			f.runFile("A-large-practice.in");
		}
		
		s.close();

	}

}
