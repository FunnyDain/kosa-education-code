package day12;

import java.io.File;
import java.util.Date;

public class FileTest2 {
	public static void main(String[] args) throws Exception {
		File dir = new File(args[0]);
		if (!dir.exists() || !dir.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			return;
		}
		long time = new Date().getTime();		//getTime() : timestamp시간, 밀리세컨즈단위
		String newFileName = "temp" + time + ".tmp";
		File file = new File(dir, newFileName);
		if (file.createNewFile())
			System.out.println(newFileName + "명의 파일이 생성되었습니다.");
		else
			System.out.println(newFileName + "명의 파일이 이미 존재합니다.");
	}
}
