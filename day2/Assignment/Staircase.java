package day2;

import java.io.*;
import java.util.*;


class Result {


    public static void staircase(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
                sb.append(" ");
            for(int k=0;k<i;k++)
                sb.append("#");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }

}

public class Staircase {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Result.staircase(n);
    }
}
