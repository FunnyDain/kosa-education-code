package day9;

public class SaleTV extends TV{
	private int price;

	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public SaleTV() {};
	public SaleTV(int price, String model, int size, int channel) {
		super(model, size, channel);
		this.price = price;
	}

	public void play() {
		System.out.printf("판매 TV채널 %d번의 프로를 플레이 합니다.\n", getChannel());
	}
	
	public void sale() {
		System.out.printf("%s 모델의 상품을 판매합니다. %,d을 지불해주세요\n", getModel(), price);		
	}
	
	@Override
	public String toString() {
		return String.format("판매상품정보 : 모델명(%s), 가격(%,d원), 크기(%d)", getModel(), price, getSize());
	}
	
	
}
