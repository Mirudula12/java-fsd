public class Arrays {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
		
		System.out.println("Single dimensional array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		int arr1[][] = {{10,20,30},{40,50,60} };
		System.out.println("Multidimensional array:");
		for(int x=0;x<arr1.length;x++) {
			for(int y=0;y<arr1[x].length;y++) {
				System.out.println(arr1[x][y]);
			}
		}

	}

}
