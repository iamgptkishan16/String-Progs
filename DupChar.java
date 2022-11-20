import java.util.*;
public class DupChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		System.out.println("Entered String in Array Form: ");
		int count;
		char[] ch = new char[str.length()];
		for(int i = 0; i < str.length(); i++)
		{
			ch[i] = str.charAt(i);
		}
		for(char c : ch)
		{
			System.out.println(c);
		}
		
		System.out.println("Repeated Characters are: ");
		
		for(int i = 0; i < ch.length; i++)
		{
			count = 1;
			for(int j = i+1; j < ch.length; j++)
			{
				if(ch[i] == ch[j] && ch[i] != ' ')
				{
					count++;
					ch[j] = '0';
				}
			}
			if(count > 1 && ch[i] != '0')
				System.out.println(ch[i]);
		}
		
         scan.close();
		
	}

}
