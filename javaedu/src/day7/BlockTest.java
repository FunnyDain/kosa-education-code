package day7;
public class BlockTest {
	//static 블럭
	static {
		System.out.println("static 블럭 수행");
	}
	
	//instance 블럭
	{
		System.out.println("instance 블럭 수행");
	}
	
	//생성자 블럭
	public BlockTest() {     
		System.out.println("생성자 수행");
	}
	public static void main(String args[]) {
		System.out.println("BlockTest bt = new BlockTest(); ");
		BlockTest bt = new BlockTest();
		System.out.println(bt);
		System.out.println("BlockTest bt2 = new BlockTest(); ");
		BlockTest bt2 = new BlockTest();
		System.out.println(bt2);
	}
}
