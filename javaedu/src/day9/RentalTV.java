package day9;

public class RentalTV extends TV implements Rentable{

	private int price;

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public RentalTV(){};
	public RentalTV(int price, String model, int size, int channel){
		super(model, size, channel);
		this.price = price;
	}
	
	public void play() {
		System.out.printf("대여 TV채널 %d번의 프로를 플레이 합니다.\n", getChannel());
	}
	

	@Override
	public void rent() {
		System.out.printf("%s 모델의 상품을 대여합니다. %,d을 지불해주세요\n", getModel(), price);	
	}
	
	@Override
	public String toString() {
		return String.format("대여상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}
}

