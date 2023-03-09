package day4;

public class TwoArrayTest1 {
	public static void main(String[] args) {
		int[][] two = new int[2][10];
		System.out.println(two);
		System.out.println(two[0]);
		System.out.println(two[0][0]);	
		System.out.println(two.length);
		System.out.println(two[0].length);
		
		for(int row=0;row < two.length;row++) {		//2번 반복
			for(int col=0; col < two[row].length; col++)	//10번 반복, 각 행의 열의 갯수만큼 
				System.out.print(two[row][col]+" ");
			System.out.println();
		}
	}
}



