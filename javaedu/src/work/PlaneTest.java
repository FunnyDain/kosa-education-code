package work;

public class PlaneTest {

	public static void main(String[] args) {
		Plane[] fly = new Plane[2];
		fly[0] = new Airplane("L747",1000);
		fly[1] = new Cargoplane("C40",1000);

		printlnfo(fly);
		for(Plane f: fly) {
			f.flight(100);
		}
		System.out.println("\n[100운항]");
		printlnfo(fly);

		for(Plane f: fly) {
			f.refuel(200);
		}
		System.out.println("\n[200주유]");
		printlnfo(fly);
	}

	public static void printlnfo(Plane[] list) {
		System.out.println("Plane\tfuelSize\n--------------------");
		
		for(Plane p : list) {
			System.out.printf("%s\t%d\n",p.getPlaneName(),p.getFuelSize());
		}		
	
	}
}
