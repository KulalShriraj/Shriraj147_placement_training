package day5;
import java.util.*;
public class Ascii_ShiftArray {
	
	public static String ShiftString(String s,int[] shift)
	{
		String newString="";
		char shiftedchar;
		for(int i=0;i<shift.length;i++)
		{
			int unicode=s.charAt(i);
			if((unicode+shift[i])/123>0)
				shiftedchar=(char)((unicode+shift[i])%123+97);
			else
				shiftedchar=(char)(unicode+shift[i]);
			newString+=shiftedchar;
		}
		return (String)newString;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int[] shift=new int[s.length()];
		for(int i=0;i<s.length();i++)
			shift[i]=sc.nextInt();
		String shiftedString=ShiftString(s,shift);
		System.out.println(shiftedString);
	}

}
