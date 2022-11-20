import java.util.*;
class Launch44
{
	boolean isUniqueCharacter(String str) {
		//conversion to charArray and then sorting
	    char[] ch = new char[str.length()];
	    //storing into the array
	    for(int i = 0; i < ch.length; i++)
	    {
	    	for(int j = 1; j < ch.length; j++)
	    	{
	    		ch[i] = str.charAt(i);
	    	}
	    }
	    
	    //checking part
	    for(int i = 0; i < ch.length-1; i++)
	    {
	    	if(ch[i] != ch[i+1])
	    	{
	    		continue;
	    	}
	    	else
	    	{
	    		return false;
	    	}
	    }
	    return true;
	    
	}

	
}
public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String to be checked: ");
		String str = scan.nextLine();
		
		Launch44 obj = new Launch44();
		if(obj.isUniqueCharacter(str))
		{
			System.out.println("Strign haS unique characters");
		} else
		{
			System.out.println("Strig has repeated chaaracters");
		}
        scan.close();
	}

}
