import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String of your choice: " );
		String str1 = scan.nextLine();
		System.out.println("Enter another string of your choice to check: " );
		String str2 = scan.nextLine();
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		
		
		//conversion into Array and then sorting.----> for str1
		char[] ch1 = new char[str1.length()];
		//storing in charArray
		for(int i = 0; i < str1.length(); i++)
		{
			ch1[i] = str1.charAt(i);
		}
		//sorting part
		for(int i = 0; i < ch1.length; i++)
		{
			for(int j = 1; j < ch1.length; j++)
			{
				if(ch1[j] < ch1[i])
				{
					//swapping will be done here.
					char temp = ch1[j];
					ch1[j] = ch1[i];
					ch1[i] = temp;
				}
			}
		}
		
		//conversion into Array and then sorting. -----> for str2
		char[] ch2 = new char[str2.length()];
		//storing in charArray
		for(int i = 0; i < str2.length(); i++)
		{
			ch2[i] = str2.charAt(i);
		}
		//sorting part
		for(int i = 0; i < ch2.length; i++)
		{
			for(int j = 1; j < ch2.length; j++)
			{
				if(ch2[j] < ch2[i])
				{
					//swapping will be done here
					char temp = ch2[j];
					ch2[j] = ch2[i];
					ch2[i] = temp;
				}
			}
		}
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("It's an Anagram");
		}
		else
		{
			System.out.println("It's not an Anagram");
		}
        scan.close();
	}

}
