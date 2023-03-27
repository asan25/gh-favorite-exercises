package Asan;

public class Practicing {

	public static void main(String[] args) {
		
		
		/*int a  = 125;
		float b = (float)a;
		System.out.println(b);
		
		System.out.printf("%s's is the name and %d is the my age and %s is my birthday%n","Asan",30,"12/2/2022");
		
		int number=10;
		int sum=0;
		for(int i=number;i>=1;i--) {
			sum=sum+i;
		}
		System.out.println(sum);*/
		
		
		String textInput  = "This task is hard to be completed";
		int counterWords = 0;
		int longestWord = 0;
		int currentWordLength = 0;
		
		for(int index = 0; index<textInput.length(); index++) {
			
			if(textInput.charAt(index) != ' ') {
				if (currentWordLength == 0) {
					counterWords++;
				}
				currentWordLength++;
			}
			
			else {
				longestWord = longestWord > currentWordLength ? longestWord : currentWordLength;
				currentWordLength = 0;
			}
		}
		
		longestWord = longestWord > currentWordLength ? longestWord : currentWordLength;
		System.out.printf("%d words, %d symbol(s) is the longest word", counterWords, longestWord);
		
		
	}

}
