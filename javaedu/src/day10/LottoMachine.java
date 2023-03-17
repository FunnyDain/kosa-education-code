package day10;

import java.util.Random;

public class LottoMachine {
	private int[] nums;
	
	public LottoMachine() {
		nums = new int[6];
	}
	public void createLottoNums() {
		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			nums[i] = random.nextInt(20) + 1;
		}
	}
	
	
	public void checkLottoNums() throws DuplicateException{
		
		//중복 검사 하는 방법은 여러가지가 있음
		int check = nums[0];		//기준
		
		for (int i = 1; i < nums.length; i++) {
			for (int j = i; j < nums.length; j++) {
				if(check == nums[i]) {
					throw new DuplicateException();
				}
			}
			check = nums[i];
		}
	}
	
	public int[] getNums() {
		return nums;
	}
	
	
	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	
	
	
}

