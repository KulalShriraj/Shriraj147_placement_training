import java.util.*;
public class N_girlfriend {
	public static int no_of_ways(int days)
	{
		if(days==1)
			return 1;
		else
			return days*no_of_ways(days-1);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no_days=sc.nextInt();
		int no_ways=no_of_ways(no_days);
		System.out.println(no_ways);
		
	}

}
