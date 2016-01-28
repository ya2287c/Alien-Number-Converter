import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class FileInput 
{
	public FileInput()
	{
	}
	
	public void runFile(String DataSet)		//takes in file name
	{
		File f= new File(DataSet);			//creates new file (pointer)
		try {
			Scanner fileContents= new Scanner(f);	//used to access contents of file
			NumberConverter calculator= new NumberConverter();
			calculator.getNumber(fileContents);				//calculates number
			fileContents.close();
		} catch (FileNotFoundException e) {
			System.out.format("%s was not Found in %s\n",f, System.getProperty("user.dir"));
			e.printStackTrace();
		}
	}
}
