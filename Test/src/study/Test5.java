package study;

public class Test5 {

	public static void main(String[] args) {
		
		int arr[][] = new int[4][];
		int n=1;
		
		arr[0] = new int [4];
		arr[1] = new int [3];
		arr[2] = new int [2];
		arr[3] = new int [1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
