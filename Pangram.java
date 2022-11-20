import java.util.*;
public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: " );
		String str = scan.nextLine();
		boolean[] alpha = new boolean[26];
		int index = 0;
		int flag = 1;
		for(int i = 0; i < str.length();  i++)
		{
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				index = str.charAt(i) - 'A';
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				index = str.charAt(i) - 'a';
			}
			alpha[index] = true;
		}
		
		for(int i = 0; i <=25; i++)
		{
			if(alpha[i] ==  false)
			{
				flag = 0;
			}
		}
		if(flag == 1)
		{
			System.out.println("Entered String is a Pangram");
		} 
		else {
			System.out.println("Entered String is not a Pangram");
		}
        scan.close();
	}

}
