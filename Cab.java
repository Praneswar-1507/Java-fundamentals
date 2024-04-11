package Com.task5;

public class Cab {

	public static void main(String[] args) {
	}

	public static double calculateCabFare(double distance, String cabType) {

		double cabRate = 0;
		switch (cabType) {
		case "Micro":
			cabRate = 10;
			break;
		case "Mini":
			cabRate = 15;
			break;
		case "Prime":
			cabRate = 20;
			break;
		default:
			return -1;
		}
		return distance * cabRate;
	}

	public static double Discount(double cabFare) {
		double discount = 0;
		if (cabFare > 5000) {
			discount = 0.05 * cabFare;
		} else if (cabFare > 2000) {
			discount = 0.02 * cabFare;
		}
		return discount;
	}
}
