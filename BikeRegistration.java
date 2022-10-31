//BikeRegistration.class
public class BikeRegistration {
	public static void main(String args[]) {
		Bike b1, b2;
		String n1, n2;
		b1 = new Bike();
		b1.setName("Adams Smith");
		b1.setTagNo("2000-134R");
		
		b2 = new Bike();
		b2.setName("John Jones");
		b2.setTagNo("2010-167T");
		
		n1 = b1.getName();
		n2 = b2.getName();
		
		System.out.println(n1 + " owns a bike " + b1.getTagNo());
		System.out.println(n2 + " also owns a bike " + b2.getTagNo());
	}
}
