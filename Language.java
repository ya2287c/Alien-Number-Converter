import java.util.Arrays;


public class Language 
{
	private char[] characterSet;
	public Language()
	{	
	}
	
	public Language(String s)			// method sets each unique character 
	{									// with a numeric value corresponding
		characterSet=s.toCharArray();	// to its position in the array
	}
	public int getSystemBase()			// method gives the numeric base of the 
	{						  			// system useful for converting numbers
		return characterSet.length;		// of different bases
	}
	public char charOf(int i)			// method gives symbol of the numeric
	{									// value in a given number language
		return characterSet[i];			// useful in calculating and conversions
	}
	public int valueOf(char c)			// method gives numeric value of
	{									// a given symbol for a given 
		for(int i=0;i<=characterSet.length;i++)		// number language
		{											// useful in initial and
			if(characterSet[i]==c)					// final conversions
			{
				return i;// returns value of a given symbol
			}
		}
		System.out.format("%c was not found", c);
		return -1;// will trigger an error because the character is not  
	}			  // is not part of the set of characters in this number language
	
	public @Override String toString() // method is used for debugging
	{
		return Arrays.toString(characterSet);
	}
}
