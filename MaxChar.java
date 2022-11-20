import java.util.*;
class Max
{
	static final int ascii_size = 256;
	public static char maxOccuringElem(String str)
	{
		int[] count = new int[ascii_size];
		for(int i = 0; i < str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
		int max = -1;
		char res = ' ';
		for(int i = 0; i < str.length(); i++)
		{
			if(count[str.charAt(i)] > max)
			{
				max = count[str.charAt(i)];
				res = str.charAt(i);
			}
		}
		return res;
	}
}


public class MaxChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String of your choice: ");
		String str = scan.nextLine();
		//Max obj = new Max();
		System.out.println("Maximum Occuring Element: " + Max.maxOccuringElem(str));
		
		
        scan.close();
	}

}
