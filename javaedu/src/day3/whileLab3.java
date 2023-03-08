package day3;

public class whileLab3 {

	public static void main(String[] args) {

		int count = 0;
		//A = 65
		while(true) {
			int num = (int)(Math.random()*30);
			char num2 = (char)(num + 64);
			if(num == 0 || (num>=27&&num<=30)){
				System.out.printf("출력횟수는 %d번입니다.",count);
				break;
			}else {
				System.out.printf("%d-%c,%d,%#x",num,num2,(int)num2,(int)num2);
				System.out.println();
				count++;
			}
		}
		
	}

}
