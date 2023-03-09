package day4;

public class TwoArrayTest2 {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		char a2[] = {'가', '나', '다'};
		double a3[] = new double[5];
		System.out.println(a1.length + " : "+a2.length + " : " + a3.length);		//10 : 3 : 5
		System.out.println(a1);			//[I@참조값
		System.out.println(a2);			//가나다, Character배열만 특별 취급
		System.out.println(a3);			//[D@참조값
		System.out.println(a1[0]);		//0
		System.out.println(a2[0]);		//가
		System.out.println(a3[0]);		//0.0
		System.out.println();
		
		int[][] a4 = new int[5][12];
		System.out.println(a4);
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		System.out.println(a4[2]);
		System.out.println(a4[3]);
		System.out.println(a4[4]);
		System.out.println();
		System.out.println(a4.length); 
		System.out.println(a4[0].length); 
		System.out.println(a4[1].length);
		System.out.println(a4[2].length);
		System.out.println(a4[3].length);
		System.out.println(a4[4].length);	
	}
}



