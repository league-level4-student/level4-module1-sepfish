package _03_Switch_Statement_Practice;

public class Warmup {
	final static float smallNumber = 0.0001f;
	public static void main(String[] args) {
		if ((0.1 + 0.2) == 0.3) {
			System.out.println("A");
		}
		System.out.println(0.1 + 0.2);
		if ((0.2 + 0.2) == 0.4) {
			System.out.println("B");
		}
		System.out.println(0.2 + 0.2);
		if ((0.3 + 0.2) == 0.5) {
			System.out.println("C");
		}
		System.out.println(0.3 + 0.2);
		if ((0.4 + 0.2) == 0.6) {
			System.out.println("D");
		}
		System.out.println(0.4 + 0.2);
		
		if (0.3 - (0.1 + 0.2) < smallNumber) {
			System.out.println("They are equal");
		}
	}
}
