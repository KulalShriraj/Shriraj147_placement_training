package day3;
import java.util.*;
public class Pair_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer> l1=new ArrayList<Integer>();
		String[] input=sc.nextLine().split(" ");
		for(int i=0;i<input.length;i++)
			l1.add(Integer.parseInt(input[i]));
		int key=sc.nextInt();
		Iterator<Integer> it=l1.iterator();
		while(it.hasNext())
		{
			int element=it.next();
			int needed=key-element;
			if(l1.contains(needed))
			{
				System.out.println(element+","+needed);
				it.remove();
			}
		}
	}

}
