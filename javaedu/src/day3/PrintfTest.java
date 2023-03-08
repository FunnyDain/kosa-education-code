package day3;
public class PrintfTest {
	public static void main(String[] args) {
		System.out.printf("테스트입니당%n");	
		System.out.printf("테스트%d입니당\n",10);		
		System.out.printf("테스트입니당%n");
		System.out.printf("%d %x %o %c\n", 100, 100, 100, 100);
		System.out.printf("%d %1$x %1$o %1$c\n", 100);			//1$ : 100을 똑같이 줌
		System.out.printf("0x%X 0x%x\n",(int)'가',(int)'각');		//%X : 대문자, %x: 소문자, (int)안주면 error : 정수형에 특화됐기에
		System.out.printf("%c %c %c %c\n", '가', 'A', '!', '3');
		System.out.printf("%b\n", true);	//%b : boolean
		System.out.printf("%f %e\n", 100.0, 100.0);
		System.out.printf("%.2f\n", 123.5678);		//기본적으로 반올림이 적용된다.
		System.out.printf("|%s|\n", "자바");
		System.out.printf("|%10s|\n", "자바");		//| : 파이프 기호, 오른쪽 정렬, 10글자
		System.out.printf("|%-10s|\n", "자바");		//왼쪽 정렬, 10글자
		System.out.printf("%,d원\n", 1000000);		//1000단위마다 ,

	}
}








