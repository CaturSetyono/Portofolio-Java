public class StringComparisonExample {
	public static void main(String args[]) {
	String tv = "Bravia";
	String television = "Bravia";
	// menggunakan equals
	if (tv.equals(television)) {
	System.out.println("Both tv and television contains same letters and equal by equals method of String");
	}

	// mengunakan compareTo
	if (tv.compareTo(television) == 0) {
	System.out.println("Both tv and television are equal using compareTo method of String");
	}
	television = "BRAVIA";
	// menggunakan equalsIgnoreCase
	if (tv.equalsIgnoreCase(television)) {
	System.out.println("tv and television are equal by equalsIgnoreCase method of String");
	}
	// menggunakan compareToIgnoreCase
	if (tv.compareToIgnoreCase(television) == 0) {
	System.out.println("tv and television are same by compareToIgnoreCase of String");
	}
	String sony = "Sony";
	String samsung = "Samsung";
	// menggunakan compareTo
	if (sony.compareTo(samsung) > 0) {
	System.out.println("Sony comes after Samsung in lexicographical order");
	} else if (sony.compareTo(samsung) < 0) {
	System.out.println("Sony comes before Samsung in lexicographical order");
	}
}
}
