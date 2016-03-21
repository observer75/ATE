package ATE;

public class Strings {

	public Strings() {
		// TODO Auto-generated constructor stub
	}
	
	public int getNumberOfWords(String inputString)
	{
		int numberOfChars = 0;
		int wordCount = 0;
		int StringLenght = inputString.length(); 
		for (int y = 0; y < StringLenght; y++) 
		{
			if (inputString.charAt(y) != ' ' && (inputString.charAt(y) != '_')) {
				numberOfChars++;
			} else if (numberOfChars != 0) {
				wordCount++;
				numberOfChars = 0;
			}
		//	
		}
		return wordCount+1;
	}
	
}
