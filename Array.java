public class Array {
	public static void main(String[] args) {
		int[] arr = new int[] {5,10,15,20,25,30,35,40,45,50};
		
		int sum = sum(arr);
		
		System.out.print(sum);
		
		

	}
	
	public static int sum(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			temp += arr[i];		
		}
		return temp;
		
	}

}
