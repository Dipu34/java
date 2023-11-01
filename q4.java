package ass3A;

public class q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr []= {2,4,6,1,3,5};
System.out.println("array:");
for(int i=0;i<arr.length-1;i++) {
	System.out.print(arr[i]+"");
}
arr=q4(arr);
System.out.println("after array:");
for (int i=0;i<arr.length-1;i++) {
	System.out.print(arr[i]+"");
}
	}
	public static int[]q4(int arr[]){
	int first=0;
	int last=arr.length-1;
	for(int i=0;i<arr.length-1;i++) {
		while(arr[first]%2==1) {
		first++;
	}
		while(arr[last]%2==0) {
			last--;
		}

	if(first<last) {
		int temp=arr[first];
		arr[first]=arr[last];
		arr[last]=temp;
	}
}
return arr;
}

}