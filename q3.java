 package ass3A;

public class q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,2,3,4,1};
int n=arr.length;
int k=3;
System.out.print(q3(arr, n, k) + "\n");

	}
public	static int q3(int arr[], int n, int k) {
		 
	int count = 0;
    for (int i = 0; i < n; ++i)
    if (arr[i] <= k)
        ++count;
    int bad = 0;
    for (int i = 0; i < count; ++i)
    if (arr[i] > k)
        ++bad;
    int ans = bad;
    for (int i = 0, j = count; j < n; ++i, ++j) {
    if (arr[i] > k)
        --bad;
    if (arr[j] > k)
        ++bad;
    ans = Math.min(ans, bad);
    }
    return ans;
}		
	}


