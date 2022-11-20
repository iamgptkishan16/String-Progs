import java.util.*;
class Launch
{
	public static String removeDuplicate(char[] ch, int n)
	{
		int index = 0;
		for(int i = 0; i < n; i++)
		{
			int j;
			for(j = 0; j < n; j++)
			{
				if(ch[i] == ch[j])
				{
					break;
				}
			}
			if(j==i)
			{
				ch[index++] = ch[i];
			}
		}
		return String.valueOf(Arrays.copyOf(ch, index));
	}
}


public class RemoveDupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		System.out.println("Entered String is: " + str);
		//Array representation of entered String is
		System.out.println("Entered string in Array form: ");
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			ch[i] = str.charAt(i);
		}
		for(char c : ch)
		{
			System.out.println(c);
		}
		int n = ch.length;
		String sc = Launch.removeDuplicate(ch, n);
		System.out.println(sc );
		
		scan.close();

	}

	

	

}