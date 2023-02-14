
public class Ar_inversion {
	static int arr[]=new int[] {1,9,6,4,5};
	static int getInvcount(int n)
	{
		int invcou=0;
		for(int i=0;i<n-1;i++)
		for(int j=i+1;j<n;j++)
			if(arr[i]>arr[j])
			invcou++;
		return invcou;
	
	}

	public static void main(String[] args) {
		System.out.println("Number of inversions are:" +getInvcount(arr.length));
		
	}

}
