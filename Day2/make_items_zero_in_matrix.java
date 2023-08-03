package placement_preperation;

import java.util.*;

public class make_items_zero_in_matrix {

	public static void main(String[] args) {
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the m*n ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr1[][]=new int[30][30];
		int row[]=new int[30];
		int col[]=new int[30];
		System.out.println("Enter the m*n matrix ");
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				arr1[i][j]=sc.nextInt();
			}
			}
		
		
		
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(arr1[i][j]==0) {
					row[i]=1;
					col[j]=1;
				}
				}
		}
		
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				if(row[i]==0||col[j]==0) {
					arr1[i][j]=9;
				}
				System.out.print(arr1[i][j]);
					
				}
			System.out.println();
			
			}
		
		
		
		
		
		

	}

}
