import java.util.*;
class Launch2
{
	public static boolean isPalindrome(String str)
	{
		String rev = "";
		boolean res = false;
		for(int i = str.length()-1; i >= 0; i--)
		{
			rev = rev + str.charAt(i);
		}
		if(str.equals(rev))
		{
			res = true;
		}
		return res;
	}
}
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be checked");
		String str = scan.nextLine();
		//str = str.toLowerCase();
		
		boolean val = Launch2.isPalindrome(str);
		//boolean val = isPalindrome(str);
		System.out.println(val);
		scan.close();

	}

}
