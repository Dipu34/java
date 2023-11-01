package ass3A;

import java.util.Arrays;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,2,1,2,0,0,0};
System.out.println("array:");
for(int i=0;i<arr.length-1;i++) {
	System.out.print(arr[i]+" ");
}

arr=q2(arr);
System.out.println("after array:");
for(int i=0;i<arr.length-1;i++) {
	Arrays.sort(arr);
System.out.print(arr[i]+"");
	}
} 

public static int[]q2(int arr[]){
	int left=0;
	int right=arr.length-1;
	for(int i=0;i<arr.length-1;i++) {
		while(arr[left]%2==0) {
			left++;
		}
		while(arr[right]%2==1) {
			right--;
		}
		if(left<right) {
			int temp=arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
		}
	}
	return arr;
}
}