package ass3A; 
import java.util.Arrays;
public class q1 {
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int arr[]= {1,0,1,0,0,0,1,1,1,0};
	  System.out.println("original array:");

	  for(int i=0;i<arr.length-1;i++) {
		   System.out.print(arr[i]+" ");
		}

	arr=q1(arr);
	System.out.println("array after separating array:");
	for(int i=0;i<arr.length;i++) {
		
	System.out.print(arr[i]+" ");
	}
	}
	public static int []q1(int arr[]){
		int left=0;
		int right=arr.length-1;
		Arrays.sort(arr);
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



