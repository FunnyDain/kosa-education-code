package day10.case3;

//객체 생성을 전담하는(대신해주는) 클래스명 Factory, builder
//객체명Factory
public class TVFactory {
	public static TV getTV(String beanName){
		TV obj = null;
		if(beanName.equals("samsung")){
			obj = new SamsungTV();
		} else if(beanName.equals("lg")){
			obj = new LgTV();
		}
		return obj;
	}

}
