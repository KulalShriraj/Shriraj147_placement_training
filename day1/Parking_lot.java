import java.util.*;
public class Parking_lot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int[][] array=new int[3][3];
		int m=sc.nextInt(),n=sc.nextInt();
		int sum=0,max=0,row=0;
		for(int i=0;i<m;i++)
		{
			sum=0;
			for(int j=0;j<n;j++)
			{
				int input=sc.nextInt();
				sum+=input;
			}
			if(sum>max)
			{
				max=sum;
				row=i;
			}
			
		}
		System.out.println(row+1);
	}

}
