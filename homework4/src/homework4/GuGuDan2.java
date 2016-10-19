package homework4;

public class GuGuDan2 {
	void A05() {
		while (true) {
			System.out.println("E:Â¦¼ö´Ü, O:È¦¼ö´Ü(Q:Á¾·á) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			if (input.equalsIgnoreCase("o")) {
				for (int i = 1; i < 10; i++) {
					for (int j = 3; j < 10; j += 2) {
						System.out.printf("%d * %d = %d\t", j, i, j * i);
					}
					System.out.println("");
				}
			}
			if (input.equalsIgnoreCase("e")) {
				for (int i = 1; i < 10; i++) {
					for (int j = 2; j < 9; j += 2) {
						System.out.printf("%d * %d = %d\t", j, i, j * i);
					}
					System.out.println("");
				}
			}
		}
	}
}
