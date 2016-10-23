
public class FoorLoopGauntlet {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		for (int i = 2; i < 100; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 99; i += 2) {
			System.out.println(i);
		}
		for (int i = 1; i < 500; i++) {

			if (i % 2 == 0) {
				System.out.println(i + "even");
			} else {
				System.out.println(i + "odd");
			}
		}
		for (int i = 0; i < 112; i++) {
			System.out.println(i * 7);
		}
		for (int i = 2001; i < 2016; i++) {
			System.out.println("in " + i + " I was " + (i - 2001) + " year(s) old. ");
		}
		for (int i = 0; i < 3; i++) {
			for (int x = 0; x < 3; x++) {
				System.out.println(i + " " + x);
			}
		}
		for (int x = 1; x < 10; x += 3) {
			System.out.println(x + "" + (x + 1) + "" + (x + 2));
		}
		System.out.println("");

		for (int i = 0; i < 10; i++) {
			for (int x = 0; x < 10; x++) {
				System.out.print(i + "" + x + " ");

			}
			System.out.println(" ");
		}

		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < i; x++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
