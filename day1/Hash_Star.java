import java.io.*;
import java.util.*;
public class Hash_Star {

	public static void main(String[] args) {
		String input;
		int no_star=0,no_hash=0;
		Scanner sc=new Scanner(System.in);
		input=sc.next();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='#')
				no_hash++;
			else
				no_star++;
		}
		System.out.println(no_star-no_hash);
	}

}
