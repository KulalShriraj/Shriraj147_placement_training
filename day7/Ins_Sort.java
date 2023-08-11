package day7;
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {


    public static void insertionSort1(int n, List<Integer> arr) {
    int key = arr.get(n - 1);
    int j = n - 2;
    
    while (j >= 0 && key < arr.get(j)) {
        arr.set(j + 1, arr.get(j)); 
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    arr.set(j + 1, key); 
    
    for (int num : arr) {
        System.out.print(num + " ");
    }
    System.out.println();
}
}
public  class Ins_Sort {

		public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        Result.insertionSort1(n, arr);

	        bufferedReader.close();
	    }
	}


