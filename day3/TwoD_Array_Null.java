package day3;
import java.util.*;

public class TwoD_Array_Null {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[] rows=new int[row];
		int[] cols=new int[col];
		int[][] arr=new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				arr[i][j]=sc.nextInt();
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(arr[i][j]==0)
				{
					rows[i]=1;
					cols[j]=1;
				}
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(rows[i]==1||cols[j]==1)
					arr[i][j]=0;
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}

}
