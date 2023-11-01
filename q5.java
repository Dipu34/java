package ass3A;

import java.util.Arrays;

public class q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[]= {1,2,4,6,6,};
int arr2[]= {1,2,6};
sortByOrder(arr1, arr2);

System.out.println(Arrays.toString(arr1));

	}
	 public static void sortByOrder(int[] arr1, int[] arr2) {
	       
	        int[] a = new int[1001];
	        for (int num : arr1) {
	            a[num]++;
	        }
	        int idx = 0;
	        for (int num : arr2) {
	            while (a[num] > 0) {
	                arr1[idx++] = num;
	                a[num]--;
	            }
	        }
	        for (int i = 0; i < a.length; i++) {
	            while (a[i] > 0) {
	                arr1[idx++] = i;
	                a[i]--;
	            }
	        }
	 }
}
	    


