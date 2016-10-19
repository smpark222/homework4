package homework4;

public class GuGuDan {
	void A04(){
		while (true) {
			System.out.println("출력하고 싶은 단(Q:종료) >> ");
			String input = new ExamForWhile().input();
			if (input.equalsIgnoreCase("q")) {
				break;
			}
			int inputNum = Integer.parseInt(input);
			if (inputNum < 2 || inputNum > 9)
				System.out.println("==> 잘못입력");
			else {
				for (int i = 1; i < 9; i += 2) {
					System.out.printf("%d * %d = %d\t", inputNum, i, inputNum * i);
					System.out.printf("%d * %d = %d\n", inputNum, i + 1, inputNum * (i + 1));
				}
				System.out.printf("%d * 9 = %d\n", inputNum, inputNum * 9);
			}
		}
	}
}
