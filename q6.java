package ass3A;

import java.util.*;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        Arrays.sort(arr); 
	        int min = arr[0];
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            if (arr[i] > 0) {
	                min = arr[i];
	                for (int j = i; j < n; j++) {
	                    arr[j] -= min; 
	                    if (arr[j] > 0) { 
	                        count++;
	                    }
	                }
	                System.out.println(count);
}
	        }
	}
}
