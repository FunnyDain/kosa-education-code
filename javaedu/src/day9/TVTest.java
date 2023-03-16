package day9;

public class TVTest {

	public static void main(String[] args) {
		TV saleTv = new SaleTV(300000,"SALETV-1",40,1);
		TV rentalTv = new RentalTV(100000,"RENTALTV-10",42,1);
		
		saleTv.channelUP();
		saleTv.channelUP();
		rentalTv.channelDown();
		rentalTv.channelDown();
		rentalTv.channelDown();
		printAllTV(saleTv);
		printAllTV(rentalTv);
		printRentalTV((Rentable)rentalTv);
	}
	
	static void printAllTV(TV tv) {
		System.out.println(tv.toString());
		if(tv instanceof SaleTV) {
			((SaleTV)tv).play();
			((SaleTV)tv).sale();			
		} 
		else
			((RentalTV)tv).play();	
	}
	
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
