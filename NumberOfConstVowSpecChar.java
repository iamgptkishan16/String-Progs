import java.util.*;
public class NumberOfConstVowSpecChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: " );
		String str = scan.nextLine();
		str = str.toLowerCase();
		
		int countV = 0;
		int countC = 0;
		int countS = 0;
		for(int i = 0; i < str.length(); i++)
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' )
			{
				countV++;
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				countC++;
			}
			else if(!Character.isDigit(str.charAt(i)) && !Character.isLetter(str.charAt(i)) && !Character.isWhitespace(str.charAt(i)))
			{
				countS++;
			}
		}
		if(countC == 0)
		{
			System.out.println("No Consonant found!");
		} else {
			System.out.println("Number of Consonant: " + countC);
		}
		if(countV == 0)
		{
			System.out.println("No Vowels found!");
		} else {
			System.out.println("Number of Vowels: " + countV);
		}
		if(countS == 0)
		{
			System.out.println("No Special Characters found!");
		} else {
			System.out.println("Number of Special Characters: " + countS);
		}
		
        scan.close();
	}

}
