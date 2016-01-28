import java.util.ArrayList;
import java.util.Scanner;


public class NumberConverter 
{
	String targetSymbols;
	public NumberConverter() 
	{
		targetSymbols="";
	}
	
	public void getNumber(Scanner data) 
	{
		int cases= data.nextInt();
		for(int i=1;i<=cases;i++)
		{
			System.out.format("Case #%d: ",i);
			char[] sourceNum=data.next().toCharArray();  
			Language sourceLang= new Language(data.next());
			int number= getNumber(sourceNum,sourceLang);
			Language targetLang= new Language(data.next());
			targetSymbols=TargetNumber(number,targetLang);
			System.out.format("%s\n",targetSymbols);
		}
	}

	private String TargetNumber(int num, Language lang) 
	{
		String finalNumber = null;
		ArrayList<Integer> characters= baseConversion(num, lang.getSystemBase());
		finalNumber= symbolicForm(characters, lang);
		return finalNumber;
	}

	private String symbolicForm(ArrayList<Integer> charSet, Language lang) 
	{
		String targt = "";
		for(int i:charSet)
		{
			targt+=lang.charOf(i);
		}
		targt=new StringBuilder(targt).reverse().toString();/// this step could have been done anywhere
		return targt;
	}

	private ArrayList<Integer> baseConversion(int num, int base) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		
		while(base<=num)
		{
			int characterValue=num%base;
			numbers.add(characterValue);
			num=num/base;
		}
		numbers.add(num);
		
		
		return numbers;
	}

	private int getNumber(char[] number,Language lang) 
	{
		int numeric = 0;
		for(int i=0;i<number.length;i++)
		{
			numeric+=lang.valueOf(number[i])
					*Math.pow(lang.getSystemBase(), number.length-i-1);
			
		}
		return numeric;
	}

}
